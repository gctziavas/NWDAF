package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.GlobalRanNodeId;
import io.nwdaf.analytics.model.Ncgi;
import io.nwdaf.analytics.model.Tai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the NR user location.
 */
@ApiModel(description = "Contains the NR user location.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NrLocation   {
  @JsonProperty("tai")
  private Tai tai = null;

  @JsonProperty("ncgi")
  private Ncgi ncgi = null;

  @JsonProperty("ageOfLocationInformation")
  private Integer ageOfLocationInformation = null;

  @JsonProperty("ueLocationTimestamp")
  private OffsetDateTime ueLocationTimestamp = null;

  @JsonProperty("geographicalInformation")
  private String geographicalInformation = null;

  @JsonProperty("geodeticInformation")
  private String geodeticInformation = null;

  @JsonProperty("globalGnbId")
  private GlobalRanNodeId globalGnbId = null;

  public NrLocation tai(Tai tai) {
    this.tai = tai;
    return this;
  }

  /**
   * Get tai
   * @return tai
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Tai getTai() {
    return tai;
  }

  public void setTai(Tai tai) {
    this.tai = tai;
  }

  public NrLocation ncgi(Ncgi ncgi) {
    this.ncgi = ncgi;
    return this;
  }

  /**
   * Get ncgi
   * @return ncgi
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Ncgi getNcgi() {
    return ncgi;
  }

  public void setNcgi(Ncgi ncgi) {
    this.ncgi = ncgi;
  }

  public NrLocation ageOfLocationInformation(Integer ageOfLocationInformation) {
    this.ageOfLocationInformation = ageOfLocationInformation;
    return this;
  }

  /**
   * The value represents the elapsed time in minutes since the last network contact of the mobile station.  Value \"0\" indicates that the location information was obtained after a successful paging procedure for Active Location Retrieval when the UE is in idle mode or after a successful NG-RAN location reporting procedure with the eNB when the UE is in connected mode. Any other value than \"0\" indicates that the location information is the last known one. See 3GPP TS 29.002 clause 17.7.8. 
   * minimum: 0
   * maximum: 32767
   * @return ageOfLocationInformation
  **/
  @ApiModelProperty(value = "The value represents the elapsed time in minutes since the last network contact of the mobile station.  Value \"0\" indicates that the location information was obtained after a successful paging procedure for Active Location Retrieval when the UE is in idle mode or after a successful NG-RAN location reporting procedure with the eNB when the UE is in connected mode. Any other value than \"0\" indicates that the location information is the last known one. See 3GPP TS 29.002 clause 17.7.8. ")
  
  @Min(0) @Max(32767)   public Integer getAgeOfLocationInformation() {
    return ageOfLocationInformation;
  }

  public void setAgeOfLocationInformation(Integer ageOfLocationInformation) {
    this.ageOfLocationInformation = ageOfLocationInformation;
  }

  public NrLocation ueLocationTimestamp(OffsetDateTime ueLocationTimestamp) {
    this.ueLocationTimestamp = ueLocationTimestamp;
    return this;
  }

  /**
   * Get ueLocationTimestamp
   * @return ueLocationTimestamp
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getUeLocationTimestamp() {
    return ueLocationTimestamp;
  }

  public void setUeLocationTimestamp(OffsetDateTime ueLocationTimestamp) {
    this.ueLocationTimestamp = ueLocationTimestamp;
  }

  public NrLocation geographicalInformation(String geographicalInformation) {
    this.geographicalInformation = geographicalInformation;
    return this;
  }

  /**
   * Refer to geographical Information. See 3GPP TS 23.032 clause 7.3.2. Only the description of an ellipsoid point with uncertainty circle is allowed to be used.
   * @return geographicalInformation
  **/
  @ApiModelProperty(value = "Refer to geographical Information. See 3GPP TS 23.032 clause 7.3.2. Only the description of an ellipsoid point with uncertainty circle is allowed to be used.")
  
  @Pattern(regexp="^[0-9A-F]{16}$")   public String getGeographicalInformation() {
    return geographicalInformation;
  }

  public void setGeographicalInformation(String geographicalInformation) {
    this.geographicalInformation = geographicalInformation;
  }

  public NrLocation geodeticInformation(String geodeticInformation) {
    this.geodeticInformation = geodeticInformation;
    return this;
  }

  /**
   * Refers to Calling Geodetic Location. See ITU-T Recommendation Q.763 (1999) [24] clause 3.88.2. Only the description of an ellipsoid point with uncertainty circle is allowed to be used.
   * @return geodeticInformation
  **/
  @ApiModelProperty(value = "Refers to Calling Geodetic Location. See ITU-T Recommendation Q.763 (1999) [24] clause 3.88.2. Only the description of an ellipsoid point with uncertainty circle is allowed to be used.")
  
  @Pattern(regexp="^[0-9A-F]{20}$")   public String getGeodeticInformation() {
    return geodeticInformation;
  }

  public void setGeodeticInformation(String geodeticInformation) {
    this.geodeticInformation = geodeticInformation;
  }

  public NrLocation globalGnbId(GlobalRanNodeId globalGnbId) {
    this.globalGnbId = globalGnbId;
    return this;
  }

  /**
   * Get globalGnbId
   * @return globalGnbId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GlobalRanNodeId getGlobalGnbId() {
    return globalGnbId;
  }

  public void setGlobalGnbId(GlobalRanNodeId globalGnbId) {
    this.globalGnbId = globalGnbId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NrLocation nrLocation = (NrLocation) o;
    return Objects.equals(this.tai, nrLocation.tai) &&
        Objects.equals(this.ncgi, nrLocation.ncgi) &&
        Objects.equals(this.ageOfLocationInformation, nrLocation.ageOfLocationInformation) &&
        Objects.equals(this.ueLocationTimestamp, nrLocation.ueLocationTimestamp) &&
        Objects.equals(this.geographicalInformation, nrLocation.geographicalInformation) &&
        Objects.equals(this.geodeticInformation, nrLocation.geodeticInformation) &&
        Objects.equals(this.globalGnbId, nrLocation.globalGnbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tai, ncgi, ageOfLocationInformation, ueLocationTimestamp, geographicalInformation, geodeticInformation, globalGnbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NrLocation {\n");
    
    sb.append("    tai: ").append(toIndentedString(tai)).append("\n");
    sb.append("    ncgi: ").append(toIndentedString(ncgi)).append("\n");
    sb.append("    ageOfLocationInformation: ").append(toIndentedString(ageOfLocationInformation)).append("\n");
    sb.append("    ueLocationTimestamp: ").append(toIndentedString(ueLocationTimestamp)).append("\n");
    sb.append("    geographicalInformation: ").append(toIndentedString(geographicalInformation)).append("\n");
    sb.append("    geodeticInformation: ").append(toIndentedString(geodeticInformation)).append("\n");
    sb.append("    globalGnbId: ").append(toIndentedString(globalGnbId)).append("\n");
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
