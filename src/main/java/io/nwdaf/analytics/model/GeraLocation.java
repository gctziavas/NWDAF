package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.CellGlobalId;
import io.nwdaf.analytics.model.LocationAreaId;
import io.nwdaf.analytics.model.RoutingAreaId;
import io.nwdaf.analytics.model.ServiceAreaId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Exactly one of cgi, sai or lai shall be present.
 */
@ApiModel(description = "Exactly one of cgi, sai or lai shall be present.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class GeraLocation  implements OneOfGeraLocation {
  @JsonProperty("locationNumber")
  private String locationNumber = null;

  @JsonProperty("cgi")
  private CellGlobalId cgi = null;

  @JsonProperty("rai")
  private RoutingAreaId rai = null;

  @JsonProperty("sai")
  private ServiceAreaId sai = null;

  @JsonProperty("lai")
  private LocationAreaId lai = null;

  @JsonProperty("vlrNumber")
  private String vlrNumber = null;

  @JsonProperty("mscNumber")
  private String mscNumber = null;

  @JsonProperty("ageOfLocationInformation")
  private Integer ageOfLocationInformation = null;

  @JsonProperty("ueLocationTimestamp")
  private OffsetDateTime ueLocationTimestamp = null;

  @JsonProperty("geographicalInformation")
  private String geographicalInformation = null;

  @JsonProperty("geodeticInformation")
  private String geodeticInformation = null;

  public GeraLocation locationNumber(String locationNumber) {
    this.locationNumber = locationNumber;
    return this;
  }

  /**
   * Location number within the PLMN. See 3GPP TS 23.003, clause 4.5.
   * @return locationNumber
  **/
  @ApiModelProperty(value = "Location number within the PLMN. See 3GPP TS 23.003, clause 4.5.")
  
    public String getLocationNumber() {
    return locationNumber;
  }

  public void setLocationNumber(String locationNumber) {
    this.locationNumber = locationNumber;
  }

  public GeraLocation cgi(CellGlobalId cgi) {
    this.cgi = cgi;
    return this;
  }

  /**
   * Get cgi
   * @return cgi
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public CellGlobalId getCgi() {
    return cgi;
  }

  public void setCgi(CellGlobalId cgi) {
    this.cgi = cgi;
  }

  public GeraLocation rai(RoutingAreaId rai) {
    this.rai = rai;
    return this;
  }

  /**
   * Get rai
   * @return rai
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public RoutingAreaId getRai() {
    return rai;
  }

  public void setRai(RoutingAreaId rai) {
    this.rai = rai;
  }

  public GeraLocation sai(ServiceAreaId sai) {
    this.sai = sai;
    return this;
  }

  /**
   * Get sai
   * @return sai
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ServiceAreaId getSai() {
    return sai;
  }

  public void setSai(ServiceAreaId sai) {
    this.sai = sai;
  }

  public GeraLocation lai(LocationAreaId lai) {
    this.lai = lai;
    return this;
  }

  /**
   * Get lai
   * @return lai
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public LocationAreaId getLai() {
    return lai;
  }

  public void setLai(LocationAreaId lai) {
    this.lai = lai;
  }

  public GeraLocation vlrNumber(String vlrNumber) {
    this.vlrNumber = vlrNumber;
    return this;
  }

  /**
   * VLR number. See 3GPP TS 23.003 clause 5.1.
   * @return vlrNumber
  **/
  @ApiModelProperty(value = "VLR number. See 3GPP TS 23.003 clause 5.1.")
  
    public String getVlrNumber() {
    return vlrNumber;
  }

  public void setVlrNumber(String vlrNumber) {
    this.vlrNumber = vlrNumber;
  }

  public GeraLocation mscNumber(String mscNumber) {
    this.mscNumber = mscNumber;
    return this;
  }

  /**
   * MSC number. See 3GPP TS 23.003 clause 5.1.
   * @return mscNumber
  **/
  @ApiModelProperty(value = "MSC number. See 3GPP TS 23.003 clause 5.1.")
  
    public String getMscNumber() {
    return mscNumber;
  }

  public void setMscNumber(String mscNumber) {
    this.mscNumber = mscNumber;
  }

  public GeraLocation ageOfLocationInformation(Integer ageOfLocationInformation) {
    this.ageOfLocationInformation = ageOfLocationInformation;
    return this;
  }

  /**
   * The value represents the elapsed time in minutes since the last network contact of the mobile station.  Value \"0\" indicates that the location information was obtained after a successful paging procedure for Active Location Retrieval when the UE is in idle mode or after a successful location reporting procedure the UE is in connected mode.Any other value than \"0\" indicates that the location information is the last known one.See 3GPP TS 29.002 clause 17.7.8.
   * minimum: 0
   * maximum: 32767
   * @return ageOfLocationInformation
  **/
  @ApiModelProperty(value = "The value represents the elapsed time in minutes since the last network contact of the mobile station.  Value \"0\" indicates that the location information was obtained after a successful paging procedure for Active Location Retrieval when the UE is in idle mode or after a successful location reporting procedure the UE is in connected mode.Any other value than \"0\" indicates that the location information is the last known one.See 3GPP TS 29.002 clause 17.7.8.")
  
  @Min(0) @Max(32767)   public Integer getAgeOfLocationInformation() {
    return ageOfLocationInformation;
  }

  public void setAgeOfLocationInformation(Integer ageOfLocationInformation) {
    this.ageOfLocationInformation = ageOfLocationInformation;
  }

  public GeraLocation ueLocationTimestamp(OffsetDateTime ueLocationTimestamp) {
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

  public GeraLocation geographicalInformation(String geographicalInformation) {
    this.geographicalInformation = geographicalInformation;
    return this;
  }

  /**
   * Refer to geographical Information.See 3GPP TS 23.032 clause 7.3.2. Only the description of an ellipsoid point with uncertainty circle is allowed to be used.
   * @return geographicalInformation
  **/
  @ApiModelProperty(value = "Refer to geographical Information.See 3GPP TS 23.032 clause 7.3.2. Only the description of an ellipsoid point with uncertainty circle is allowed to be used.")
  
  @Pattern(regexp="^[0-9A-F]{16}$")   public String getGeographicalInformation() {
    return geographicalInformation;
  }

  public void setGeographicalInformation(String geographicalInformation) {
    this.geographicalInformation = geographicalInformation;
  }

  public GeraLocation geodeticInformation(String geodeticInformation) {
    this.geodeticInformation = geodeticInformation;
    return this;
  }

  /**
   * Refers to Calling Geodetic Location.See ITU-T Recommendation Q.763 (1999) clause 3.88.2. Only the description of an ellipsoid point with uncertainty circle is allowed to be used.
   * @return geodeticInformation
  **/
  @ApiModelProperty(value = "Refers to Calling Geodetic Location.See ITU-T Recommendation Q.763 (1999) clause 3.88.2. Only the description of an ellipsoid point with uncertainty circle is allowed to be used.")
  
  @Pattern(regexp="^[0-9A-F]{20}$")   public String getGeodeticInformation() {
    return geodeticInformation;
  }

  public void setGeodeticInformation(String geodeticInformation) {
    this.geodeticInformation = geodeticInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeraLocation geraLocation = (GeraLocation) o;
    return Objects.equals(this.locationNumber, geraLocation.locationNumber) &&
        Objects.equals(this.cgi, geraLocation.cgi) &&
        Objects.equals(this.rai, geraLocation.rai) &&
        Objects.equals(this.sai, geraLocation.sai) &&
        Objects.equals(this.lai, geraLocation.lai) &&
        Objects.equals(this.vlrNumber, geraLocation.vlrNumber) &&
        Objects.equals(this.mscNumber, geraLocation.mscNumber) &&
        Objects.equals(this.ageOfLocationInformation, geraLocation.ageOfLocationInformation) &&
        Objects.equals(this.ueLocationTimestamp, geraLocation.ueLocationTimestamp) &&
        Objects.equals(this.geographicalInformation, geraLocation.geographicalInformation) &&
        Objects.equals(this.geodeticInformation, geraLocation.geodeticInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationNumber, cgi, rai, sai, lai, vlrNumber, mscNumber, ageOfLocationInformation, ueLocationTimestamp, geographicalInformation, geodeticInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeraLocation {\n");
    
    sb.append("    locationNumber: ").append(toIndentedString(locationNumber)).append("\n");
    sb.append("    cgi: ").append(toIndentedString(cgi)).append("\n");
    sb.append("    rai: ").append(toIndentedString(rai)).append("\n");
    sb.append("    sai: ").append(toIndentedString(sai)).append("\n");
    sb.append("    lai: ").append(toIndentedString(lai)).append("\n");
    sb.append("    vlrNumber: ").append(toIndentedString(vlrNumber)).append("\n");
    sb.append("    mscNumber: ").append(toIndentedString(mscNumber)).append("\n");
    sb.append("    ageOfLocationInformation: ").append(toIndentedString(ageOfLocationInformation)).append("\n");
    sb.append("    ueLocationTimestamp: ").append(toIndentedString(ueLocationTimestamp)).append("\n");
    sb.append("    geographicalInformation: ").append(toIndentedString(geographicalInformation)).append("\n");
    sb.append("    geodeticInformation: ").append(toIndentedString(geodeticInformation)).append("\n");
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
