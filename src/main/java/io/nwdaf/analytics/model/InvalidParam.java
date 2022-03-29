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
 * It contains an invalid parameter and a related description.
 */
@ApiModel(description = "It contains an invalid parameter and a related description.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class InvalidParam   {
  @JsonProperty("param")
  private String param = null;

  @JsonProperty("reason")
  private String reason = null;

  public InvalidParam param(String param) {
    this.param = param;
    return this;
  }

  /**
   * If the invalid parameter is an attribute in a JSON body, this IE shall contain the attribute's name and shall be encoded as a JSON Pointer. If the invalid parameter is an HTTP header, this IE shall be formatted as the concatenation of the string \"header \" plus the name of such header. If the invalid parameter is a query parameter, this IE shall be formatted as the concatenation of the string \"query \" plus the name of such query parameter. If the invalid parameter is a variable part in the path of a resource URI, this IE shall contain the name of the variable, including the symbols \"{\" and \"}\" used in OpenAPI specification as the notation to represent variable path segments.
   * @return param
  **/
  @ApiModelProperty(required = true, value = "If the invalid parameter is an attribute in a JSON body, this IE shall contain the attribute's name and shall be encoded as a JSON Pointer. If the invalid parameter is an HTTP header, this IE shall be formatted as the concatenation of the string \"header \" plus the name of such header. If the invalid parameter is a query parameter, this IE shall be formatted as the concatenation of the string \"query \" plus the name of such query parameter. If the invalid parameter is a variable part in the path of a resource URI, this IE shall contain the name of the variable, including the symbols \"{\" and \"}\" used in OpenAPI specification as the notation to represent variable path segments.")
      @NotNull

    public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public InvalidParam reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * A human-readable reason, e.g. \"must be a positive integer\". In cases involving failed operations in a PATCH request, the reason string should identify the operation that failed using the operation's array index to assist in correlation of the invalid parameter with the failed operation, e.g.\" Replacement value invalid for attribute (failed operation index= 4)\"
   * @return reason
  **/
  @ApiModelProperty(value = "A human-readable reason, e.g. \"must be a positive integer\". In cases involving failed operations in a PATCH request, the reason string should identify the operation that failed using the operation's array index to assist in correlation of the invalid parameter with the failed operation, e.g.\" Replacement value invalid for attribute (failed operation index= 4)\"")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidParam invalidParam = (InvalidParam) o;
    return Objects.equals(this.param, invalidParam.param) &&
        Objects.equals(this.reason, invalidParam.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(param, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidParam {\n");
    
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
