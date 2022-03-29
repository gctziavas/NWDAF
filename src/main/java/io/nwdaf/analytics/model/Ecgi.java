package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.PlmnId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the ECGI (E-UTRAN Cell Global Identity), as described in 3GPP 23.003
 */
@ApiModel(description = "Contains the ECGI (E-UTRAN Cell Global Identity), as described in 3GPP 23.003")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class Ecgi   {
  @JsonProperty("plmnId")
  private PlmnId plmnId = null;

  @JsonProperty("eutraCellId")
  private String eutraCellId = null;

  @JsonProperty("nid")
  private String nid = null;

  public Ecgi() {};
  
  public Ecgi(PlmnId plmnId, String eutraCellId, String nid) {
	  setPlmnId(plmnId);
	  setEutraCellId(eutraCellId);
	  setNid(nid);
  }
  public Ecgi(PlmnId plmnId, String eutraCellId) {
	  setPlmnId(plmnId);
	  setEutraCellId(eutraCellId);
  }
  
  
  public Ecgi plmnId(PlmnId plmnId) {
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

  public Ecgi eutraCellId(String eutraCellId) {
    this.eutraCellId = new EutraCellId(eutraCellId).eutraCellIdValue();
    return this;
  }

  /**
   * Get eutraCellId
   * @return eutraCellId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="^[A-Fa-f0-9]{7}$")   public String getEutraCellId() {
    return eutraCellId;
  }

  public void setEutraCellId(String eutraCellId) {
	  this.eutraCellId = new EutraCellId(eutraCellId).eutraCellIdValue();

  }

  public Ecgi nid(String nid) {
    this.nid = new Nid(nid).nidValue();
    return this;
  }

  /**
   * Get nid
   * @return nid
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^[A-Fa-f0-9]{11}$")   public String getNid() {
    return nid;
  }

  public void setNid(String nid) {
	  this.nid = new Nid(nid).nidValue();
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ecgi ecgi = (Ecgi) o;
    return Objects.equals(this.plmnId, ecgi.plmnId) &&
        Objects.equals(this.eutraCellId, ecgi.eutraCellId) &&
        Objects.equals(this.nid, ecgi.nid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plmnId, eutraCellId, nid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ecgi {\n");
    
    sb.append("    plmnId: ").append(toIndentedString(plmnId)).append("\n");
    sb.append("    eutraCellId: ").append(toIndentedString(eutraCellId)).append("\n");
    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
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
