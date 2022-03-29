package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.Orientation;
import io.nwdaf.analytics.model.Uncertainty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ellipse with uncertainty.
 */
@ApiModel(description = "Ellipse with uncertainty.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class UncertaintyEllipse   {
  @JsonProperty("semiMajor")
  private Uncertainty semiMajor = null;

  @JsonProperty("semiMinor")
  private Uncertainty semiMinor = null;

  @JsonProperty("orientationMajor")
  private Orientation orientationMajor = null;

  public UncertaintyEllipse semiMajor(Uncertainty semiMajor) {
    this.semiMajor = semiMajor;
    return this;
  }

  /**
   * Get semiMajor
   * @return semiMajor
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Uncertainty getSemiMajor() {
    return semiMajor;
  }

  public void setSemiMajor(Uncertainty semiMajor) {
    this.semiMajor = semiMajor;
  }

  public UncertaintyEllipse semiMinor(Uncertainty semiMinor) {
    this.semiMinor = semiMinor;
    return this;
  }

  /**
   * Get semiMinor
   * @return semiMinor
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Uncertainty getSemiMinor() {
    return semiMinor;
  }

  public void setSemiMinor(Uncertainty semiMinor) {
    this.semiMinor = semiMinor;
  }

  public UncertaintyEllipse orientationMajor(Orientation orientationMajor) {
    this.orientationMajor = orientationMajor;
    return this;
  }

  /**
   * Get orientationMajor
   * @return orientationMajor
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Orientation getOrientationMajor() {
    return orientationMajor;
  }

  public void setOrientationMajor(Orientation orientationMajor) {
    this.orientationMajor = orientationMajor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UncertaintyEllipse uncertaintyEllipse = (UncertaintyEllipse) o;
    return Objects.equals(this.semiMajor, uncertaintyEllipse.semiMajor) &&
        Objects.equals(this.semiMinor, uncertaintyEllipse.semiMinor) &&
        Objects.equals(this.orientationMajor, uncertaintyEllipse.orientationMajor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(semiMajor, semiMinor, orientationMajor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UncertaintyEllipse {\n");
    
    sb.append("    semiMajor: ").append(toIndentedString(semiMajor)).append("\n");
    sb.append("    semiMinor: ").append(toIndentedString(semiMinor)).append("\n");
    sb.append("    orientationMajor: ").append(toIndentedString(orientationMajor)).append("\n");
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
