package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.AddressList;
import io.nwdaf.analytics.model.CircumstanceDescription;
import io.nwdaf.analytics.model.IpEthFlowDescription;
import io.nwdaf.analytics.model.NetworkAreaInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents additional measurement information.
 */
@ApiModel(description = "Represents additional measurement information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class AdditionalMeasurement   {
  @JsonProperty("unexpLoc")
  private NetworkAreaInfo unexpLoc = null;

  @JsonProperty("unexpFlowTeps")
  @Valid
  private List<IpEthFlowDescription> unexpFlowTeps = null;

  @JsonProperty("unexpWakes")
  @Valid
  private List<OffsetDateTime> unexpWakes = null;

  @JsonProperty("ddosAttack")
  private AddressList ddosAttack = null;

  @JsonProperty("wrgDest")
  private AddressList wrgDest = null;

  @JsonProperty("circums")
  @Valid
  private List<CircumstanceDescription> circums = null;

  public AdditionalMeasurement unexpLoc(NetworkAreaInfo unexpLoc) {
    this.unexpLoc = unexpLoc;
    return this;
  }

  /**
   * Get unexpLoc
   * @return unexpLoc
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NetworkAreaInfo getUnexpLoc() {
    return unexpLoc;
  }

  public void setUnexpLoc(NetworkAreaInfo unexpLoc) {
    this.unexpLoc = unexpLoc;
  }

  public AdditionalMeasurement unexpFlowTeps(List<IpEthFlowDescription> unexpFlowTeps) {
    this.unexpFlowTeps = unexpFlowTeps;
    return this;
  }

  public AdditionalMeasurement addUnexpFlowTepsItem(IpEthFlowDescription unexpFlowTepsItem) {
    if (this.unexpFlowTeps == null) {
      this.unexpFlowTeps = new ArrayList<>();
    }
    this.unexpFlowTeps.add(unexpFlowTepsItem);
    return this;
  }

  /**
   * Get unexpFlowTeps
   * @return unexpFlowTeps
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<IpEthFlowDescription> getUnexpFlowTeps() {
    return unexpFlowTeps;
  }

  public void setUnexpFlowTeps(List<IpEthFlowDescription> unexpFlowTeps) {
    this.unexpFlowTeps = unexpFlowTeps;
  }

  public AdditionalMeasurement unexpWakes(List<OffsetDateTime> unexpWakes) {
    this.unexpWakes = unexpWakes;
    return this;
  }

  public AdditionalMeasurement addUnexpWakesItem(OffsetDateTime unexpWakesItem) {
    if (this.unexpWakes == null) {
      this.unexpWakes = new ArrayList<>();
    }
    this.unexpWakes.add(unexpWakesItem);
    return this;
  }

  /**
   * Get unexpWakes
   * @return unexpWakes
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<OffsetDateTime> getUnexpWakes() {
    return unexpWakes;
  }

  public void setUnexpWakes(List<OffsetDateTime> unexpWakes) {
    this.unexpWakes = unexpWakes;
  }

  public AdditionalMeasurement ddosAttack(AddressList ddosAttack) {
    this.ddosAttack = ddosAttack;
    return this;
  }

  /**
   * Get ddosAttack
   * @return ddosAttack
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AddressList getDdosAttack() {
    return ddosAttack;
  }

  public void setDdosAttack(AddressList ddosAttack) {
    this.ddosAttack = ddosAttack;
  }

  public AdditionalMeasurement wrgDest(AddressList wrgDest) {
    this.wrgDest = wrgDest;
    return this;
  }

  /**
   * Get wrgDest
   * @return wrgDest
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AddressList getWrgDest() {
    return wrgDest;
  }

  public void setWrgDest(AddressList wrgDest) {
    this.wrgDest = wrgDest;
  }

  public AdditionalMeasurement circums(List<CircumstanceDescription> circums) {
    this.circums = circums;
    return this;
  }

  public AdditionalMeasurement addCircumsItem(CircumstanceDescription circumsItem) {
    if (this.circums == null) {
      this.circums = new ArrayList<>();
    }
    this.circums.add(circumsItem);
    return this;
  }

  /**
   * Get circums
   * @return circums
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<CircumstanceDescription> getCircums() {
    return circums;
  }

  public void setCircums(List<CircumstanceDescription> circums) {
    this.circums = circums;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalMeasurement additionalMeasurement = (AdditionalMeasurement) o;
    return Objects.equals(this.unexpLoc, additionalMeasurement.unexpLoc) &&
        Objects.equals(this.unexpFlowTeps, additionalMeasurement.unexpFlowTeps) &&
        Objects.equals(this.unexpWakes, additionalMeasurement.unexpWakes) &&
        Objects.equals(this.ddosAttack, additionalMeasurement.ddosAttack) &&
        Objects.equals(this.wrgDest, additionalMeasurement.wrgDest) &&
        Objects.equals(this.circums, additionalMeasurement.circums);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unexpLoc, unexpFlowTeps, unexpWakes, ddosAttack, wrgDest, circums);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalMeasurement {\n");
    
    sb.append("    unexpLoc: ").append(toIndentedString(unexpLoc)).append("\n");
    sb.append("    unexpFlowTeps: ").append(toIndentedString(unexpFlowTeps)).append("\n");
    sb.append("    unexpWakes: ").append(toIndentedString(unexpWakes)).append("\n");
    sb.append("    ddosAttack: ").append(toIndentedString(ddosAttack)).append("\n");
    sb.append("    wrgDest: ").append(toIndentedString(wrgDest)).append("\n");
    sb.append("    circums: ").append(toIndentedString(circums)).append("\n");
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
