package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.SupportedGADShapes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Common base type for GAD shapes.
 */
@ApiModel(description = "Common base type for GAD shapes.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class GADShape   {
  @JsonProperty("shape")
  private SupportedGADShapes shape = null;

  public GADShape shape(SupportedGADShapes shape) {
    this.shape = shape;
    return this;
  }

  /**
   * Get shape
   * @return shape
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public SupportedGADShapes getShape() {
    return shape;
  }

  public void setShape(SupportedGADShapes shape) {
    this.shape = shape;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GADShape gaDShape = (GADShape) o;
    return Objects.equals(this.shape, gaDShape.shape);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shape);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GADShape {\n");
    
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
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
