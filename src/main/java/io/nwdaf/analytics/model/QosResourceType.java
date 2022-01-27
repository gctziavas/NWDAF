package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The enumeration QosResourceType indicates whether a QoS Flow is non-GBR, delay critical GBR, or non-delay critical GBR (see clauses 5.7.3.4 and 5.7.3.5 of 3GPP TS 23.501). It shall comply with the provisions defined in table 5.5.3.6-1.
 */
@ApiModel(description = "The enumeration QosResourceType indicates whether a QoS Flow is non-GBR, delay critical GBR, or non-delay critical GBR (see clauses 5.7.3.4 and 5.7.3.5 of 3GPP TS 23.501). It shall comply with the provisions defined in table 5.5.3.6-1.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class QosResourceType  implements AnyOfQosResourceType {

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
    sb.append("class QosResourceType {\n");
    
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
