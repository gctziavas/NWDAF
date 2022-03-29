package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.CivicAddress;
import io.nwdaf.analytics.model.GeographicArea;
import io.nwdaf.analytics.model.NetworkAreaInfo2;
import io.nwdaf.analytics.model.UmtTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LocationArea
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class LocationArea   {
  @JsonProperty("geographicAreas")
  @Valid
  private List<GeographicArea> geographicAreas = null;

  @JsonProperty("civicAddresses")
  @Valid
  private List<CivicAddress> civicAddresses = null;

  @JsonProperty("nwAreaInfo")
  private NetworkAreaInfo2 nwAreaInfo = null;

  @JsonProperty("umtTime")
  private UmtTime umtTime = null;

  public LocationArea geographicAreas(List<GeographicArea> geographicAreas) {
    this.geographicAreas = geographicAreas;
    return this;
  }

  public LocationArea addGeographicAreasItem(GeographicArea geographicAreasItem) {
    if (this.geographicAreas == null) {
      this.geographicAreas = new ArrayList<>();
    }
    this.geographicAreas.add(geographicAreasItem);
    return this;
  }

  /**
   * Identifies a list of geographic area of the user where the UE is located.
   * @return geographicAreas
  **/
  @ApiModelProperty(value = "Identifies a list of geographic area of the user where the UE is located.")
      @Valid
    public List<GeographicArea> getGeographicAreas() {
    return geographicAreas;
  }

  public void setGeographicAreas(List<GeographicArea> geographicAreas) {
    this.geographicAreas = geographicAreas;
  }

  public LocationArea civicAddresses(List<CivicAddress> civicAddresses) {
    this.civicAddresses = civicAddresses;
    return this;
  }

  public LocationArea addCivicAddressesItem(CivicAddress civicAddressesItem) {
    if (this.civicAddresses == null) {
      this.civicAddresses = new ArrayList<>();
    }
    this.civicAddresses.add(civicAddressesItem);
    return this;
  }

  /**
   * Identifies a list of civic addresses of the user where the UE is located.
   * @return civicAddresses
  **/
  @ApiModelProperty(value = "Identifies a list of civic addresses of the user where the UE is located.")
      @Valid
    public List<CivicAddress> getCivicAddresses() {
    return civicAddresses;
  }

  public void setCivicAddresses(List<CivicAddress> civicAddresses) {
    this.civicAddresses = civicAddresses;
  }

  public LocationArea nwAreaInfo(NetworkAreaInfo2 nwAreaInfo) {
    this.nwAreaInfo = nwAreaInfo;
    return this;
  }

  /**
   * Get nwAreaInfo
   * @return nwAreaInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NetworkAreaInfo2 getNwAreaInfo() {
    return nwAreaInfo;
  }

  public void setNwAreaInfo(NetworkAreaInfo2 nwAreaInfo) {
    this.nwAreaInfo = nwAreaInfo;
  }

  public LocationArea umtTime(UmtTime umtTime) {
    this.umtTime = umtTime;
    return this;
  }

  /**
   * Get umtTime
   * @return umtTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UmtTime getUmtTime() {
    return umtTime;
  }

  public void setUmtTime(UmtTime umtTime) {
    this.umtTime = umtTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationArea locationArea = (LocationArea) o;
    return Objects.equals(this.geographicAreas, locationArea.geographicAreas) &&
        Objects.equals(this.civicAddresses, locationArea.civicAddresses) &&
        Objects.equals(this.nwAreaInfo, locationArea.nwAreaInfo) &&
        Objects.equals(this.umtTime, locationArea.umtTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geographicAreas, civicAddresses, nwAreaInfo, umtTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationArea {\n");
    
    sb.append("    geographicAreas: ").append(toIndentedString(geographicAreas)).append("\n");
    sb.append("    civicAddresses: ").append(toIndentedString(civicAddresses)).append("\n");
    sb.append("    nwAreaInfo: ").append(toIndentedString(nwAreaInfo)).append("\n");
    sb.append("    umtTime: ").append(toIndentedString(umtTime)).append("\n");
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
