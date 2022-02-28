package io.nwdaf.analytics.api;

public class Targets {

	private String lime5GBts = "http://172.16.10.208:19999/";
	private String papajohnVm1GenericvnfVm1 = "http://10.10.10.58:19999/";
	private String masterNode = "http://150.140.195.195:19999/";
	
	
	public String getLime5GBts() {
		return lime5GBts;
	}

	public void setLime5GBts(String lime5gBts) {
		lime5GBts = lime5gBts;
	}

	public String getPapajohnVm1GenericvnfVm1() {
		return papajohnVm1GenericvnfVm1;
	}

	public void setPapajohnVm1GenericvnfVm1(String papajohnVm1GenericvnfVm1) {
		this.papajohnVm1GenericvnfVm1 = papajohnVm1GenericvnfVm1;
	}

	public String getMasterNode() {
		return masterNode;
	}

	public void setMasterNode(String masterNode) {
		this.masterNode = masterNode;
	}
	
	
	
}
