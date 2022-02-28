package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are   - UNIFORM_DIST_DATA: Indicates the use of data samples that are uniformly distributed according to the different aspects of the requested analytics.   - NO_OUTLIERS: Indicates that the data samples shall disregard data samples that are at the extreme boundaries of the value range. 
 */
@ApiModel(description = "Possible values are   - UNIFORM_DIST_DATA: Indicates the use of data samples that are uniformly distributed according to the different aspects of the requested analytics.   - NO_OUTLIERS: Indicates that the data samples shall disregard data samples that are at the extreme boundaries of the value range. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class DatasetStatisticalProperty  implements AnyOfDatasetStatisticalProperty {
	
	private String datasetStatisticalProperty = null;
	
	public DatasetStatisticalProperty(String datasetStatisticalProperty) {
		datasetStatisticalProperty = datasetStatisticalProperty.toUpperCase();
		if(datasetStatisticalProperty.equals("UNIFORM_DIST_DATA") || datasetStatisticalProperty.equals("NO_OUTLIERS")) {
			this.datasetStatisticalProperty = datasetStatisticalProperty;
		}
		else {
			throw new IllegalArgumentException("Not valid DatasetStatisticalProperty argument. Valid values are: \"UNIFORM_DIST_DATA\" or \"NO_OUTLIERS\"");
		}
	}
	
	
	
  public String getDatasetStatisticalProperty() {
		return datasetStatisticalProperty;
	}



	public void setDatasetStatisticalProperty(String datasetStatisticalProperty) {
		datasetStatisticalProperty = datasetStatisticalProperty.toUpperCase();
		if(datasetStatisticalProperty.equals("UNIFORM_DIST_DATA") || datasetStatisticalProperty.equals("NO_OUTLIERS")) {
			this.datasetStatisticalProperty = datasetStatisticalProperty;
		}
		else {
			throw new IllegalArgumentException("Not valid DatasetStatisticalProperty argument. Valid values are: \"UNIFORM_DIST_DATA\" or \"NO_OUTLIERS\"");
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
     return this.datasetStatisticalProperty;
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
