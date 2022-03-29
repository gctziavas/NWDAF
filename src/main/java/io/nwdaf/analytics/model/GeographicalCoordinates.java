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
 * Geographical coordinates.
 */
@ApiModel(description = "Geographical coordinates.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class GeographicalCoordinates   {
  @JsonProperty("lon")
  private Double lon = null;

  @JsonProperty("lat")
  private Double lat = null;

  public GeographicalCoordinates lon(Double lon) {
    this.lon = lon;
    return this;
  }

  /**
   * Get lon
   * minimum: -180
   * maximum: 180
   * @return lon
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @DecimalMin("-180") @DecimalMax("180")   public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }

  public GeographicalCoordinates lat(Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * Get lat
   * minimum: -90
   * maximum: 90
   * @return lat
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @DecimalMin("-90") @DecimalMax("90")   public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicalCoordinates geographicalCoordinates = (GeographicalCoordinates) o;
    return Objects.equals(this.lon, geographicalCoordinates.lon) &&
        Objects.equals(this.lat, geographicalCoordinates.lat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lon, lat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicalCoordinates {\n");
    
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
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
