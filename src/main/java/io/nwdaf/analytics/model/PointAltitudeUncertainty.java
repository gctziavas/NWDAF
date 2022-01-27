package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.GADShape;
import io.nwdaf.analytics.model.GeographicalCoordinates;
import io.nwdaf.analytics.model.SupportedGADShapes;
import io.nwdaf.analytics.model.UncertaintyEllipse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ellipsoid point with altitude and uncertainty ellipsoid.
 */
@ApiModel(description = "Ellipsoid point with altitude and uncertainty ellipsoid.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class PointAltitudeUncertainty extends GADShape implements AnyOfGeographicArea {
  @JsonProperty("point")
  private GeographicalCoordinates point = null;

  @JsonProperty("altitude")
  private Double altitude = null;

  @JsonProperty("uncertaintyEllipse")
  private UncertaintyEllipse uncertaintyEllipse = null;

  @JsonProperty("uncertaintyAltitude")
  private Float uncertaintyAltitude = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  public PointAltitudeUncertainty point(GeographicalCoordinates point) {
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

  public PointAltitudeUncertainty altitude(Double altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Get altitude
   * @return altitude
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Double getAltitude() {
    return altitude;
  }

  public void setAltitude(Double altitude) {
    this.altitude = altitude;
  }

  public PointAltitudeUncertainty uncertaintyEllipse(UncertaintyEllipse uncertaintyEllipse) {
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

  public PointAltitudeUncertainty uncertaintyAltitude(Float uncertaintyAltitude) {
    this.uncertaintyAltitude = uncertaintyAltitude;
    return this;
  }

  /**
   * Get uncertaintyAltitude
   * @return uncertaintyAltitude
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Float getUncertaintyAltitude() {
    return uncertaintyAltitude;
  }

  public void setUncertaintyAltitude(Float uncertaintyAltitude) {
    this.uncertaintyAltitude = uncertaintyAltitude;
  }

  public PointAltitudeUncertainty confidence(Integer confidence) {
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
    PointAltitudeUncertainty pointAltitudeUncertainty = (PointAltitudeUncertainty) o;
    return Objects.equals(this.point, pointAltitudeUncertainty.point) &&
        Objects.equals(this.altitude, pointAltitudeUncertainty.altitude) &&
        Objects.equals(this.uncertaintyEllipse, pointAltitudeUncertainty.uncertaintyEllipse) &&
        Objects.equals(this.uncertaintyAltitude, pointAltitudeUncertainty.uncertaintyAltitude) &&
        Objects.equals(this.confidence, pointAltitudeUncertainty.confidence) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, altitude, uncertaintyEllipse, uncertaintyAltitude, confidence, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointAltitudeUncertainty {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    uncertaintyEllipse: ").append(toIndentedString(uncertaintyEllipse)).append("\n");
    sb.append("    uncertaintyAltitude: ").append(toIndentedString(uncertaintyAltitude)).append("\n");
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
