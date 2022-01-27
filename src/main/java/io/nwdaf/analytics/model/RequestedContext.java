package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.ContextType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains types of analytics context information.
 */
@ApiModel(description = "Contains types of analytics context information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class RequestedContext   {
  @JsonProperty("contexts")
  @Valid
  private List<ContextType> contexts = new ArrayList<>();

  public RequestedContext contexts(List<ContextType> contexts) {
    this.contexts = contexts;
    return this;
  }

  public RequestedContext addContextsItem(ContextType contextsItem) {
    this.contexts.add(contextsItem);
    return this;
  }

  /**
   * List of analytics context types.
   * @return contexts
  **/
  @ApiModelProperty(required = true, value = "List of analytics context types.")
      @NotNull
    @Valid
  @Size(min=1)   public List<ContextType> getContexts() {
    return contexts;
  }

  public void setContexts(List<ContextType> contexts) {
    this.contexts = contexts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestedContext requestedContext = (RequestedContext) o;
    return Objects.equals(this.contexts, requestedContext.contexts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contexts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedContext {\n");
    
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
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
