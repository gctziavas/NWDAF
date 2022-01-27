package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.NwdafEvent;
import io.nwdaf.analytics.model.NwdafFailureCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains information on the event for which the subscription is not successful.
 */
@ApiModel(description = "Contains information on the event for which the subscription is not successful.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class FailureEventInfo   {
  @JsonProperty("event")
  private NwdafEvent event = null;

  @JsonProperty("failureCode")
  private NwdafFailureCode failureCode = null;

  public FailureEventInfo event(NwdafEvent event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public NwdafEvent getEvent() {
    return event;
  }

  public void setEvent(NwdafEvent event) {
    this.event = event;
  }

  public FailureEventInfo failureCode(NwdafFailureCode failureCode) {
    this.failureCode = failureCode;
    return this;
  }

  /**
   * Get failureCode
   * @return failureCode
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public NwdafFailureCode getFailureCode() {
    return failureCode;
  }

  public void setFailureCode(NwdafFailureCode failureCode) {
    this.failureCode = failureCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureEventInfo failureEventInfo = (FailureEventInfo) o;
    return Objects.equals(this.event, failureEventInfo.event) &&
        Objects.equals(this.failureCode, failureEventInfo.failureCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, failureCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureEventInfo {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
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
