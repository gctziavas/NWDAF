package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.GNbId;
import io.nwdaf.analytics.model.PlmnId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * One of the six attributes n3IwfId, gNbIdm, ngeNbId, wagfId, tngfId, eNbId shall be present.
 */
@ApiModel(description = "One of the six attributes n3IwfId, gNbIdm, ngeNbId, wagfId, tngfId, eNbId shall be present.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class GlobalRanNodeId  implements OneOfGlobalRanNodeId {
  @JsonProperty("plmnId")
  private PlmnId plmnId = null;

  @JsonProperty("n3IwfId")
  private String n3IwfId = null;

  @JsonProperty("gNbId")
  private GNbId gNbId = null;

  @JsonProperty("ngeNbId")
  private NgeNbId ngeNbId = null;

  @JsonProperty("wagfId")
  private WAgfId wagfId = null;

  @JsonProperty("tngfId")
  private TngfId tngfId = null;

  @JsonProperty("nid")
  private Nid nid = null;

  @JsonProperty("eNbId")
  private ENbId eNbId = null;

  public GlobalRanNodeId plmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
    return this;
  }

  /**
   * Get plmnId
   * @return plmnId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public PlmnId getPlmnId() {
    return plmnId;
  }

  public void setPlmnId(PlmnId plmnId) {
    this.plmnId = plmnId;
  }

  public GlobalRanNodeId n3IwfId(String n3IwfId) {
    this.n3IwfId = new N3IwfId(n3IwfId).n3IwfIdValue();
    return this;
  }

  /**
   * Get n3IwfId
   * @return n3IwfId
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^[A-Fa-f0-9]+$")   public String getN3IwfId() {
    return n3IwfId;
  }

  public void setN3IwfId(String n3IwfId) {
	  this.n3IwfId = new N3IwfId(n3IwfId).n3IwfIdValue();
  }

  public GlobalRanNodeId gNbId(GNbId gNbId) {
    this.gNbId = gNbId;
    return this;
  }

  /**
   * Get gNbId
   * @return gNbId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GNbId getGNbId() {
    return gNbId;
  }

  public void setGNbId(GNbId gNbId) {
    this.gNbId = gNbId;
  }

  public GlobalRanNodeId ngeNbId(String ngeNbId) {
    this.ngeNbId = new NgeNbId(ngeNbId);
    return this;
  }

  /**
   * Get ngeNbId
   * @return ngeNbId
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^(MacroNGeNB-[A-Fa-f0-9]{5}|LMacroNGeNB-[A-Fa-f0-9]{6}|SMacroNGeNB-[A-Fa-f0-9]{5})$")   public NgeNbId getNgeNbId() {
    return ngeNbId;
  }

  public void setNgeNbId(String ngeNbId) {
    this.ngeNbId = new NgeNbId(ngeNbId);
  }

  public GlobalRanNodeId wagfId(String wagfId) {
    this.wagfId = new WAgfId(wagfId);
    return this;
  }

  /**
   * Get wagfId
   * @return wagfId
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^[A-Fa-f0-9]+$")   public WAgfId getWagfId() {
    return wagfId;
  }

  public void setWagfId(String wagfId) {
    this.wagfId = new WAgfId(wagfId);
  }

  public GlobalRanNodeId tngfId(String tngfId) {
    this.tngfId = new TngfId(tngfId);
    return this;
  }

  /**
   * Get tngfId
   * @return tngfId
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^[A-Fa-f0-9]+$")   public TngfId getTngfId() {
    return tngfId;
  }

  public void setTngfId(String tngfId) {
    this.tngfId = new TngfId(tngfId);
  }

  public GlobalRanNodeId nid(String nid) {
    this.nid = new Nid(nid);
    return this;
  }

  /**
   * Get nid
   * @return nid
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^[A-Fa-f0-9]{11}$")   public Nid getNid() {
    return nid;
  }

  public void setNid(String nid) {
    this.nid = new Nid(nid);
  }

  public GlobalRanNodeId eNbId(String eNbId) {
    this.eNbId = new ENbId(eNbId);
    return this;
  }

  /**
   * Get eNbId
   * @return eNbId
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^(MacroeNB-[A-Fa-f0-9]{5}|LMacroeNB-[A-Fa-f0-9]{6}|SMacroeNB-[A-Fa-f0-9]{5}|HomeeNB-[A-Fa-f0-9]{7})$")   public ENbId getENbId() {
    return eNbId;
  }

  public void setENbId(String eNbId) {
    this.eNbId = new ENbId(eNbId);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalRanNodeId globalRanNodeId = (GlobalRanNodeId) o;
    return Objects.equals(this.plmnId, globalRanNodeId.plmnId) &&
        Objects.equals(this.n3IwfId, globalRanNodeId.n3IwfId) &&
        Objects.equals(this.gNbId, globalRanNodeId.gNbId) &&
        Objects.equals(this.ngeNbId, globalRanNodeId.ngeNbId) &&
        Objects.equals(this.wagfId, globalRanNodeId.wagfId) &&
        Objects.equals(this.tngfId, globalRanNodeId.tngfId) &&
        Objects.equals(this.nid, globalRanNodeId.nid) &&
        Objects.equals(this.eNbId, globalRanNodeId.eNbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, n3IwfId, gNbId, ngeNbId, wagfId, tngfId, nid, eNbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalRanNodeId {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    n3IwfId: ").append(toIndentedString(n3IwfId)).append("\n");
    sb.append("    gNbId: ").append(toIndentedString(gNbId)).append("\n");
    sb.append("    ngeNbId: ").append(toIndentedString(ngeNbId)).append("\n");
    sb.append("    wagfId: ").append(toIndentedString(wagfId)).append("\n");
    sb.append("    tngfId: ").append(toIndentedString(tngfId)).append("\n");
    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
    sb.append("    eNbId: ").append(toIndentedString(eNbId)).append("\n");
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
