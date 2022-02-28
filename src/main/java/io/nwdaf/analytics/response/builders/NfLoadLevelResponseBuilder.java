package io.nwdaf.analytics.response.builders;

import java.util.ArrayList;
import java.util.List;

import io.nwdaf.analytics.model.EventFilter;
import io.nwdaf.analytics.model.NfLoadLevelInformation;
import io.nwdaf.analytics.model.Supi;
import io.nwdaf.analytics.model.TargetUeInformation;

public class NfLoadLevelResponseBuilder {
	
	public NfLoadLevelResponseBuilder() {
		
	}
	
	public List <NfLoadLevelInformation> nfLoadLevelInformation(EventFilter eventFilter, TargetUeInformation tgtUe) {
		List <NfLoadLevelInformation> nfLoadLevelInformation = new ArrayList<NfLoadLevelInformation>();
		
		Boolean anyUe = tgtUe.isAnyUe();
		if(anyUe) {
			//Find all the UEs of the given area
			
			
		}
		else {
			List<String> supis = tgtUe.getSupis();
			
			
		}
		
		return nfLoadLevelInformation;
	}

}
