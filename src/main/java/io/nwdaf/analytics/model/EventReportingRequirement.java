package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.Accuracy;
import io.nwdaf.analytics.model.AnalyticsMetadata;
import io.nwdaf.analytics.model.AnalyticsMetadataIndication;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the type of reporting that the subscription requires.
 */
@ApiModel(description = "Represents the type of reporting that the subscription requires.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class EventReportingRequirement   {
  @JsonProperty("accuracy")
  private Accuracy accuracy = null;

  @JsonProperty("startTs")
  private OffsetDateTime startTs = null;

  @JsonProperty("endTs")
  private OffsetDateTime endTs = null;

  @JsonProperty("offsetPeriod")
  private Integer offsetPeriod = null;

  @JsonProperty("sampRatio")
  private Integer sampRatio = null;

  @JsonProperty("maxObjectNbr")
  private Integer maxObjectNbr = null;

  @JsonProperty("maxSupiNbr")
  private Integer maxSupiNbr = null;

  @JsonProperty("timeAnaNeeded")
  private OffsetDateTime timeAnaNeeded = null;

  @JsonProperty("anaMeta")
  @Valid
  private List<AnalyticsMetadata> anaMeta = null;

  @JsonProperty("anaMetaInd")
  private AnalyticsMetadataIndication anaMetaInd = null;

  public EventReportingRequirement accuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
    return this;
  }

  /**
   * Get accuracy
   * @return accuracy
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public Accuracy getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
  }

  public EventReportingRequirement startTs(OffsetDateTime startTs) {
    this.startTs = startTs;
    return this;
  }

  /**
   * Get startTs
   * @return startTs
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStartTs() {
    return startTs;
  }

  public void setStartTs(OffsetDateTime startTs) {
    this.startTs = startTs;
  }

  public EventReportingRequirement endTs(OffsetDateTime endTs) {
    this.endTs = endTs;
    return this;
  }

  /**
   * Get endTs
   * @return endTs
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEndTs() {
    return endTs;
  }

  public void setEndTs(OffsetDateTime endTs) {
    this.endTs = endTs;
  }

  public EventReportingRequirement offsetPeriod(Integer offsetPeriod) {
    this.offsetPeriod = offsetPeriod;
    return this;
  }

  /**
   * Offset period in units of seconds to the reporting time, if the value is negative means statistics in the past offset period, otherwise a positive value means prediction in the future offset period. May be present if the \"repPeriod\" attribute is included within the \"evtReq\" attribute.
   * @return offsetPeriod
  **/
  @ApiModelProperty(value = "Offset period in units of seconds to the reporting time, if the value is negative means statistics in the past offset period, otherwise a positive value means prediction in the future offset period. May be present if the \"repPeriod\" attribute is included within the \"evtReq\" attribute.")
  
    public Integer getOffsetPeriod() {
    return offsetPeriod;
  }

  public void setOffsetPeriod(Integer offsetPeriod) {
    this.offsetPeriod = offsetPeriod;
  }

  public EventReportingRequirement sampRatio(Integer sampRatio) {
	  if(sampRatio>0 && sampRatio<101) {
		  this.sampRatio = sampRatio;
	  }
	  else {
		  throw new IllegalArgumentException("SampRatio values range [1 , 100]."); 
	  }      
    return this;
  }

  /**
   * Get sampRatio
   * @return sampRatio
  **/
  @ApiModelProperty(value = "")
  
    public Integer getSampRatio() {
    return sampRatio;
  }

  public void setSampRatio(Integer sampRatio) {
	  if(sampRatio>0 && sampRatio<101) {
		  this.sampRatio = sampRatio;
	  }
	  else {
		  throw new IllegalArgumentException("SampRatio values range [1 , 100]."); 
	  }      
	      
  }

  public EventReportingRequirement maxObjectNbr(Integer maxObjectNbr) {
    if(maxObjectNbr>0) {
	  this.maxObjectNbr = maxObjectNbr;
    }
    else {
    	throw new IllegalArgumentException("maxObjectNbr cannot be of negative or zero value"); 
    }
    return this;
  }

  /**
   * Get maxObjectNbr
   * @return maxObjectNbr
  **/
  @ApiModelProperty(value = "")
  
    public Integer getMaxObjectNbr() {
    return maxObjectNbr;
  }

  public void setMaxObjectNbr(Integer maxObjectNbr) {
	  if(maxObjectNbr>0) {
		  this.maxObjectNbr = maxObjectNbr;
	    }
	    else {
	    	throw new IllegalArgumentException("maxObjectNbr cannot be of negative or zero value"); 
	    }
  }

  public EventReportingRequirement maxSupiNbr(Integer maxSupiNbr) {
	  if(maxSupiNbr>0) {
		  this.maxSupiNbr = maxSupiNbr;
	    }
	    else {
	    	throw new IllegalArgumentException("maxSupiNbr cannot be of negative or zero value"); 
	    }
    return this;
  }

  /**
   * Get maxSupiNbr
   * @return maxSupiNbr
  **/
  @ApiModelProperty(value = "")
  
    public Integer getMaxSupiNbr() {
    return maxSupiNbr;
  }

  public void setMaxSupiNbr(Integer maxSupiNbr) {
	  if(maxSupiNbr>0) {
		  this.maxSupiNbr = maxSupiNbr;
	  }
	  else {
		  throw new IllegalArgumentException("maxSupiNbr cannot be of negative or zero value"); 
	  }
  }

  public EventReportingRequirement timeAnaNeeded(OffsetDateTime timeAnaNeeded) {
    this.timeAnaNeeded = timeAnaNeeded;
    return this;
  }

  /**
   * Get timeAnaNeeded
   * @return timeAnaNeeded
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getTimeAnaNeeded() {
    return timeAnaNeeded;
  }

  public void setTimeAnaNeeded(OffsetDateTime timeAnaNeeded) {
    this.timeAnaNeeded = timeAnaNeeded;
  }

  public EventReportingRequirement anaMeta(List<AnalyticsMetadata> anaMeta) {
    this.anaMeta = anaMeta;
    return this;
  }

  	public EventReportingRequirement anaMetaFromStringList(List<String> anaMetaStringList) {
  		List<AnalyticsMetadata> anaMeta = null;
  		for(int i=0; i<anaMetaStringList.size(); i++) {
  			anaMeta.add(new AnalyticsMetadata(anaMetaStringList.get(i)));
  		}
  		this.anaMeta = anaMeta;
	    return this;
	  }
  
  public EventReportingRequirement addAnaMetaItem(AnalyticsMetadata anaMetaItem) {
    if (this.anaMeta == null) {
      this.anaMeta = new ArrayList<>();
    }
    this.anaMeta.add(anaMetaItem);
    return this;
  }
  
  public EventReportingRequirement addAnaMetaItemFromString(String anaMetaItem) {
	    if (this.anaMeta == null) {
	      this.anaMeta = new ArrayList<>();
	    }
	    this.anaMeta.add(new AnalyticsMetadata(anaMetaItem));
	    return this;
	  }
  
  

  /**
   * Get anaMeta
   * @return anaMeta
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<AnalyticsMetadata> getAnaMeta() {
    return anaMeta;
  }

  public void setAnaMeta(List<AnalyticsMetadata> anaMeta) {
    this.anaMeta = anaMeta;
  }
  
  public void setAnaMetaFromStringList(List<String> anaMetaStringList) {
		List<AnalyticsMetadata> anaMeta = new ArrayList<AnalyticsMetadata>();
		for(int i=0; i<anaMetaStringList.size(); i++) {
			anaMeta.add(new AnalyticsMetadata(anaMetaStringList.get(i)));
		}
		this.anaMeta = anaMeta;
  }
  
  public EventReportingRequirement anaMetaInd(AnalyticsMetadataIndication anaMetaInd) {
    this.anaMetaInd = anaMetaInd;
    return this;
  }

  /**
   * Get anaMetaInd
   * @return anaMetaInd
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AnalyticsMetadataIndication getAnaMetaInd() {
    return anaMetaInd;
  }

  public void setAnaMetaInd(AnalyticsMetadataIndication anaMetaInd) {
    this.anaMetaInd = anaMetaInd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventReportingRequirement eventReportingRequirement = (EventReportingRequirement) o;
    return Objects.equals(this.accuracy, eventReportingRequirement.accuracy) &&
        Objects.equals(this.startTs, eventReportingRequirement.startTs) &&
        Objects.equals(this.endTs, eventReportingRequirement.endTs) &&
        Objects.equals(this.offsetPeriod, eventReportingRequirement.offsetPeriod) &&
        Objects.equals(this.sampRatio, eventReportingRequirement.sampRatio) &&
        Objects.equals(this.maxObjectNbr, eventReportingRequirement.maxObjectNbr) &&
        Objects.equals(this.maxSupiNbr, eventReportingRequirement.maxSupiNbr) &&
        Objects.equals(this.timeAnaNeeded, eventReportingRequirement.timeAnaNeeded) &&
        Objects.equals(this.anaMeta, eventReportingRequirement.anaMeta) &&
        Objects.equals(this.anaMetaInd, eventReportingRequirement.anaMetaInd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accuracy, startTs, endTs, offsetPeriod, sampRatio, maxObjectNbr, maxSupiNbr, timeAnaNeeded, anaMeta, anaMetaInd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventReportingRequirement {\n");
    
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    startTs: ").append(toIndentedString(startTs)).append("\n");
    sb.append("    endTs: ").append(toIndentedString(endTs)).append("\n");
    sb.append("    offsetPeriod: ").append(toIndentedString(offsetPeriod)).append("\n");
    sb.append("    sampRatio: ").append(toIndentedString(sampRatio)).append("\n");
    sb.append("    maxObjectNbr: ").append(toIndentedString(maxObjectNbr)).append("\n");
    sb.append("    maxSupiNbr: ").append(toIndentedString(maxSupiNbr)).append("\n");
    sb.append("    timeAnaNeeded: ").append(toIndentedString(timeAnaNeeded)).append("\n");
    sb.append("    anaMeta: ").append(toIndentedString(anaMeta)).append("\n");
    sb.append("    anaMetaInd: ").append(toIndentedString(anaMetaInd)).append("\n");
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
