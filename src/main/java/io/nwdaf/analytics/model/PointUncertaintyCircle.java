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
 * Ellipsoid point with uncertainty circle.
 */
@ApiModel(description = "Ellipsoid point with uncertainty circle.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class PointUncertaintyCircle extends GADShape implements AnyOfGeographicArea {
  @JsonProperty("point")
  private GeographicalCoordinates point = null;

  @JsonProperty("uncertainty")
  private Float uncertainty = null;

  public PointUncertaintyCircle point(GeographicalCoordinates point) {
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

  public PointUncertaintyCircle uncertainty(Float uncertainty) {
    this.uncertainty = uncertainty;
    return this;
  }

  /**
   * Get uncertainty
   * @return uncertainty
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Float getUncertainty() {
    return uncertainty;
  }

  public void setUncertainty(Float uncertainty) {
    this.uncertainty = uncertainty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointUncertaintyCircle pointUncertaintyCircle = (PointUncertaintyCircle) o;
    return Objects.equals(this.point, pointUncertaintyCircle.point) &&
        Objects.equals(this.uncertainty, pointUncertaintyCircle.uncertainty) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, uncertainty, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointUncertaintyCircle {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    uncertainty: ").append(toIndentedString(uncertainty)).append("\n");
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
