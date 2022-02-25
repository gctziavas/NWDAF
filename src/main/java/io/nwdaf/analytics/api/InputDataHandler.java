package io.nwdaf.analytics.api;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import net.minidev.json.JSONArray;
import org.json.JSONObject;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import io.nwdaf.analytics.model.Accuracy;
import io.nwdaf.analytics.model.AnalyticsMetadataIndication;
import io.nwdaf.analytics.model.AnySlice;
import io.nwdaf.analytics.model.AnyUe;
import io.nwdaf.analytics.model.EventFilter;
import io.nwdaf.analytics.model.EventReportingRequirement;
import io.nwdaf.analytics.model.NsiIdInfo;
import io.nwdaf.analytics.model.OutputStrategy;
import io.nwdaf.analytics.model.SamplingRatio;
import io.nwdaf.analytics.model.Snssai;
import io.nwdaf.analytics.model.Supi;
import io.nwdaf.analytics.model.TargetUeInformation;
import io.nwdaf.analytics.model.TimeWindow;
import io.nwdaf.analytics.model.UInteger;

public class InputDataHandler {

	public InputDataHandler() {
		
	}
	
	//Get the values of the anaReq field and use them to create the EventReportingRequirement object
	public static EventReportingRequirement eventReportingRequirementExtractor(String anaReq) {
		
		EventReportingRequirement givenEventReportingRequirements = new EventReportingRequirement();
		AnalyticsMetadataIndication givenAnaMetaInd = new AnalyticsMetadataIndication();
		TimeWindow anaMetaIndTimeWindow = new TimeWindow();
		
		JSONObject anaReqJSON = new JSONObject(anaReq);
		
		String json = anaReq;
		Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);
		
