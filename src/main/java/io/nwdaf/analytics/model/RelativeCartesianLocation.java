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
 * Relative Cartesian Location
 */
@ApiModel(description = "Relative Cartesian Location")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class RelativeCartesianLocation   {
  @JsonProperty("x")
  private Float x = null;

  @JsonProperty("y")
  private Float y = null;

  @JsonProperty("z")
  private Float z = null;

  public RelativeCartesianLocation x(Float x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Float getX() {
    return x;
  }

  public void setX(Float x) {
    this.x = x;
  }

  public RelativeCartesianLocation y(Float y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Float getY() {
    return y;
  }

  public void setY(Float y) {
    this.y = y;
  }

  public RelativeCartesianLocation z(Float z) {
    this.z = z;
    return this;
  }

  /**
   * Get z
   * @return z
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Float getZ() {
    return z;
  }

  public void setZ(Float z) {
    this.z = z;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelativeCartesianLocation relativeCartesianLocation = (RelativeCartesianLocation) o;
    return Objects.equals(this.x, relativeCartesianLocation.x) &&
        Objects.equals(this.y, relativeCartesianLocation.y) &&
        Objects.equals(this.z, relativeCartesianLocation.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeCartesianLocation {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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
