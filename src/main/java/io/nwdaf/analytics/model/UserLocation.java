package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.EutraLocation;
import io.nwdaf.analytics.model.GeraLocation;
import io.nwdaf.analytics.model.N3gaLocation;
import io.nwdaf.analytics.model.NrLocation;
import io.nwdaf.analytics.model.UtraLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * At least one of eutraLocation, nrLocation and n3gaLocation shall be present. Several of them may be present
 */
@ApiModel(description = "At least one of eutraLocation, nrLocation and n3gaLocation shall be present. Several of them may be present")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class UserLocation   {
  @JsonProperty("eutraLocation")
  private EutraLocation eutraLocation = null;

  @JsonProperty("nrLocation")
  private NrLocation nrLocation = null;

  @JsonProperty("n3gaLocation")
  private N3gaLocation n3gaLocation = null;

  @JsonProperty("utraLocation")
  private UtraLocation utraLocation = null;

  @JsonProperty("geraLocation")
  private GeraLocation geraLocation = null;

  public UserLocation eutraLocation(EutraLocation eutraLocation) {
    this.eutraLocation = eutraLocation;
    return this;
  }

  /**
   * Get eutraLocation
   * @return eutraLocation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public EutraLocation getEutraLocation() {
    return eutraLocation;
  }

  public void setEutraLocation(EutraLocation eutraLocation) {
    this.eutraLocation = eutraLocation;
  }

  public UserLocation nrLocation(NrLocation nrLocation) {
    this.nrLocation = nrLocation;
    return this;
  }

  /**
   * Get nrLocation
   * @return nrLocation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NrLocation getNrLocation() {
    return nrLocation;
  }

  public void setNrLocation(NrLocation nrLocation) {
    this.nrLocation = nrLocation;
  }

  public UserLocation n3gaLocation(N3gaLocation n3gaLocation) {
    this.n3gaLocation = n3gaLocation;
    return this;
  }

  /**
   * Get n3gaLocation
   * @return n3gaLocation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public N3gaLocation getN3gaLocation() {
    return n3gaLocation;
  }

  public void setN3gaLocation(N3gaLocation n3gaLocation) {
    this.n3gaLocation = n3gaLocation;
  }

  public UserLocation utraLocation(UtraLocation utraLocation) {
    this.utraLocation = utraLocation;
    return this;
  }

  /**
   * Get utraLocation
   * @return utraLocation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UtraLocation getUtraLocation() {
    return utraLocation;
  }

  public void setUtraLocation(UtraLocation utraLocation) {
    this.utraLocation = utraLocation;
  }

  public UserLocation geraLocation(GeraLocation geraLocation) {
    this.geraLocation = geraLocation;
    return this;
  }

  /**
   * Get geraLocation
   * @return geraLocation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public GeraLocation getGeraLocation() {
    return geraLocation;
  }

  public void setGeraLocation(GeraLocation geraLocation) {
    this.geraLocation = geraLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLocation userLocation = (UserLocation) o;
    return Objects.equals(this.eutraLocation, userLocation.eutraLocation) &&
        Objects.equals(this.nrLocation, userLocation.nrLocation) &&
        Objects.equals(this.n3gaLocation, userLocation.n3gaLocation) &&
        Objects.equals(this.utraLocation, userLocation.utraLocation) &&
        Objects.equals(this.geraLocation, userLocation.geraLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eutraLocation, nrLocation, n3gaLocation, utraLocation, geraLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLocation {\n");
    
    sb.append("    eutraLocation: ").append(toIndentedString(eutraLocation)).append("\n");
    sb.append("    nrLocation: ").append(toIndentedString(nrLocation)).append("\n");
    sb.append("    n3gaLocation: ").append(toIndentedString(n3gaLocation)).append("\n");
    sb.append("    utraLocation: ").append(toIndentedString(utraLocation)).append("\n");
    sb.append("    geraLocation: ").append(toIndentedString(geraLocation)).append("\n");
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
