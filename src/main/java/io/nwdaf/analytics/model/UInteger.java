package io.nwdaf.analytics.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;

/**
 * Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.
 */
@ApiModel(description = "Unsigned Integer, i.e. only value 0 and integers above 0 are permissible.")

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
	
	 @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    return true;
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash();
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class Uinteger {\n");
	    
	    sb.append("}");
	    return sb.toString();
	  }

	  /**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }
	
	
}
