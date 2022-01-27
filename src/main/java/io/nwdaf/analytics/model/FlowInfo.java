package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents flow information.
 */
@ApiModel(description = "Represents flow information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class FlowInfo   {
  @JsonProperty("flowId")
  private Integer flowId = null;

  @JsonProperty("flowDescriptions")
  @Valid
  private List<String> flowDescriptions = null;

  public FlowInfo flowId(Integer flowId) {
    this.flowId = flowId;
    return this;
  }

  /**
   * Indicates the IP flow.
   * @return flowId
  **/
  @ApiModelProperty(required = true, value = "Indicates the IP flow.")
      @NotNull

    public Integer getFlowId() {
    return flowId;
  }

  public void setFlowId(Integer flowId) {
    this.flowId = flowId;
  }

  public FlowInfo flowDescriptions(List<String> flowDescriptions) {
    this.flowDescriptions = flowDescriptions;
    return this;
  }

  public FlowInfo addFlowDescriptionsItem(String flowDescriptionsItem) {
    if (this.flowDescriptions == null) {
      this.flowDescriptions = new ArrayList<>();
    }
    this.flowDescriptions.add(flowDescriptionsItem);
    return this;
  }

  /**
   * Indicates the packet filters of the IP flow. Refer to subclause 5.3.8 of 3GPP TS 29.214 for encoding. It shall contain UL and/or DL IP flow description.
   * @return flowDescriptions
  **/
  @ApiModelProperty(value = "Indicates the packet filters of the IP flow. Refer to subclause 5.3.8 of 3GPP TS 29.214 for encoding. It shall contain UL and/or DL IP flow description.")
  
  @Size(min=1,max=2)   public List<String> getFlowDescriptions() {
    return flowDescriptions;
  }

  public void setFlowDescriptions(List<String> flowDescriptions) {
    this.flowDescriptions = flowDescriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowInfo flowInfo = (FlowInfo) o;
    return Objects.equals(this.flowId, flowInfo.flowId) &&
        Objects.equals(this.flowDescriptions, flowInfo.flowDescriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowId, flowDescriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowInfo {\n");
    
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowDescriptions: ").append(toIndentedString(flowDescriptions)).append("\n");
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
