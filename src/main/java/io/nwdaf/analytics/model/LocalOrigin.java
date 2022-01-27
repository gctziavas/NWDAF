package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.TS29572NlmfLocationYamlcomponentsschemasGeographicalCoordinates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indicates a Local origin in a reference system
 */
@ApiModel(description = "Indicates a Local origin in a reference system")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class LocalOrigin   {
  @JsonProperty("coordinateId")
  private String coordinateId = null;

  @JsonProperty("point")
  private TS29572NlmfLocationYamlcomponentsschemasGeographicalCoordinates point = null;

  public LocalOrigin coordinateId(String coordinateId) {
    this.coordinateId = coordinateId;
    return this;
  }

  /**
   * Get coordinateId
   * @return coordinateId
  **/
  @ApiModelProperty(value = "")
  
    public String getCoordinateId() {
    return coordinateId;
  }

  public void setCoordinateId(String coordinateId) {
    this.coordinateId = coordinateId;
  }

  public LocalOrigin point(TS29572NlmfLocationYamlcomponentsschemasGeographicalCoordinates point) {
    this.point = point;
    return this;
  }

  /**
   * Get point
   * @return point
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TS29572NlmfLocationYamlcomponentsschemasGeographicalCoordinates getPoint() {
    return point;
  }

  public void setPoint(TS29572NlmfLocationYamlcomponentsschemasGeographicalCoordinates point) {
    this.point = point;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalOrigin localOrigin = (LocalOrigin) o;
    return Objects.equals(this.coordinateId, localOrigin.coordinateId) &&
        Objects.equals(this.point, localOrigin.point);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinateId, point);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalOrigin {\n");
    
    sb.append("    coordinateId: ").append(toIndentedString(coordinateId)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
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
