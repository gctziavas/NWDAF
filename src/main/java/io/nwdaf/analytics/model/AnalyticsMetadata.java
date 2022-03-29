package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - NUM_OF_SAMPLES: Number of data samples used for the generation of the output analytics.   - DATA_WINDOW: Data time window of the data samples.   - DATA_STAT_PROPS: Dataset statistical properties of the data used to generate the analytics.   - STRATEGY: Output strategy used for the reporting of the analytics.   - ACCURACY: Level of accuracy reached for the analytics. 
 */
@ApiModel(description = "Possible values are   - NUM_OF_SAMPLES: Number of data samples used for the generation of the output analytics.   - DATA_WINDOW: Data time window of the data samples.   - DATA_STAT_PROPS: Dataset statistical properties of the data used to generate the analytics.   - STRATEGY: Output strategy used for the reporting of the analytics.   - ACCURACY: Level of accuracy reached for the analytics. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class AnalyticsMetadata  implements AnyOfAnalyticsMetadata {
	
	private String analyticsMetadata = null;
	
	public AnalyticsMetadata(String analyticsMetadata) {
		setAnalyticsMetadata(analyticsMetadata);
	}
	
	
	
	  public String getAnalyticsMetadata() {
			return analyticsMetadata;
		}
	
	  public void setAnalyticsMetadata(String analyticsMetadata) {
		  analyticsMetadata = analyticsMetadata.toUpperCase();
		  if(analyticsMetadata.equals("NUM_OF_SAMPLES") || analyticsMetadata.equals("DATA_WINDOW") || analyticsMetadata.equals("DATA_STAT_PROPS") || analyticsMetadata.equals("STRATEGY") || analyticsMetadata.equals("ACCURACY")) {
			  this.analyticsMetadata = analyticsMetadata;
		  }
		  else {
			  throw new IllegalArgumentException("Not valid AnalyticsMetadata argument");
		  }
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
	    sb.append(this.analyticsMetadata);
	    return sb.toString();
	  }
  public String toJsonValue() {
	    StringBuilder sb = new StringBuilder();
	    sb.append(this.analyticsMetadata);
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
