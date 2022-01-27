package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.AnalyticsContextIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains a list of context identifiers of context information of analytics subscriptions.
 */
@ApiModel(description = "Contains a list of context identifiers of context information of analytics subscriptions.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ContextIdList   {
  @JsonProperty("contextIds")
  @Valid
  private List<AnalyticsContextIdentifier> contextIds = new ArrayList<>();

  public ContextIdList contextIds(List<AnalyticsContextIdentifier> contextIds) {
    this.contextIds = contextIds;
    return this;
  }

  public ContextIdList addContextIdsItem(AnalyticsContextIdentifier contextIdsItem) {
    this.contextIds.add(contextIdsItem);
    return this;
  }

  /**
   * Get contextIds
   * @return contextIds
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull
    @Valid
  @Size(min=1)   public List<AnalyticsContextIdentifier> getContextIds() {
    return contextIds;
  }

  public void setContextIds(List<AnalyticsContextIdentifier> contextIds) {
    this.contextIds = contextIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextIdList contextIdList = (ContextIdList) o;
    return Objects.equals(this.contextIds, contextIdList.contextIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextIdList {\n");
    
    sb.append("    contextIds: ").append(toIndentedString(contextIds)).append("\n");
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
