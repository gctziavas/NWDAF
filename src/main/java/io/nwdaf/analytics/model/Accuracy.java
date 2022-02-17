package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are - LOW: Low accuracy. - HIGH: High accuracy. 
 */
@ApiModel(description = "Possible values are - LOW: Low accuracy. - HIGH: High accuracy. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class Accuracy  implements AnyOfAccuracy {
	
	private String accuracy = null;
	
	public Accuracy(String accuracy){
		accuracy = accuracy.toUpperCase();
		if(accuracy.equals("LOW") || accuracy.equals("HIGH")) {
			this.accuracy = accuracy;
		}
		else {
			throw new IllegalArgumentException("Not valid Accuracy value. Possible values are either \"HIGH\" or \"LOW\"");
		}
	}
	
	
  public String getAccuracy() {
		return accuracy;
	}


	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
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
    return this.accuracy;
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
