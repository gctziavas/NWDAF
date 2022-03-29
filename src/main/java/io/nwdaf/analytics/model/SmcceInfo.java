package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.SmcceUeList;
import io.nwdaf.analytics.model.Snssai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the Session Management congestion control experience information.
 */
@ApiModel(description = "Represents the Session Management congestion control experience information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class SmcceInfo   {
  @JsonProperty("dnn")
  private String dnn = null;

  @JsonProperty("snssai")
  private Snssai snssai = null;

  @JsonProperty("smcceUeList")
  @Valid
  private List<SmcceUeList> smcceUeList = null;

  public SmcceInfo dnn(String dnn) {
    this.dnn = dnn;
    return this;
  }

  /**
   * Get dnn
   * @return dnn
  **/
  @ApiModelProperty(value = "")
  
    public String getDnn() {
    return dnn;
  }

  public void setDnn(String dnn) {
    this.dnn = dnn;
  }

  public SmcceInfo snssai(Snssai snssai) {
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

  public SmcceInfo smcceUeList(List<SmcceUeList> smcceUeList) {
    this.smcceUeList = smcceUeList;
    return this;
  }

  public SmcceInfo addSmcceUeListItem(SmcceUeList smcceUeListItem) {
    if (this.smcceUeList == null) {
      this.smcceUeList = new ArrayList<>();
    }
    this.smcceUeList.add(smcceUeListItem);
    return this;
  }

  /**
   * Get smcceUeList
   * @return smcceUeList
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<SmcceUeList> getSmcceUeList() {
    return smcceUeList;
  }

  public void setSmcceUeList(List<SmcceUeList> smcceUeList) {
    this.smcceUeList = smcceUeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmcceInfo smcceInfo = (SmcceInfo) o;
    return Objects.equals(this.dnn, smcceInfo.dnn) &&
        Objects.equals(this.snssai, smcceInfo.snssai) &&
        Objects.equals(this.smcceUeList, smcceInfo.smcceUeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnn, snssai, smcceUeList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmcceInfo {\n");
    
    sb.append("    dnn: ").append(toIndentedString(dnn)).append("\n");
    sb.append("    snssai: ").append(toIndentedString(snssai)).append("\n");
    sb.append("    smcceUeList: ").append(toIndentedString(smcceUeList)).append("\n");
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
