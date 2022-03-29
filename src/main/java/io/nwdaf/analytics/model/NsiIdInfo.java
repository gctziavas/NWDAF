package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.Snssai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the S-NSSAI and the optionally associated Network Slice Instance(s).
 */
@ApiModel(description = "Represents the S-NSSAI and the optionally associated Network Slice Instance(s).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NsiIdInfo   {
  @JsonProperty("snssai")
  private Snssai snssai = null;

  @JsonProperty("nsiIds")
  @Valid
  private List<String> nsiIds = null;

  public NsiIdInfo snssai(Snssai snssai) {
    this.snssai = snssai;
    return this;
  }

  /**
   * Get snssai
   * @return snssai
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Snssai getSnssai() {
    return snssai;
  }

  public void setSnssai(Snssai snssai) {
    this.snssai = snssai;
  }

  public NsiIdInfo nsiIds(List<String> nsiIds) {
    this.nsiIds = nsiIds;
    return this;
  }

  public NsiIdInfo addNsiIdsItem(String nsiIdsItem) {
    if (this.nsiIds == null) {
      this.nsiIds = new ArrayList<>();
    }
    this.nsiIds.add(nsiIdsItem);
    return this;
  }

  /**
   * Get nsiIds
   * @return nsiIds
  **/
  @ApiModelProperty(value = "")
  
  @Size(min=1)   public List<String> getNsiIds() {
    return nsiIds;
  }

  public void setNsiIds(List<String> nsiIds) {
    this.nsiIds = nsiIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NsiIdInfo nsiIdInfo = (NsiIdInfo) o;
    return Objects.equals(this.snssai, nsiIdInfo.snssai) &&
        Objects.equals(this.nsiIds, nsiIdInfo.nsiIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snssai, nsiIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    nsiIds: ").append(toIndentedString(nsiIds)).append("\n");
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
