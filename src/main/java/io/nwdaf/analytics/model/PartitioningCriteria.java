package io.nwdaf.analytics.model;


import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are - \&quot;TAC\&quot;: Type Allocation Code - \&quot;SUBPLMN\&quot;: Subscriber PLMN ID - \&quot;GEOAREA\&quot;: Geographical area, i.e. list(s) of TAI(s) - \&quot;SNSSAI\&quot;: S-NSSAI - \&quot;DNN\&quot;: DNN 
 */
@ApiModel(description = "Possible values are - \"TAC\": Type Allocation Code - \"SUBPLMN\": Subscriber PLMN ID - \"GEOAREA\": Geographical area, i.e. list(s) of TAI(s) - \"SNSSAI\": S-NSSAI - \"DNN\": DNN ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-21T16:51:39.181287+02:00[Europe/Athens]")
public class PartitioningCriteria  implements AnyOfPartitioningCriteria, AnyOfPartitioningCriteriaRm {

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
    sb.append("class PartitioningCriteria {\n");
    
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