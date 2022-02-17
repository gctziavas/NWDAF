package io.nwdaf.analytics.model;

public class UInteger {
	
	private Integer input = null;
	
	public UInteger(Integer input) {
		if(input>=0) {
			this.input = input;
		}
		else {
			throw new IllegalArgumentException("UInteger type cannot be a negative value.");
		}
	}
	
	public UInteger(String inputString) {
		Integer input = Integer.parseInt(inputString);
		if(input>=0) {
			this.input = input;
		}
		else {
			throw new IllegalArgumentException("UInteger type cannot be a negative value.");
		}
	}

	public Integer getValue() {
		return input;
	}

	public void setInput(Integer input) {
		this.input = input;
	}
	
	
}
