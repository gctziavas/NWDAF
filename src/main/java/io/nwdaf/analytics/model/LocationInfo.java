package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.UserLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents UE location information.
 */
@ApiModel(description = "Represents UE location information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class LocationInfo   {
  @JsonProperty("loc")
  private UserLocation loc = null;

  @JsonProperty("ratio")
  private Integer ratio = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  public LocationInfo loc(UserLocation loc) {
    this.loc = loc;
    return this;
  }

  /**
   * Get loc
   * @return loc
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public UserLocation getLoc() {
    return loc;
  }

  public void setLoc(UserLocation loc) {
    this.loc = loc;
  }

  public LocationInfo ratio(Integer ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * Get ratio
   * @return ratio
  **/
  @ApiModelProperty(value = "")
  
    public Integer getRatio() {
    return ratio;
  }

  public void setRatio(Integer ratio) {
    this.ratio = ratio;
  }

  public LocationInfo confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(value = "")
  
    public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationInfo locationInfo = (LocationInfo) o;
    return Objects.equals(this.loc, locationInfo.loc) &&
        Objects.equals(this.ratio, locationInfo.ratio) &&
        Objects.equals(this.confidence, locationInfo.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loc, ratio, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationInfo {\n");
    
    sb.append("    loc: ").append(toIndentedString(loc)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
