package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indicates a Civic address.
 */
@ApiModel(description = "Indicates a Civic address.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class CivicAddress   {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("A1")
  private String a1 = null;

  @JsonProperty("A2")
  private String a2 = null;

  @JsonProperty("A3")
  private String a3 = null;

  @JsonProperty("A4")
  private String a4 = null;

  @JsonProperty("A5")
  private String a5 = null;

  @JsonProperty("A6")
  private String a6 = null;

  @JsonProperty("PRD")
  private String PRD = null;

  @JsonProperty("POD")
  private String POD = null;

  @JsonProperty("STS")
  private String STS = null;

  @JsonProperty("HNO")
  private String HNO = null;

  @JsonProperty("HNS")
  private String HNS = null;

  @JsonProperty("LMK")
  private String LMK = null;

  @JsonProperty("LOC")
  private String LOC = null;

  @JsonProperty("NAM")
  private String NAM = null;

  @JsonProperty("PC")
  private String PC = null;

  @JsonProperty("BLD")
  private String BLD = null;

  @JsonProperty("UNIT")
  private String UNIT = null;

  @JsonProperty("FLR")
  private String FLR = null;

  @JsonProperty("ROOM")
  private String ROOM = null;

  @JsonProperty("PLC")
  private String PLC = null;

  @JsonProperty("PCN")
  private String PCN = null;

  @JsonProperty("POBOX")
  private String POBOX = null;

  @JsonProperty("ADDCODE")
  private String ADDCODE = null;

  @JsonProperty("SEAT")
  private String SEAT = null;

  @JsonProperty("RD")
  private String RD = null;

  @JsonProperty("RDSEC")
  private String RDSEC = null;

  @JsonProperty("RDBR")
  private String RDBR = null;

  @JsonProperty("RDSUBBR")
  private String RDSUBBR = null;

  @JsonProperty("PRM")
  private String PRM = null;

  @JsonProperty("POM")
  private String POM = null;

  @JsonProperty("usageRules")
  private String usageRules = null;

  @JsonProperty("method")
  private String method = null;

  @JsonProperty("providedBy")
  private String providedBy = null;

  public CivicAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CivicAddress a1(String a1) {
    this.a1 = a1;
    return this;
  }

  /**
   * Get a1
   * @return a1
  **/
  @ApiModelProperty(value = "")
  
    public String getA1() {
    return a1;
  }

  public void setA1(String a1) {
    this.a1 = a1;
  }

  public CivicAddress a2(String a2) {
    this.a2 = a2;
    return this;
  }

  /**
   * Get a2
   * @return a2
  **/
  @ApiModelProperty(value = "")
  
    public String getA2() {
    return a2;
  }

  public void setA2(String a2) {
    this.a2 = a2;
  }

  public CivicAddress a3(String a3) {
    this.a3 = a3;
    return this;
  }

  /**
   * Get a3
   * @return a3
  **/
  @ApiModelProperty(value = "")
  
    public String getA3() {
    return a3;
  }

  public void setA3(String a3) {
    this.a3 = a3;
  }

  public CivicAddress a4(String a4) {
    this.a4 = a4;
    return this;
  }

  /**
   * Get a4
   * @return a4
  **/
  @ApiModelProperty(value = "")
  
    public String getA4() {
    return a4;
  }

  public void setA4(String a4) {
    this.a4 = a4;
  }

  public CivicAddress a5(String a5) {
    this.a5 = a5;
    return this;
  }

  /**
   * Get a5
   * @return a5
  **/
  @ApiModelProperty(value = "")
  
    public String getA5() {
    return a5;
  }

  public void setA5(String a5) {
    this.a5 = a5;
  }

  public CivicAddress a6(String a6) {
    this.a6 = a6;
    return this;
  }

  /**
   * Get a6
   * @return a6
  **/
  @ApiModelProperty(value = "")
  
    public String getA6() {
    return a6;
  }

  public void setA6(String a6) {
    this.a6 = a6;
  }

  public CivicAddress PRD(String PRD) {
    this.PRD = PRD;
    return this;
  }

  /**
   * Get PRD
   * @return PRD
  **/
  @ApiModelProperty(value = "")
  
    public String getPRD() {
    return PRD;
  }

  public void setPRD(String PRD) {
    this.PRD = PRD;
  }

  public CivicAddress POD(String POD) {
    this.POD = POD;
    return this;
  }

  /**
   * Get POD
   * @return POD
  **/
  @ApiModelProperty(value = "")
  
    public String getPOD() {
    return POD;
  }

  public void setPOD(String POD) {
    this.POD = POD;
  }

  public CivicAddress STS(String STS) {
    this.STS = STS;
    return this;
  }

  /**
   * Get STS
   * @return STS
  **/
  @ApiModelProperty(value = "")
  
    public String getSTS() {
    return STS;
  }

  public void setSTS(String STS) {
    this.STS = STS;
  }

  public CivicAddress HNO(String HNO) {
    this.HNO = HNO;
    return this;
  }

  /**
   * Get HNO
   * @return HNO
  **/
  @ApiModelProperty(value = "")
  
    public String getHNO() {
    return HNO;
  }

  public void setHNO(String HNO) {
    this.HNO = HNO;
  }

  public CivicAddress HNS(String HNS) {
    this.HNS = HNS;
    return this;
  }

  /**
   * Get HNS
   * @return HNS
  **/
  @ApiModelProperty(value = "")
  
    public String getHNS() {
    return HNS;
  }

  public void setHNS(String HNS) {
    this.HNS = HNS;
  }

  public CivicAddress LMK(String LMK) {
    this.LMK = LMK;
    return this;
  }

  /**
   * Get LMK
   * @return LMK
  **/
  @ApiModelProperty(value = "")
  
    public String getLMK() {
    return LMK;
  }

  public void setLMK(String LMK) {
    this.LMK = LMK;
  }

  public CivicAddress LOC(String LOC) {
    this.LOC = LOC;
    return this;
  }

  /**
   * Get LOC
   * @return LOC
  **/
  @ApiModelProperty(value = "")
  
    public String getLOC() {
    return LOC;
  }

  public void setLOC(String LOC) {
    this.LOC = LOC;
  }

  public CivicAddress NAM(String NAM) {
    this.NAM = NAM;
    return this;
  }

  /**
   * Get NAM
   * @return NAM
  **/
  @ApiModelProperty(value = "")
  
    public String getNAM() {
    return NAM;
  }

  public void setNAM(String NAM) {
    this.NAM = NAM;
  }

  public CivicAddress PC(String PC) {
    this.PC = PC;
    return this;
  }

  /**
   * Get PC
   * @return PC
  **/
  @ApiModelProperty(value = "")
  
    public String getPC() {
    return PC;
  }

  public void setPC(String PC) {
    this.PC = PC;
  }

  public CivicAddress BLD(String BLD) {
    this.BLD = BLD;
    return this;
  }

  /**
   * Get BLD
   * @return BLD
  **/
  @ApiModelProperty(value = "")
  
    public String getBLD() {
    return BLD;
  }

  public void setBLD(String BLD) {
    this.BLD = BLD;
  }

  public CivicAddress UNIT(String UNIT) {
    this.UNIT = UNIT;
    return this;
  }

  /**
   * Get UNIT
   * @return UNIT
  **/
  @ApiModelProperty(value = "")
  
    public String getUNIT() {
    return UNIT;
  }

  public void setUNIT(String UNIT) {
    this.UNIT = UNIT;
  }

  public CivicAddress FLR(String FLR) {
    this.FLR = FLR;
    return this;
  }

  /**
   * Get FLR
   * @return FLR
  **/
  @ApiModelProperty(value = "")
  
    public String getFLR() {
    return FLR;
  }

  public void setFLR(String FLR) {
    this.FLR = FLR;
  }

  public CivicAddress ROOM(String ROOM) {
    this.ROOM = ROOM;
    return this;
  }

  /**
   * Get ROOM
   * @return ROOM
  **/
  @ApiModelProperty(value = "")
  
    public String getROOM() {
    return ROOM;
  }

  public void setROOM(String ROOM) {
    this.ROOM = ROOM;
  }

  public CivicAddress PLC(String PLC) {
    this.PLC = PLC;
    return this;
  }

  /**
   * Get PLC
   * @return PLC
  **/
  @ApiModelProperty(value = "")
  
    public String getPLC() {
    return PLC;
  }

  public void setPLC(String PLC) {
    this.PLC = PLC;
  }

  public CivicAddress PCN(String PCN) {
    this.PCN = PCN;
    return this;
  }

  /**
   * Get PCN
   * @return PCN
  **/
  @ApiModelProperty(value = "")
  
    public String getPCN() {
    return PCN;
  }

  public void setPCN(String PCN) {
    this.PCN = PCN;
  }

  public CivicAddress POBOX(String POBOX) {
    this.POBOX = POBOX;
    return this;
  }

  /**
   * Get POBOX
   * @return POBOX
  **/
  @ApiModelProperty(value = "")
  
    public String getPOBOX() {
    return POBOX;
  }

  public void setPOBOX(String POBOX) {
    this.POBOX = POBOX;
  }

  public CivicAddress ADDCODE(String ADDCODE) {
    this.ADDCODE = ADDCODE;
    return this;
  }

  /**
   * Get ADDCODE
   * @return ADDCODE
  **/
  @ApiModelProperty(value = "")
  
    public String getADDCODE() {
    return ADDCODE;
  }

  public void setADDCODE(String ADDCODE) {
    this.ADDCODE = ADDCODE;
  }

  public CivicAddress SEAT(String SEAT) {
    this.SEAT = SEAT;
    return this;
  }

  /**
   * Get SEAT
   * @return SEAT
  **/
  @ApiModelProperty(value = "")
  
    public String getSEAT() {
    return SEAT;
  }

  public void setSEAT(String SEAT) {
    this.SEAT = SEAT;
  }

  public CivicAddress RD(String RD) {
    this.RD = RD;
    return this;
  }

  /**
   * Get RD
   * @return RD
  **/
  @ApiModelProperty(value = "")
  
    public String getRD() {
    return RD;
  }

  public void setRD(String RD) {
    this.RD = RD;
  }

  public CivicAddress RDSEC(String RDSEC) {
    this.RDSEC = RDSEC;
    return this;
  }

  /**
   * Get RDSEC
   * @return RDSEC
  **/
  @ApiModelProperty(value = "")
  
    public String getRDSEC() {
    return RDSEC;
  }

  public void setRDSEC(String RDSEC) {
    this.RDSEC = RDSEC;
  }

  public CivicAddress RDBR(String RDBR) {
    this.RDBR = RDBR;
    return this;
  }

  /**
   * Get RDBR
   * @return RDBR
  **/
  @ApiModelProperty(value = "")
  
    public String getRDBR() {
    return RDBR;
  }

  public void setRDBR(String RDBR) {
    this.RDBR = RDBR;
  }

  public CivicAddress RDSUBBR(String RDSUBBR) {
    this.RDSUBBR = RDSUBBR;
    return this;
  }

  /**
   * Get RDSUBBR
   * @return RDSUBBR
  **/
  @ApiModelProperty(value = "")
  
    public String getRDSUBBR() {
    return RDSUBBR;
  }

  public void setRDSUBBR(String RDSUBBR) {
    this.RDSUBBR = RDSUBBR;
  }

  public CivicAddress PRM(String PRM) {
    this.PRM = PRM;
    return this;
  }

  /**
   * Get PRM
   * @return PRM
  **/
  @ApiModelProperty(value = "")
  
    public String getPRM() {
    return PRM;
  }

  public void setPRM(String PRM) {
    this.PRM = PRM;
  }

  public CivicAddress POM(String POM) {
    this.POM = POM;
    return this;
  }

  /**
   * Get POM
   * @return POM
  **/
  @ApiModelProperty(value = "")
  
    public String getPOM() {
    return POM;
  }

  public void setPOM(String POM) {
    this.POM = POM;
  }

  public CivicAddress usageRules(String usageRules) {
    this.usageRules = usageRules;
    return this;
  }

  /**
   * Get usageRules
   * @return usageRules
  **/
  @ApiModelProperty(value = "")
  
    public String getUsageRules() {
    return usageRules;
  }

  public void setUsageRules(String usageRules) {
    this.usageRules = usageRules;
  }

  public CivicAddress method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  
    public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public CivicAddress providedBy(String providedBy) {
    this.providedBy = providedBy;
    return this;
  }

  /**
   * Get providedBy
   * @return providedBy
  **/
  @ApiModelProperty(value = "")
  
    public String getProvidedBy() {
    return providedBy;
  }

  public void setProvidedBy(String providedBy) {
    this.providedBy = providedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CivicAddress civicAddress = (CivicAddress) o;
    return Objects.equals(this.country, civicAddress.country) &&
        Objects.equals(this.a1, civicAddress.a1) &&
        Objects.equals(this.a2, civicAddress.a2) &&
        Objects.equals(this.a3, civicAddress.a3) &&
        Objects.equals(this.a4, civicAddress.a4) &&
        Objects.equals(this.a5, civicAddress.a5) &&
        Objects.equals(this.a6, civicAddress.a6) &&
        Objects.equals(this.PRD, civicAddress.PRD) &&
        Objects.equals(this.POD, civicAddress.POD) &&
        Objects.equals(this.STS, civicAddress.STS) &&
        Objects.equals(this.HNO, civicAddress.HNO) &&
        Objects.equals(this.HNS, civicAddress.HNS) &&
        Objects.equals(this.LMK, civicAddress.LMK) &&
        Objects.equals(this.LOC, civicAddress.LOC) &&
        Objects.equals(this.NAM, civicAddress.NAM) &&
        Objects.equals(this.PC, civicAddress.PC) &&
        Objects.equals(this.BLD, civicAddress.BLD) &&
        Objects.equals(this.UNIT, civicAddress.UNIT) &&
        Objects.equals(this.FLR, civicAddress.FLR) &&
        Objects.equals(this.ROOM, civicAddress.ROOM) &&
        Objects.equals(this.PLC, civicAddress.PLC) &&
        Objects.equals(this.PCN, civicAddress.PCN) &&
        Objects.equals(this.POBOX, civicAddress.POBOX) &&
        Objects.equals(this.ADDCODE, civicAddress.ADDCODE) &&
        Objects.equals(this.SEAT, civicAddress.SEAT) &&
        Objects.equals(this.RD, civicAddress.RD) &&
        Objects.equals(this.RDSEC, civicAddress.RDSEC) &&
        Objects.equals(this.RDBR, civicAddress.RDBR) &&
        Objects.equals(this.RDSUBBR, civicAddress.RDSUBBR) &&
        Objects.equals(this.PRM, civicAddress.PRM) &&
        Objects.equals(this.POM, civicAddress.POM) &&
        Objects.equals(this.usageRules, civicAddress.usageRules) &&
        Objects.equals(this.method, civicAddress.method) &&
        Objects.equals(this.providedBy, civicAddress.providedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, a1, a2, a3, a4, a5, a6, PRD, POD, STS, HNO, HNS, LMK, LOC, NAM, PC, BLD, UNIT, FLR, ROOM, PLC, PCN, POBOX, ADDCODE, SEAT, RD, RDSEC, RDBR, RDSUBBR, PRM, POM, usageRules, method, providedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CivicAddress {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    a1: ").append(toIndentedString(a1)).append("\n");
    sb.append("    a2: ").append(toIndentedString(a2)).append("\n");
    sb.append("    a3: ").append(toIndentedString(a3)).append("\n");
    sb.append("    a4: ").append(toIndentedString(a4)).append("\n");
    sb.append("    a5: ").append(toIndentedString(a5)).append("\n");
    sb.append("    a6: ").append(toIndentedString(a6)).append("\n");
    sb.append("    PRD: ").append(toIndentedString(PRD)).append("\n");
    sb.append("    POD: ").append(toIndentedString(POD)).append("\n");
    sb.append("    STS: ").append(toIndentedString(STS)).append("\n");
    sb.append("    HNO: ").append(toIndentedString(HNO)).append("\n");
    sb.append("    HNS: ").append(toIndentedString(HNS)).append("\n");
    sb.append("    LMK: ").append(toIndentedString(LMK)).append("\n");
    sb.append("    LOC: ").append(toIndentedString(LOC)).append("\n");
    sb.append("    NAM: ").append(toIndentedString(NAM)).append("\n");
    sb.append("    PC: ").append(toIndentedString(PC)).append("\n");
    sb.append("    BLD: ").append(toIndentedString(BLD)).append("\n");
    sb.append("    UNIT: ").append(toIndentedString(UNIT)).append("\n");
    sb.append("    FLR: ").append(toIndentedString(FLR)).append("\n");
    sb.append("    ROOM: ").append(toIndentedString(ROOM)).append("\n");
    sb.append("    PLC: ").append(toIndentedString(PLC)).append("\n");
    sb.append("    PCN: ").append(toIndentedString(PCN)).append("\n");
    sb.append("    POBOX: ").append(toIndentedString(POBOX)).append("\n");
    sb.append("    ADDCODE: ").append(toIndentedString(ADDCODE)).append("\n");
    sb.append("    SEAT: ").append(toIndentedString(SEAT)).append("\n");
    sb.append("    RD: ").append(toIndentedString(RD)).append("\n");
    sb.append("    RDSEC: ").append(toIndentedString(RDSEC)).append("\n");
    sb.append("    RDBR: ").append(toIndentedString(RDBR)).append("\n");
    sb.append("    RDSUBBR: ").append(toIndentedString(RDSUBBR)).append("\n");
    sb.append("    PRM: ").append(toIndentedString(PRM)).append("\n");
    sb.append("    POM: ").append(toIndentedString(POM)).append("\n");
    sb.append("    usageRules: ").append(toIndentedString(usageRules)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    providedBy: ").append(toIndentedString(providedBy)).append("\n");
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
