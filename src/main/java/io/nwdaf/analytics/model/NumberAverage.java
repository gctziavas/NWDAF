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
 * Represents average and variance information.
 */
@ApiModel(description = "Represents average and variance information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NumberAverage   {
  @JsonProperty("number")
  private Integer number = null;

  @JsonProperty("variance")
  private Float variance = null;

  public NumberAverage number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public NumberAverage variance(Float variance) {
    this.variance = variance;
    return this;
  }

  /**
   * Get variance
   * @return variance
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Float getVariance() {
    return variance;
  }

  public void setVariance(Float variance) {
    this.variance = variance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberAverage numberAverage = (NumberAverage) o;
    return Objects.equals(this.number, numberAverage.number) &&
        Objects.equals(this.variance, numberAverage.variance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, variance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberAverage {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    variance: ").append(toIndentedString(variance)).append("\n");
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
