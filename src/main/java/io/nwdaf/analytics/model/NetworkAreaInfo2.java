package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.Ecgi;
import io.nwdaf.analytics.model.GlobalRanNodeId;
import io.nwdaf.analytics.model.Ncgi;
import io.nwdaf.analytics.model.Tai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes a network area information in which the NF service consumer requests the number of UEs.
 */
@ApiModel(description = "Describes a network area information in which the NF service consumer requests the number of UEs.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NetworkAreaInfo2   {
  @JsonProperty("ecgis")
  @Valid
  private List<Ecgi> ecgis = null;

  @JsonProperty("ncgis")
  @Valid
  private List<Ncgi> ncgis = null;

  @JsonProperty("gRanNodeIds")
  @Valid
  private List<GlobalRanNodeId> gRanNodeIds = null;

  @JsonProperty("tais")
  @Valid
  private List<Tai> tais = null;

  public NetworkAreaInfo2 ecgis(List<Ecgi> ecgis) {
    this.ecgis = ecgis;
    return this;
  }

  public NetworkAreaInfo2 addEcgisItem(Ecgi ecgisItem) {
    if (this.ecgis == null) {
      this.ecgis = new ArrayList<>();
    }
    this.ecgis.add(ecgisItem);
    return this;
  }

  /**
   * Contains a list of E-UTRA cell identities.
   * @return ecgis
  **/
  @ApiModelProperty(value = "Contains a list of E-UTRA cell identities.")
      @Valid
  @Size(min=1)   public List<Ecgi> getEcgis() {
    return ecgis;
  }

  public void setEcgis(List<Ecgi> ecgis) {
    this.ecgis = ecgis;
  }

  public NetworkAreaInfo2 ncgis(List<Ncgi> ncgis) {
    this.ncgis = ncgis;
    return this;
  }

  public NetworkAreaInfo2 addNcgisItem(Ncgi ncgisItem) {
    if (this.ncgis == null) {
      this.ncgis = new ArrayList<>();
    }
    this.ncgis.add(ncgisItem);
    return this;
  }

  /**
   * Contains a list of NR cell identities.
   * @return ncgis
  **/
  @ApiModelProperty(value = "Contains a list of NR cell identities.")
      @Valid
  @Size(min=1)   public List<Ncgi> getNcgis() {
    return ncgis;
  }

  public void setNcgis(List<Ncgi> ncgis) {
    this.ncgis = ncgis;
  }

  public NetworkAreaInfo2 gRanNodeIds(List<GlobalRanNodeId> gRanNodeIds) {
    this.gRanNodeIds = gRanNodeIds;
    return this;
  }

  public NetworkAreaInfo2 addGRanNodeIdsItem(GlobalRanNodeId gRanNodeIdsItem) {
    if (this.gRanNodeIds == null) {
      this.gRanNodeIds = new ArrayList<>();
    }
    this.gRanNodeIds.add(gRanNodeIdsItem);
    return this;
  }

  /**
   * Contains a list of NG RAN nodes.
   * @return gRanNodeIds
  **/
  @ApiModelProperty(value = "Contains a list of NG RAN nodes.")
      @Valid
  @Size(min=1)   public List<GlobalRanNodeId> getGRanNodeIds() {
    return gRanNodeIds;
  }

  public void setGRanNodeIds(List<GlobalRanNodeId> gRanNodeIds) {
    this.gRanNodeIds = gRanNodeIds;
  }

  public NetworkAreaInfo2 tais(List<Tai> tais) {
    this.tais = tais;
    return this;
  }

  public NetworkAreaInfo2 addTaisItem(Tai taisItem) {
    if (this.tais == null) {
      this.tais = new ArrayList<>();
    }
    this.tais.add(taisItem);
    return this;
  }

  /**
   * Contains a list of tracking area identities.
   * @return tais
  **/
  @ApiModelProperty(value = "Contains a list of tracking area identities.")
      @Valid
  @Size(min=1)   public List<Tai> getTais() {
    return tais;
  }

  public void setTais(List<Tai> tais) {
    this.tais = tais;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkAreaInfo2 networkAreaInfo2 = (NetworkAreaInfo2) o;
    return Objects.equals(this.ecgis, networkAreaInfo2.ecgis) &&
        Objects.equals(this.ncgis, networkAreaInfo2.ncgis) &&
        Objects.equals(this.gRanNodeIds, networkAreaInfo2.gRanNodeIds) &&
        Objects.equals(this.tais, networkAreaInfo2.tais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ecgis, ncgis, gRanNodeIds, tais);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkAreaInfo2 {\n");
    
    sb.append("    ecgis: ").append(toIndentedString(ecgis)).append("\n");
    sb.append("    ncgis: ").append(toIndentedString(ncgis)).append("\n");
    sb.append("    gRanNodeIds: ").append(toIndentedString(gRanNodeIds)).append("\n");
    sb.append("    tais: ").append(toIndentedString(tais)).append("\n");
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
