package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.CongestionInfo;
import io.nwdaf.analytics.model.NetworkAreaInfo;
import io.nwdaf.analytics.model.Snssai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the user data congestion information.
 */
@ApiModel(description = "Represents the user data congestion information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class UserDataCongestionInfo   {
  @JsonProperty("networkArea")
  private NetworkAreaInfo networkArea = null;

  @JsonProperty("congestionInfo")
  private CongestionInfo congestionInfo = null;

  @JsonProperty("snssai")
  private Snssai snssai = null;

  public UserDataCongestionInfo networkArea(NetworkAreaInfo networkArea) {
    this.networkArea = networkArea;
    return this;
  }

  /**
   * Get networkArea
   * @return networkArea
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NetworkAreaInfo getNetworkArea() {
    return networkArea;
  }

  public void setNetworkArea(NetworkAreaInfo networkArea) {
    this.networkArea = networkArea;
  }

  public UserDataCongestionInfo congestionInfo(CongestionInfo congestionInfo) {
    this.congestionInfo = congestionInfo;
    return this;
  }

  /**
   * Get congestionInfo
   * @return congestionInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CongestionInfo getCongestionInfo() {
    return congestionInfo;
  }

  public void setCongestionInfo(CongestionInfo congestionInfo) {
    this.congestionInfo = congestionInfo;
  }

  public UserDataCongestionInfo snssai(Snssai snssai) {
    this.snssai = snssai;
    return this;
  }

  /**
   * Get snssai
   * @return snssai
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Snssai getSnssai() {
    return snssai;
  }

  public void setSnssai(Snssai snssai) {
    this.snssai = snssai;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDataCongestionInfo userDataCongestionInfo = (UserDataCongestionInfo) o;
    return Objects.equals(this.networkArea, userDataCongestionInfo.networkArea) &&
        Objects.equals(this.congestionInfo, userDataCongestionInfo.congestionInfo) &&
        Objects.equals(this.snssai, userDataCongestionInfo.snssai);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkArea, congestionInfo, snssai);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDataCongestionInfo {\n");
    
    sb.append("    networkArea: ").append(toIndentedString(networkArea)).append("\n");
    sb.append("    congestionInfo: ").append(toIndentedString(congestionInfo)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
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
