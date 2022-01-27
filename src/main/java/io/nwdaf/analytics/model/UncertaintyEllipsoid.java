package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.TS29572NlmfLocationYamlcomponentsschemasOrientation;
import io.nwdaf.analytics.model.TS29572NlmfLocationYamlcomponentsschemasUncertainty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ellipsoid with uncertainty
 */
@ApiModel(description = "Ellipsoid with uncertainty")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class UncertaintyEllipsoid   {
  @JsonProperty("semiMajor")
  private TS29572NlmfLocationYamlcomponentsschemasUncertainty semiMajor = null;

  @JsonProperty("semiMinor")
  private TS29572NlmfLocationYamlcomponentsschemasUncertainty semiMinor = null;

  @JsonProperty("vertical")
  private TS29572NlmfLocationYamlcomponentsschemasUncertainty vertical = null;

  @JsonProperty("orientationMajor")
  private TS29572NlmfLocationYamlcomponentsschemasOrientation orientationMajor = null;

  public UncertaintyEllipsoid semiMajor(TS29572NlmfLocationYamlcomponentsschemasUncertainty semiMajor) {
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
    public TS29572NlmfLocationYamlcomponentsschemasUncertainty getSemiMajor() {
    return semiMajor;
  }

  public void setSemiMajor(TS29572NlmfLocationYamlcomponentsschemasUncertainty semiMajor) {
    this.semiMajor = semiMajor;
  }

  public UncertaintyEllipsoid semiMinor(TS29572NlmfLocationYamlcomponentsschemasUncertainty semiMinor) {
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
    public TS29572NlmfLocationYamlcomponentsschemasUncertainty getSemiMinor() {
    return semiMinor;
  }

  public void setSemiMinor(TS29572NlmfLocationYamlcomponentsschemasUncertainty semiMinor) {
    this.semiMinor = semiMinor;
  }

  public UncertaintyEllipsoid vertical(TS29572NlmfLocationYamlcomponentsschemasUncertainty vertical) {
    this.vertical = vertical;
    return this;
  }

  /**
   * Get vertical
   * @return vertical
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public TS29572NlmfLocationYamlcomponentsschemasUncertainty getVertical() {
    return vertical;
  }

  public void setVertical(TS29572NlmfLocationYamlcomponentsschemasUncertainty vertical) {
    this.vertical = vertical;
  }

  public UncertaintyEllipsoid orientationMajor(TS29572NlmfLocationYamlcomponentsschemasOrientation orientationMajor) {
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
    public TS29572NlmfLocationYamlcomponentsschemasOrientation getOrientationMajor() {
    return orientationMajor;
  }

  public void setOrientationMajor(TS29572NlmfLocationYamlcomponentsschemasOrientation orientationMajor) {
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
    UncertaintyEllipsoid uncertaintyEllipsoid = (UncertaintyEllipsoid) o;
    return Objects.equals(this.semiMajor, uncertaintyEllipsoid.semiMajor) &&
        Objects.equals(this.semiMinor, uncertaintyEllipsoid.semiMinor) &&
        Objects.equals(this.vertical, uncertaintyEllipsoid.vertical) &&
        Objects.equals(this.orientationMajor, uncertaintyEllipsoid.orientationMajor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(semiMajor, semiMinor, vertical, orientationMajor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UncertaintyEllipsoid {\n");
    
    sb.append("    semiMajor: ").append(toIndentedString(semiMajor)).append("\n");
    sb.append("    semiMinor: ").append(toIndentedString(semiMinor)).append("\n");
    sb.append("    vertical: ").append(toIndentedString(vertical)).append("\n");
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
