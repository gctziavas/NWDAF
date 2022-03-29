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
 * Indicates additional information why the analytics request is rejected.
 */
@ApiModel(description = "Indicates additional information why the analytics request is rejected.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class AdditionInfoAnalyticsInfoRequest   {
  @JsonProperty("rvWaitTime")
  private Integer rvWaitTime = null;

  public AdditionInfoAnalyticsInfoRequest rvWaitTime(Integer rvWaitTime) {
    this.rvWaitTime = rvWaitTime;
    return this;
  }

  /**
   * Get rvWaitTime
   * @return rvWaitTime
  **/
  @ApiModelProperty(value = "")
  
    public Integer getRvWaitTime() {
    return rvWaitTime;
  }

  public void setRvWaitTime(Integer rvWaitTime) {
    this.rvWaitTime = rvWaitTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionInfoAnalyticsInfoRequest additionInfoAnalyticsInfoRequest = (AdditionInfoAnalyticsInfoRequest) o;
    return Objects.equals(this.rvWaitTime, additionInfoAnalyticsInfoRequest.rvWaitTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rvWaitTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionInfoAnalyticsInfoRequest {\n");
    
    sb.append("    rvWaitTime: ").append(toIndentedString(rvWaitTime)).append("\n");
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
