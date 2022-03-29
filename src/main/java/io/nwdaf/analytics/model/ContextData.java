package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.ContextElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains context information related to analytics subscriptions corresponding with one or more context identifiers.
 */
@ApiModel(description = "Contains context information related to analytics subscriptions corresponding with one or more context identifiers.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ContextData   {
  @JsonProperty("contextElems")
  @Valid
  private List<ContextElement> contextElems = new ArrayList<>();

  public ContextData contextElems(List<ContextElement> contextElems) {
    this.contextElems = contextElems;
    return this;
  }

  public ContextData addContextElemsItem(ContextElement contextElemsItem) {
    this.contextElems.add(contextElemsItem);
    return this;
  }

  /**
   * List of items that contain context information corresponding with a context identifier.
   * @return contextElems
  **/
  @ApiModelProperty(required = true, value = "List of items that contain context information corresponding with a context identifier.")
      @NotNull
    @Valid
  @Size(min=1)   public List<ContextElement> getContextElems() {
    return contextElems;
  }

  public void setContextElems(List<ContextElement> contextElems) {
    this.contextElems = contextElems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextData contextData = (ContextData) o;
    return Objects.equals(this.contextElems, contextData.contextElems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextElems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextData {\n");
    
    sb.append("    contextElems: ").append(toIndentedString(contextElems)).append("\n");
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
