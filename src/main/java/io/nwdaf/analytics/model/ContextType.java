package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are - PENDING_ANALYTICS: Represents context information that relates to pending output analytics. - HISTORICAL_ANALYTICS: Represents context information that relates to historical output analytics. - AGGR_SUBS: Represents context information about the analytics subscriptions that an NWDAF has with other NWDAFs that collectively serve an analytics subscription. - DATA: Represents context information about historical data that is available. - AGGR_INFO: Represents context information that is related to aggregation of analytics from multiple NWDAF subscriptions. - ML_MODELS: Represents context information about used ML models. 
 */
@ApiModel(description = "Possible values are - PENDING_ANALYTICS: Represents context information that relates to pending output analytics. - HISTORICAL_ANALYTICS: Represents context information that relates to historical output analytics. - AGGR_SUBS: Represents context information about the analytics subscriptions that an NWDAF has with other NWDAFs that collectively serve an analytics subscription. - DATA: Represents context information about historical data that is available. - AGGR_INFO: Represents context information that is related to aggregation of analytics from multiple NWDAF subscriptions. - ML_MODELS: Represents context information about used ML models. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ContextType  implements AnyOfContextType {

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
    sb.append("class ContextType {\n");
    
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
