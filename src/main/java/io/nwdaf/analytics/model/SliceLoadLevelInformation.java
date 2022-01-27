package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.NumberAverage;
import io.nwdaf.analytics.model.Snssai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains load level information applicable for one or several slices.
 */
@ApiModel(description = "Contains load level information applicable for one or several slices.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class SliceLoadLevelInformation   {
  @JsonProperty("loadLevelInformation")
  private Integer loadLevelInformation = null;

  @JsonProperty("snssais")
  @Valid
  private List<Snssai> snssais = new ArrayList<>();

  @JsonProperty("numOfUes")
  private NumberAverage numOfUes = null;

  @JsonProperty("numOfPduSess")
  private NumberAverage numOfPduSess = null;

  @JsonProperty("exceedLoadLevelThrInd")
  private Boolean exceedLoadLevelThrInd = null;

  @JsonProperty("confidence")
  private Integer confidence = null;

  public SliceLoadLevelInformation loadLevelInformation(Integer loadLevelInformation) {
    this.loadLevelInformation = loadLevelInformation;
    return this;
  }

  /**
   * Get loadLevelInformation
   * @return loadLevelInformation
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Integer getLoadLevelInformation() {
    return loadLevelInformation;
  }

  public void setLoadLevelInformation(Integer loadLevelInformation) {
    this.loadLevelInformation = loadLevelInformation;
  }

  public SliceLoadLevelInformation snssais(List<Snssai> snssais) {
    this.snssais = snssais;
    return this;
  }

  public SliceLoadLevelInformation addSnssaisItem(Snssai snssaisItem) {
    this.snssais.add(snssaisItem);
    return this;
  }

  /**
   * Identification(s) of network slice to which the subscription applies.
   * @return snssais
  **/
  @ApiModelProperty(required = true, value = "Identification(s) of network slice to which the subscription applies.")
      @NotNull
    @Valid
  @Size(min=1)   public List<Snssai> getSnssais() {
    return snssais;
  }

  public void setSnssais(List<Snssai> snssais) {
    this.snssais = snssais;
  }

  public SliceLoadLevelInformation numOfUes(NumberAverage numOfUes) {
    this.numOfUes = numOfUes;
    return this;
  }

  /**
   * Get numOfUes
   * @return numOfUes
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NumberAverage getNumOfUes() {
    return numOfUes;
  }

  public void setNumOfUes(NumberAverage numOfUes) {
    this.numOfUes = numOfUes;
  }

  public SliceLoadLevelInformation numOfPduSess(NumberAverage numOfPduSess) {
    this.numOfPduSess = numOfPduSess;
    return this;
  }

  /**
   * Get numOfPduSess
   * @return numOfPduSess
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NumberAverage getNumOfPduSess() {
    return numOfPduSess;
  }

  public void setNumOfPduSess(NumberAverage numOfPduSess) {
    this.numOfPduSess = numOfPduSess;
  }

  public SliceLoadLevelInformation exceedLoadLevelThrInd(Boolean exceedLoadLevelThrInd) {
    this.exceedLoadLevelThrInd = exceedLoadLevelThrInd;
    return this;
  }

  /**
   * Get exceedLoadLevelThrInd
   * @return exceedLoadLevelThrInd
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isExceedLoadLevelThrInd() {
    return exceedLoadLevelThrInd;
  }

  public void setExceedLoadLevelThrInd(Boolean exceedLoadLevelThrInd) {
    this.exceedLoadLevelThrInd = exceedLoadLevelThrInd;
  }

  public SliceLoadLevelInformation confidence(Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Get confidence
   * @return confidence
  **/
  @ApiModelProperty(value = "")
  
    public Integer getConfidence() {
    return confidence;
  }

  public void setConfidence(Integer confidence) {
    this.confidence = confidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SliceLoadLevelInformation sliceLoadLevelInformation = (SliceLoadLevelInformation) o;
    return Objects.equals(this.loadLevelInformation, sliceLoadLevelInformation.loadLevelInformation) &&
        Objects.equals(this.snssais, sliceLoadLevelInformation.snssais) &&
        Objects.equals(this.numOfUes, sliceLoadLevelInformation.numOfUes) &&
        Objects.equals(this.numOfPduSess, sliceLoadLevelInformation.numOfPduSess) &&
        Objects.equals(this.exceedLoadLevelThrInd, sliceLoadLevelInformation.exceedLoadLevelThrInd) &&
        Objects.equals(this.confidence, sliceLoadLevelInformation.confidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadLevelInformation, snssais, numOfUes, numOfPduSess, exceedLoadLevelThrInd, confidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SliceLoadLevelInformation {\n");
    
    sb.append("    loadLevelInformation: ").append(toIndentedString(loadLevelInformation)).append("\n");
    sb.append("    snssais: ").append(toIndentedString(snssais)).append("\n");
    sb.append("    numOfUes: ").append(toIndentedString(numOfUes)).append("\n");
    sb.append("    numOfPduSess: ").append(toIndentedString(numOfPduSess)).append("\n");
    sb.append("    exceedLoadLevelThrInd: ").append(toIndentedString(exceedLoadLevelThrInd)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