		String accuracy = null;									String accuracyQuery = "$.accuracy";
		String startTs = null;  								String startTsQuery = "$.startTs";
		String endTs = null;    								String endTsQuery = "$.endTs";
		String offsetPeriod = null;   							String offsetPeriodQuery = "$.offsetPeriod";
		String sampRatio = null;								String sampRatioQuery = "$.sampRatio";
		String maxObjectNbr = null;								String maxObjectNbrQuery = "$.maxObjectNbr";
		String maxSupiNbr = null;  								String maxSupiNbrQuery = "$.maxSupiNbr";
		String timeAnaNeeded = null;                			String timeAnaNeededQuery = "$.timeAnaNeeded";
		ArrayList<String> anaMeta = new ArrayList<String>();	String anaMetaQuery = "$.anaMeta";
		Object anaMetaInd = null;								String anaMetaIndQuery = "$.anaMetaInd";
			String dataWindow = null;							
				String startTime = null;						String startTimeQuery = "$.anaMetaInd.dataWindow.startTime";
				String stopTime = null;							String stopTimeQuery = "$.anaMetaInd.dataWindow.stopTime";
				ArrayList<String> dataStatProps = new ArrayList<String>(); String dataStatPropsQuery ="$.anaMetaInd.dataStatProps";
			String strategy = null;								String strategyQuery = "$.anaMetaInd.strategy";
			ArrayList<String> aggrNwdafIds = new ArrayList<String>();   String aggrNwdafIdsQuery = "$.anaMetaInd.aggrNwdafIds";
		
		
		if(anaReqJSON.has("accuracy")) {
			accuracy = JsonPath.read(document, accuracyQuery);
			if (accuracy!=null && accuracy!="") {givenEventReportingRequirements.setAccuracy(new Accuracy(accuracy));}
		}
		if(anaReqJSON.has("startTs")) {
			startTs = JsonPath.read(document, startTsQuery);
			if (startTs!=null && startTs!="") {givenEventReportingRequirements.setStartTs(OffsetDateTime.parse(startTs));}
		}
		if(anaReqJSON.has("endTs")) {
			endTs = JsonPath.read(document, endTsQuery);
			if (endTs!=null && endTs!="") {givenEventReportingRequirements.setEndTs(OffsetDateTime.parse(endTs));}
		}
		if(anaReqJSON.has("offsetPeriod")) {
			offsetPeriod = JsonPath.read(document, offsetPeriodQuery);
			if (offsetPeriod!=null && offsetPeriod!=null) {givenEventReportingRequirements.setOffsetPeriod(Integer.parseInt(offsetPeriod));}
		}
		if(anaReqJSON.has("sampRatio")) {
			sampRatio = JsonPath.read(document, sampRatioQuery);
			if (sampRatio!=null && sampRatio!="") {givenEventReportingRequirements.setSampRatio(new SamplingRatio(sampRatio).getSamplingRatio());}
		}
		if(anaReqJSON.has("maxObjectNbr")) {
			maxObjectNbr = JsonPath.read(document, maxObjectNbrQuery);
			if (maxObjectNbr!=null &&  maxObjectNbr!="") {givenEventReportingRequirements.setMaxObjectNbr(new UInteger(maxObjectNbr).getValue());}
		}
		if(anaReqJSON.has("maxSupiNbr")) {
			maxSupiNbr = JsonPath.read(document,maxSupiNbrQuery);
			if (maxSupiNbr!=null &&  maxSupiNbr!="") {givenEventReportingRequirements.setMaxSupiNbr(new UInteger(maxSupiNbr).getValue());}
		}
		if(anaReqJSON.has("timeAnaNeeded")) {
			timeAnaNeeded = JsonPath.read(document, timeAnaNeededQuery);
			if (timeAnaNeeded != null && timeAnaNeeded !="") { givenEventReportingRequirements.setTimeAnaNeeded(OffsetDateTime.parse(timeAnaNeeded));}
		}
		if(anaReqJSON.has("anaMeta")) {
			anaMeta = JsonPath.read(document,anaMetaQuery);
			if (anaMeta!=null) {givenEventReportingRequirements.setAnaMetaFromStringList(anaMeta);}
		}
		if(anaReqJSON.has("anaMetaInd")) {
			anaMetaInd = JsonPath.read(document,anaMetaIndQuery);
			if(anaMetaInd!=null && !anaMetaInd.equals("")) {
				//--------------->Set DataWindow<-----------------
				if(keyExists(anaReqJSON, "dataWindow")){
					if(keyExists(anaReqJSON, "startTime")){
						startTime = JsonPath.read(document,startTimeQuery);
						if (startTime != null && startTime !="") { anaMetaIndTimeWindow.setStartTime(OffsetDateTime.parse(startTime));}
					}
					if(keyExists(anaReqJSON, "stopTime")){
						stopTime = JsonPath.read(document,stopTimeQuery);
						if (stopTime != null && stopTime !="") { anaMetaIndTimeWindow.setStopTime(OffsetDateTime.parse(stopTime));}
					}
					givenAnaMetaInd.setDataWindow(anaMetaIndTimeWindow);
				}
				//--------------->Set Rest Values<-----------------
				if(keyExists(anaReqJSON, "dataStatProps")) {
					dataStatProps = JsonPath.read(document,dataStatPropsQuery);
					if (dataStatProps!=null) {givenAnaMetaInd.setDataStatPropsFromStringList(dataStatProps);}
				}
				if(keyExists(anaReqJSON, "strategy")) {
					strategy = JsonPath.read(document,strategyQuery);
					if (strategy!=null && strategy!=null) {givenAnaMetaInd.setStrategy(new OutputStrategy(strategy));}
				}
				if(keyExists(anaReqJSON, "aggrNwdafIds")) {
					aggrNwdafIds = JsonPath.read(document,aggrNwdafIdsQuery);
					if (aggrNwdafIds!=null) {givenAnaMetaInd.setAggrNwdafIdsFromString(aggrNwdafIds);}
				}				
				givenEventReportingRequirements.setAnaMetaInd(givenAnaMetaInd);
			}
			
		}

