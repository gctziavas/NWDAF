package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.GADShape;
import io.nwdaf.analytics.model.LocalOrigin;
import io.nwdaf.analytics.model.RelativeCartesianLocation;
import io.nwdaf.analytics.model.SupportedGADShapes;
import io.nwdaf.analytics.model.UncertaintyEllipse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Local 2D point with uncertainty ellipse
 */
@ApiModel(description = "Local 2D point with uncertainty ellipse")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class Local2dPointUncertaintyEllipse extends GADShape  {
  @JsonProperty("localOrigin")
  private LocalOrigin localOrigin = null;

  @JsonProperty("point")
  private RelativeCartesianLocation point = null;

  @JsonProperty("uncertaintyEllipse")
  private UncertaintyEllipse uncertaintyEllipse = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  public Local2dPointUncertaintyEllipse localOrigin(LocalOrigin localOrigin) {
    this.localOrigin = localOrigin;
    return this;
  }

  /**
   * Get localOrigin
   * @return localOrigin
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public LocalOrigin getLocalOrigin() {
    return localOrigin;
  }

  public void setLocalOrigin(LocalOrigin localOrigin) {
    this.localOrigin = localOrigin;
  }

  public Local2dPointUncertaintyEllipse point(RelativeCartesianLocation point) {
    this.point = point;
    return this;
  }

  /**
   * Get point
   * @return point
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public RelativeCartesianLocation getPoint() {
    return point;
  }

  public void setPoint(RelativeCartesianLocation point) {
    this.point = point;
  }

  public Local2dPointUncertaintyEllipse uncertaintyEllipse(UncertaintyEllipse uncertaintyEllipse) {
    this.uncertaintyEllipse = uncertaintyEllipse;
    return this;
  }

  /**
   * Get uncertaintyEllipse
   * @return uncertaintyEllipse
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public UncertaintyEllipse getUncertaintyEllipse() {
    return uncertaintyEllipse;
  }

  public void setUncertaintyEllipse(UncertaintyEllipse uncertaintyEllipse) {
    this.uncertaintyEllipse = uncertaintyEllipse;
  }

  public Local2dPointUncertaintyEllipse confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

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
    Local2dPointUncertaintyEllipse local2dPointUncertaintyEllipse = (Local2dPointUncertaintyEllipse) o;
    return Objects.equals(this.localOrigin, local2dPointUncertaintyEllipse.localOrigin) &&
        Objects.equals(this.point, local2dPointUncertaintyEllipse.point) &&
        Objects.equals(this.uncertaintyEllipse, local2dPointUncertaintyEllipse.uncertaintyEllipse) &&
        Objects.equals(this.confidence, local2dPointUncertaintyEllipse.confidence) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localOrigin, point, uncertaintyEllipse, confidence, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Local2dPointUncertaintyEllipse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    localOrigin: ").append(toIndentedString(localOrigin)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    uncertaintyEllipse: ").append(toIndentedString(uncertaintyEllipse)).append("\n");
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
