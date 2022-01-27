package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.NwdafEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains information about available UE related analytics contexts.
 */
@ApiModel(description = "Contains information about available UE related analytics contexts.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class UeAnalyticsContextDescriptor   {
  @JsonProperty("supi")
  private String supi = null;

  @JsonProperty("anaTypes")
  @Valid
  private List<NwdafEvent> anaTypes = new ArrayList<>();

  public UeAnalyticsContextDescriptor supi(String supi) {
    this.supi = supi;
    return this;
  }

  /**
   * Get supi
   * @return supi
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="^(imsi-[0-9]{5,15}|nai-.+|gci-.+|gli-.+|.+)$")   public String getSupi() {
    return supi;
  }

  public void setSupi(String supi) {
    this.supi = supi;
  }

  public UeAnalyticsContextDescriptor anaTypes(List<NwdafEvent> anaTypes) {
    this.anaTypes = anaTypes;
    return this;
  }

  public UeAnalyticsContextDescriptor addAnaTypesItem(NwdafEvent anaTypesItem) {
    this.anaTypes.add(anaTypesItem);
    return this;
  }

  /**
   * List of analytics types for which UE related analytics contexts can be retrieved.
   * @return anaTypes
  **/
  @ApiModelProperty(required = true, value = "List of analytics types for which UE related analytics contexts can be retrieved.")
      @NotNull
    @Valid
  @Size(min=1)   public List<NwdafEvent> getAnaTypes() {
    return anaTypes;
  }

  public void setAnaTypes(List<NwdafEvent> anaTypes) {
    this.anaTypes = anaTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UeAnalyticsContextDescriptor ueAnalyticsContextDescriptor = (UeAnalyticsContextDescriptor) o;
    return Objects.equals(this.supi, ueAnalyticsContextDescriptor.supi) &&
        Objects.equals(this.anaTypes, ueAnalyticsContextDescriptor.anaTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supi, anaTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UeAnalyticsContextDescriptor {\n");
    
    sb.append("    supi: ").append(toIndentedString(supi)).append("\n");
    sb.append("    anaTypes: ").append(toIndentedString(anaTypes)).append("\n");
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
