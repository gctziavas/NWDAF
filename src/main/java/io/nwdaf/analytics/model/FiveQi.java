package io.nwdaf.analytics.model;

public class FiveQi {
	private Integer fiveQi = null;
	
	public FiveQi(Integer fiveQi) {
		  if (fiveQi>=0 && fiveQi<255) {
			  this.fiveQi = fiveQi;
		}
		  else {
			  throw new IllegalArgumentException("Not valid 5Qi argument. 5Qi must must be within range [0 , 255].");
		  }
	}
  
	public Integer fiveQiValue() {
		return this.fiveQi;
	}
	
}
