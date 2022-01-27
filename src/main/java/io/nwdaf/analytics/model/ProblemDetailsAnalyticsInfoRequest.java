package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.AccessTokenErr;
import io.nwdaf.analytics.model.AccessTokenReq;
import io.nwdaf.analytics.model.AdditionInfoAnalyticsInfoRequest;
import io.nwdaf.analytics.model.InvalidParam;
import io.nwdaf.analytics.model.ProblemDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Extends ProblemDetails to indicate more details why the analytics request is rejected.
 */
@ApiModel(description = "Extends ProblemDetails to indicate more details why the analytics request is rejected.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ProblemDetailsAnalyticsInfoRequest extends ProblemDetails  {
  @JsonProperty("rvWaitTime")
  private Integer rvWaitTime = null;

  public ProblemDetailsAnalyticsInfoRequest rvWaitTime(Integer rvWaitTime) {
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
    ProblemDetailsAnalyticsInfoRequest problemDetailsAnalyticsInfoRequest = (ProblemDetailsAnalyticsInfoRequest) o;
    return Objects.equals(this.rvWaitTime, problemDetailsAnalyticsInfoRequest.rvWaitTime) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rvWaitTime, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetailsAnalyticsInfoRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