		return givenEventReportingRequirements;
	}
	

	//Get the values of the event-filter field and use them to create the EventReportingRequirement object
	public static EventFilter eventFilterextractor(String eventFilter) {
		EventFilter givenEventFilter = new EventFilter();
		ArrayList<NsiIdInfo> givenNsiIdInfos = new ArrayList<NsiIdInfo>();
		
		JSONObject eventFiltJSON = new JSONObject(eventFilter);
		
		String json = eventFilter;
		Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);
		
		String anySlice = null;		  String anySliceQuery = "$.anySlice";
		JSONArray nsiIdInfos = new JSONArray();	  String nsiIdInfosQuery = "$.nsiIdInfos";
			String snssai = null;
				String sst = null;
				String sd = null;
			String nsiIds = null;
		
			if(eventFiltJSON.has("anySlice")) {
				anySlice = JsonPath.read(document, anySliceQuery);
				if (anySlice!=null && anySlice!="") {givenEventFilter.setAnySlice(new AnySlice(anySlice).getAnySlice());}
			}
			if(eventFiltJSON.has("nsiIdInfos")) {
				nsiIdInfos = JsonPath.read(document, nsiIdInfosQuery);
				if(nsiIdInfos!=null) {
					for(int i=0; i<nsiIdInfos.size(); i++) {
						
						NsiIdInfo curNsiIdInfo = new NsiIdInfo();
						LinkedHashMap curNsiIdInfoMap = new LinkedHashMap();
						LinkedHashMap curSnssai = new LinkedHashMap();
						JSONArray curNsiIds = new JSONArray();
						
						curNsiIdInfoMap = (LinkedHashMap) nsiIdInfos.get(i);		
						curSnssai.put("sst", ((LinkedHashMap) curNsiIdInfoMap.get("snssai")).get("sst"));
						Integer curSst = Integer.parseInt((String) curSnssai.get("sst"));
						
						if(((LinkedHashMap) curNsiIdInfoMap.get("snssai")).containsKey("sd")) {
							curSnssai.put("sd", ((LinkedHashMap) curNsiIdInfoMap.get("snssai")).get("sd"));
							String curSd = (String) curSnssai.get("sd");
							curNsiIdInfo.setSnssai(new Snssai(curSst, curSd));
						}
						else {
							curNsiIdInfo.setSnssai(new Snssai(curSst));
						}
						
						if(curNsiIdInfoMap.size()>1) {
							curNsiIds = (JSONArray) curNsiIdInfoMap.get("nsiIds");
							List<String> curNsiIdsList = new ArrayList<String>();
							for(int k = 0; k < curNsiIds.size(); k++){
								curNsiIdsList.add((String) curNsiIds.get(k));
							}
							curNsiIdInfo.setNsiIds(curNsiIdsList);
						}
						givenNsiIdInfos.add(curNsiIdInfo);
					}
					givenEventFilter.setNsiIdInfos(givenNsiIdInfos);}
			}

		return givenEventFilter;
	}
	
	
	public static TargetUeInformation tgtUeExtractor(String tgtUe) {
		TargetUeInformation givenTargetUeInformation = new TargetUeInformation();
		
		JSONObject tgtUeJSON = new JSONObject(tgtUe);
		String json = tgtUe;
		Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);
		
		String anyUe = null;		  String anyUeQuery = "$.anyUe";
		JSONArray supis = new JSONArray(); String supisQuery = "$.supis";
		
		if(tgtUeJSON.has("anySlice")) {
			anyUe = JsonPath.read(document, anyUeQuery);
			if (anyUe!=null && anyUe!="") {givenTargetUeInformation.setAnyUe(new AnyUe(anyUe).getAnyUe());}
		}
		
		if(tgtUeJSON.has("supis")) {
			supis = JsonPath.read(tgtUeJSON, supisQuery);
			if(supis!=null) {
				List<String> supisList = new ArrayList<String>();
				for(int i=0; i<supis.size(); i++) {
					String curSupi = (String) supis.get(i);
					supisList.add(new Supi(curSupi).supiValue());
				}
				givenTargetUeInformation.setSupis(supisList);
			}
		}
		
		return givenTargetUeInformation;
	}
	
	
	
	//Check to see for nested key values
	public static boolean keyExists(JSONObject  object, String searchedKey) {
	    boolean exists = object.has(searchedKey);
	    if(!exists) {      
	        Iterator<?> keys = object.keys();
	        while( keys.hasNext() ) {
	            String key = (String)keys.next();
	            if ( object.get(key) instanceof JSONObject ) {
	                    exists = keyExists((JSONObject) object.get(key), searchedKey);
	            }
	        }
	    }
	    return exists;
	}
	
}
