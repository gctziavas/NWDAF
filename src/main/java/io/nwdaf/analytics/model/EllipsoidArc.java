package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.GADShape;
import io.nwdaf.analytics.model.GeographicalCoordinates;
import io.nwdaf.analytics.model.SupportedGADShapes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ellipsoid Arc.
 */
@ApiModel(description = "Ellipsoid Arc.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class EllipsoidArc extends GADShape implements AnyOfGeographicArea {
  @JsonProperty("point")
  private GeographicalCoordinates point = null;

  @JsonProperty("innerRadius")
  private Integer innerRadius = null;

  @JsonProperty("uncertaintyRadius")
  private Float uncertaintyRadius = null;

  @JsonProperty("offsetAngle")
  private Integer offsetAngle = null;

  @JsonProperty("includedAngle")
  private Integer includedAngle = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  public EllipsoidArc point(GeographicalCoordinates point) {
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
    public GeographicalCoordinates getPoint() {
    return point;
  }

  public void setPoint(GeographicalCoordinates point) {
    this.point = point;
  }

  public EllipsoidArc innerRadius(Integer innerRadius) {
    this.innerRadius = innerRadius;
    return this;
  }

  /**
   * Get innerRadius
   * @return innerRadius
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getInnerRadius() {
    return innerRadius;
  }

  public void setInnerRadius(Integer innerRadius) {
    this.innerRadius = innerRadius;
  }

  public EllipsoidArc uncertaintyRadius(Float uncertaintyRadius) {
    this.uncertaintyRadius = uncertaintyRadius;
    return this;
  }

  /**
   * Get uncertaintyRadius
   * @return uncertaintyRadius
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Float getUncertaintyRadius() {
    return uncertaintyRadius;
  }

  public void setUncertaintyRadius(Float uncertaintyRadius) {
    this.uncertaintyRadius = uncertaintyRadius;
  }

  public EllipsoidArc offsetAngle(Integer offsetAngle) {
    this.offsetAngle = offsetAngle;
    return this;
  }

  /**
   * Get offsetAngle
   * @return offsetAngle
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getOffsetAngle() {
    return offsetAngle;
  }

  public void setOffsetAngle(Integer offsetAngle) {
    this.offsetAngle = offsetAngle;
  }

  public EllipsoidArc includedAngle(Integer includedAngle) {
    this.includedAngle = includedAngle;
    return this;
  }

  /**
   * Get includedAngle
   * @return includedAngle
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getIncludedAngle() {
    return includedAngle;
  }

  public void setIncludedAngle(Integer includedAngle) {
    this.includedAngle = includedAngle;
  }

  public EllipsoidArc confidence(Integer confidence) {
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
    EllipsoidArc ellipsoidArc = (EllipsoidArc) o;
    return Objects.equals(this.point, ellipsoidArc.point) &&
        Objects.equals(this.innerRadius, ellipsoidArc.innerRadius) &&
        Objects.equals(this.uncertaintyRadius, ellipsoidArc.uncertaintyRadius) &&
        Objects.equals(this.offsetAngle, ellipsoidArc.offsetAngle) &&
        Objects.equals(this.includedAngle, ellipsoidArc.includedAngle) &&
        Objects.equals(this.confidence, ellipsoidArc.confidence) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, innerRadius, uncertaintyRadius, offsetAngle, includedAngle, confidence, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EllipsoidArc {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    innerRadius: ").append(toIndentedString(innerRadius)).append("\n");
    sb.append("    uncertaintyRadius: ").append(toIndentedString(uncertaintyRadius)).append("\n");
    sb.append("    offsetAngle: ").append(toIndentedString(offsetAngle)).append("\n");
    sb.append("    includedAngle: ").append(toIndentedString(includedAngle)).append("\n");
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
