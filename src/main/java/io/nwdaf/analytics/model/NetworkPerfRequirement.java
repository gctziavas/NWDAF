package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.NetworkPerfType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a network performance requirement.
 */
@ApiModel(description = "Represents a network performance requirement.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NetworkPerfRequirement   {
  @JsonProperty("nwPerfType")
  private NetworkPerfType nwPerfType = null;

  @JsonProperty("relativeRatio")
  private Integer relativeRatio = null;

  @JsonProperty("absoluteNum")
  private Integer absoluteNum = null;

  public NetworkPerfRequirement nwPerfType(NetworkPerfType nwPerfType) {
    this.nwPerfType = nwPerfType;
    return this;
  }

  /**
   * Get nwPerfType
   * @return nwPerfType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public NetworkPerfType getNwPerfType() {
    return nwPerfType;
  }

  public void setNwPerfType(NetworkPerfType nwPerfType) {
    this.nwPerfType = nwPerfType;
  }

  public NetworkPerfRequirement relativeRatio(Integer relativeRatio) {
    this.relativeRatio = relativeRatio;
    return this;
  }

  /**
   * Get relativeRatio
   * @return relativeRatio
  **/
  @ApiModelProperty(value = "")
  
    public Integer getRelativeRatio() {
    return relativeRatio;
  }

  public void setRelativeRatio(Integer relativeRatio) {
    this.relativeRatio = relativeRatio;
  }

  public NetworkPerfRequirement absoluteNum(Integer absoluteNum) {
    this.absoluteNum = absoluteNum;
    return this;
  }

  /**
   * Get absoluteNum
   * @return absoluteNum
  **/
  @ApiModelProperty(value = "")
  
    public Integer getAbsoluteNum() {
    return absoluteNum;
  }

  public void setAbsoluteNum(Integer absoluteNum) {
    this.absoluteNum = absoluteNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkPerfRequirement networkPerfRequirement = (NetworkPerfRequirement) o;
    return Objects.equals(this.nwPerfType, networkPerfRequirement.nwPerfType) &&
        Objects.equals(this.relativeRatio, networkPerfRequirement.relativeRatio) &&
        Objects.equals(this.absoluteNum, networkPerfRequirement.absoluteNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nwPerfType, relativeRatio, absoluteNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkPerfRequirement {\n");
    
    sb.append("    nwPerfType: ").append(toIndentedString(nwPerfType)).append("\n");
    sb.append("    relativeRatio: ").append(toIndentedString(relativeRatio)).append("\n");
    sb.append("    absoluteNum: ").append(toIndentedString(absoluteNum)).append("\n");
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
