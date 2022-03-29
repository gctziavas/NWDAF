package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * REpresents the HFC Node Identifer received over NGAP.
 */
@ApiModel(description = "REpresents the HFC Node Identifer received over NGAP.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class HfcNodeId   {
  @JsonProperty("hfcNId")
  private String hfcNId = null;

  public HfcNodeId hfcNId(String hfcNId) {
    this.hfcNId = hfcNId;
    return this;
  }

  /**
   * Get hfcNId
   * @return hfcNId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Size(max=6)   public String getHfcNId() {
    return hfcNId;
  }

  public void setHfcNId(String hfcNId) {
    this.hfcNId = hfcNId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HfcNodeId hfcNodeId = (HfcNodeId) o;
    return Objects.equals(this.hfcNId, hfcNodeId.hfcNId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hfcNId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HfcNodeId {\n");
    
    sb.append("    hfcNId: ").append(toIndentedString(hfcNId)).append("\n");
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
