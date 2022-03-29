package io.nwdaf.analytics.response.builders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import io.nwdaf.analytics.api.Targets;
import io.nwdaf.analytics.model.EventFilter;
import io.nwdaf.analytics.model.NFType;
import io.nwdaf.analytics.model.NfLoadLevelInformation;
import io.nwdaf.analytics.model.Supi;
import io.nwdaf.analytics.model.TargetUeInformation;
import net.minidev.json.JSONArray;

public class NfLoadLevelResponseBuilder {
	
	public NfLoadLevelResponseBuilder() {
		
	}
	
	public List <NfLoadLevelInformation> nfLoadLevelInformation(EventFilter eventFilter, TargetUeInformation tgtUe) {
		List <NfLoadLevelInformation> nfLoadLevelInformation = new ArrayList<NfLoadLevelInformation>();
		
		Boolean anyUe = tgtUe.isAnyUe();
		if(anyUe) {
			//Find all the UEs of the given area
			//String command = "curl http://150.140.195.253:9090/api/v1/query?query=netdata_UE_STATS_GNODEB_bps_average -o /home/gctz/Desktop/Diplwmatikh/Multi_TS/Analytics_info/prometheus_yaml_files/test.json";
			String command = "curl "+new Targets().getPapajohnVm1GenericvnfVm1Prometheus()+"/api/v1/query?query=netdata_cgroup_cpu_per_core_percentage_average";
			Process process;
			String result = null;
			try {
				process = Runtime.getRuntime().exec(command);
				//process.getInputStream();
				result = new BufferedReader(
                           new InputStreamReader(process.getInputStream()))
                               .lines()
                               .collect(Collectors.joining("\n"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			String json = result;
			Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);
			String query = "$.data.result[*].metric.chart";
			ArrayList<String> charts = JsonPath.read(document, query);
			ArrayList<String> chartsUnique = new ArrayList<String>();
			for(int j=0; j<charts.size(); j++) {
				String currentInfo = charts.get(j);
				String[] onlyCGroup = currentInfo.split("[.]");
				String currentCGroup = onlyCGroup[0];
				if(!chartsUnique.contains(currentCGroup)) {
					chartsUnique.add(currentCGroup);
				}
			}
			
			
			
			String allGroupValuesQuery = "$.data.result[*].value[1]";
			JSONArray allGroupValues = JsonPath.read(document, allGroupValuesQuery);
			
			for(int i=0; i<chartsUnique.size(); i++) {
				String allGroupItemsQuery = "$.data.result[*].metric[?(@.chart==\""+chartsUnique.get(i)+".cpu_per_core\")]";
				JSONArray allGroupItems = JsonPath.read(document, allGroupItemsQuery);
				for(int j=0; j<allGroupItems.size(); j++) {
					NfLoadLevelInformation currentNfLoadLevelInfos = new NfLoadLevelInformation();
					LinkedHashMap currentItem =(LinkedHashMap) allGroupItems.get(j);
					currentNfLoadLevelInfos.setNfSetId(currentItem.get("chart").toString());
					//currentNfLoadLevelInfos.setNfInstanceId(currentItem.get("chart").toString()+String.valueOf(j));
					UUID uuid=UUID.randomUUID();   
					NFType nfType= new NFType("UPF");
					
					currentNfLoadLevelInfos.setNfInstanceId(uuid);
					currentNfLoadLevelInfos.setNfType(nfType);
					Integer cpuUsage = null;
					//Integer cpuUsage = Integer.parseInt(allGroupValues.get(1));
					String currentValue = allGroupValues.get(i+j).toString();
					Float cpuUsageFloat = Float.parseFloat(currentValue)*100;
					cpuUsage = Math.round(cpuUsageFloat);
					
					
					currentNfLoadLevelInfos.setNfCpuUsage(cpuUsage);
					nfLoadLevelInformation.add(currentNfLoadLevelInfos);
					//System.out.println(currentNfLoadLevelInfos.getNfType().toString());
					//System.out.println(nfLoadLevelInformation.get(i+j).getNfType());
				}
				
				
				
			}

			
		}
		else {
			List<String> supis = tgtUe.getSupis();
			
			
		}
		
		return nfLoadLevelInformation;
	}

}
