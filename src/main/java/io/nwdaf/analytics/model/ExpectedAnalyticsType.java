package io.nwdaf.analytics.model;

import java.util.Arrays;
import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - MOBILITY: Mobility related abnormal behaviour analytics is expected by the consumer.   - COMMUN: Communication related abnormal behaviour analytics is expected by the consumer.   - MOBILITY_AND_COMMUN: Both mobility and communication related abnormal behaviour analytics is expected by the consumer. 
 */
@ApiModel(description = "Possible values are   - MOBILITY: Mobility related abnormal behaviour analytics is expected by the consumer.   - COMMUN: Communication related abnormal behaviour analytics is expected by the consumer.   - MOBILITY_AND_COMMUN: Both mobility and communication related abnormal behaviour analytics is expected by the consumer. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ExpectedAnalyticsType  implements AnyOfExpectedAnalyticsType {

	private String expectedAnalyticsType = null;
	
	@JsonIgnore
	private String[] possibleValues = {"MOBILITY", "COMMUN", "MOBILITY_AND_COMMUN"};                                                                                         
	
	
	public ExpectedAnalyticsType(String expectedAnalyticsType) {

		  if (Arrays.asList(possibleValues).contains(expectedAnalyticsType)) {
			  this.expectedAnalyticsType = expectedAnalyticsType;
		}
		  else {
			  throw new IllegalArgumentException("Not valid expectedAnalyticsType value.");
		  }
	}
  
	public String getNetworkPerfType() {
		return this.expectedAnalyticsType;
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
    sb.append("class ExpectedAnalyticsType {\n");
    
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
