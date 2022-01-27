package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.AbnormalBehaviour;
import io.nwdaf.analytics.model.AnalyticsMetadataInfo;
import io.nwdaf.analytics.model.DnPerfInfo;
import io.nwdaf.analytics.model.NetworkPerfInfo;
import io.nwdaf.analytics.model.NfLoadLevelInformation;
import io.nwdaf.analytics.model.NsiLoadLevelInfo;
import io.nwdaf.analytics.model.NwdafEvent;
import io.nwdaf.analytics.model.NwdafFailureCode;
import io.nwdaf.analytics.model.QosSustainabilityInfo;
import io.nwdaf.analytics.model.ServiceExperienceInfo;
import io.nwdaf.analytics.model.SliceLoadLevelInformation;
import io.nwdaf.analytics.model.UeCommunication;
import io.nwdaf.analytics.model.UeMobility;
import io.nwdaf.analytics.model.UserDataCongestionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a notification on events that occurred.
 */
@ApiModel(description = "Represents a notification on events that occurred.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class EventNotification   {
  @JsonProperty("event")
  private NwdafEvent event = null;

  @JsonProperty("start")
  private OffsetDateTime start = null;

  @JsonProperty("expiry")
  private OffsetDateTime expiry = null;

  @JsonProperty("timeStampGen")
  private OffsetDateTime timeStampGen = null;

  @JsonProperty("failNotifyCode")
  private NwdafFailureCode failNotifyCode = null;

  @JsonProperty("rvWaitTime")
  private Integer rvWaitTime = null;

  @JsonProperty("anaMetaInfo")
  private AnalyticsMetadataInfo anaMetaInfo = null;

  @JsonProperty("nfLoadLevelInfos")
  @Valid
  private List<NfLoadLevelInformation> nfLoadLevelInfos = null;

  @JsonProperty("nsiLoadLevelInfos")
  @Valid
  private List<NsiLoadLevelInfo> nsiLoadLevelInfos = null;

  @JsonProperty("sliceLoadLevelInfo")
  private SliceLoadLevelInformation sliceLoadLevelInfo = null;

  @JsonProperty("svcExps")
  @Valid
  private List<ServiceExperienceInfo> svcExps = null;

  @JsonProperty("qosSustainInfos")
  @Valid
  private List<QosSustainabilityInfo> qosSustainInfos = null;

  @JsonProperty("ueComms")
  @Valid
  private List<UeCommunication> ueComms = null;

  @JsonProperty("ueMobs")
  @Valid
  private List<UeMobility> ueMobs = null;

  @JsonProperty("userDataCongInfos")
  @Valid
  private List<UserDataCongestionInfo> userDataCongInfos = null;

  @JsonProperty("abnorBehavrs")
  @Valid
  private List<AbnormalBehaviour> abnorBehavrs = null;

  @JsonProperty("nwPerfs")
  @Valid
  private List<NetworkPerfInfo> nwPerfs = null;

  @JsonProperty("dnPerfInfos")
  @Valid
  private List<DnPerfInfo> dnPerfInfos = null;

  public EventNotification event(NwdafEvent event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public NwdafEvent getEvent() {
    return event;
  }

  public void setEvent(NwdafEvent event) {
    this.event = event;
  }

  public EventNotification start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public EventNotification expiry(OffsetDateTime expiry) {
    this.expiry = expiry;
    return this;
  }

  /**
   * Get expiry
   * @return expiry
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getExpiry() {
    return expiry;
  }

  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }

  public EventNotification timeStampGen(OffsetDateTime timeStampGen) {
    this.timeStampGen = timeStampGen;
    return this;
  }

  /**
   * Get timeStampGen
   * @return timeStampGen
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getTimeStampGen() {
    return timeStampGen;
  }

  public void setTimeStampGen(OffsetDateTime timeStampGen) {
    this.timeStampGen = timeStampGen;
  }

  public EventNotification failNotifyCode(NwdafFailureCode failNotifyCode) {
    this.failNotifyCode = failNotifyCode;
    return this;
  }

  /**
   * Get failNotifyCode
   * @return failNotifyCode
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public NwdafFailureCode getFailNotifyCode() {
    return failNotifyCode;
  }

  public void setFailNotifyCode(NwdafFailureCode failNotifyCode) {
    this.failNotifyCode = failNotifyCode;
  }

  public EventNotification rvWaitTime(Integer rvWaitTime) {
    this.rvWaitTime = rvWaitTime;
    return this;
  }

  /**
   * Get rvWaitTime
   * @return rvWaitTime
  **/
  @ApiModelProperty(value = "")
  
    public Integer getRvWaitTime() {
    return rvWaitTime;
  }

  public void setRvWaitTime(Integer rvWaitTime) {
    this.rvWaitTime = rvWaitTime;
  }

  public EventNotification anaMetaInfo(AnalyticsMetadataInfo anaMetaInfo) {
    this.anaMetaInfo = anaMetaInfo;
    return this;
  }

  /**
   * Get anaMetaInfo
   * @return anaMetaInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public AnalyticsMetadataInfo getAnaMetaInfo() {
    return anaMetaInfo;
  }

  public void setAnaMetaInfo(AnalyticsMetadataInfo anaMetaInfo) {
    this.anaMetaInfo = anaMetaInfo;
  }

  public EventNotification nfLoadLevelInfos(List<NfLoadLevelInformation> nfLoadLevelInfos) {
    this.nfLoadLevelInfos = nfLoadLevelInfos;
    return this;
  }

  public EventNotification addNfLoadLevelInfosItem(NfLoadLevelInformation nfLoadLevelInfosItem) {
    if (this.nfLoadLevelInfos == null) {
      this.nfLoadLevelInfos = new ArrayList<>();
    }
    this.nfLoadLevelInfos.add(nfLoadLevelInfosItem);
    return this;
  }

  /**
   * Get nfLoadLevelInfos
   * @return nfLoadLevelInfos
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<NfLoadLevelInformation> getNfLoadLevelInfos() {
    return nfLoadLevelInfos;
  }

  public void setNfLoadLevelInfos(List<NfLoadLevelInformation> nfLoadLevelInfos) {
    this.nfLoadLevelInfos = nfLoadLevelInfos;
  }

  public EventNotification nsiLoadLevelInfos(List<NsiLoadLevelInfo> nsiLoadLevelInfos) {
    this.nsiLoadLevelInfos = nsiLoadLevelInfos;
    return this;
  }

  public EventNotification addNsiLoadLevelInfosItem(NsiLoadLevelInfo nsiLoadLevelInfosItem) {
    if (this.nsiLoadLevelInfos == null) {
      this.nsiLoadLevelInfos = new ArrayList<>();
    }
    this.nsiLoadLevelInfos.add(nsiLoadLevelInfosItem);
    return this;
  }

  /**
   * Get nsiLoadLevelInfos
   * @return nsiLoadLevelInfos
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<NsiLoadLevelInfo> getNsiLoadLevelInfos() {
    return nsiLoadLevelInfos;
  }

  public void setNsiLoadLevelInfos(List<NsiLoadLevelInfo> nsiLoadLevelInfos) {
    this.nsiLoadLevelInfos = nsiLoadLevelInfos;
  }

  public EventNotification sliceLoadLevelInfo(SliceLoadLevelInformation sliceLoadLevelInfo) {
    this.sliceLoadLevelInfo = sliceLoadLevelInfo;
    return this;
  }

  /**
   * Get sliceLoadLevelInfo
   * @return sliceLoadLevelInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SliceLoadLevelInformation getSliceLoadLevelInfo() {
    return sliceLoadLevelInfo;
  }

  public void setSliceLoadLevelInfo(SliceLoadLevelInformation sliceLoadLevelInfo) {
    this.sliceLoadLevelInfo = sliceLoadLevelInfo;
  }

  public EventNotification svcExps(List<ServiceExperienceInfo> svcExps) {
    this.svcExps = svcExps;
    return this;
  }

  public EventNotification addSvcExpsItem(ServiceExperienceInfo svcExpsItem) {
    if (this.svcExps == null) {
      this.svcExps = new ArrayList<>();
    }
    this.svcExps.add(svcExpsItem);
    return this;
  }

  /**
   * Get svcExps
   * @return svcExps
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<ServiceExperienceInfo> getSvcExps() {
    return svcExps;
  }

  public void setSvcExps(List<ServiceExperienceInfo> svcExps) {
    this.svcExps = svcExps;
  }

  public EventNotification qosSustainInfos(List<QosSustainabilityInfo> qosSustainInfos) {
    this.qosSustainInfos = qosSustainInfos;
    return this;
  }

  public EventNotification addQosSustainInfosItem(QosSustainabilityInfo qosSustainInfosItem) {
    if (this.qosSustainInfos == null) {
      this.qosSustainInfos = new ArrayList<>();
    }
    this.qosSustainInfos.add(qosSustainInfosItem);
    return this;
  }

  /**
   * Get qosSustainInfos
   * @return qosSustainInfos
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<QosSustainabilityInfo> getQosSustainInfos() {
    return qosSustainInfos;
  }

  public void setQosSustainInfos(List<QosSustainabilityInfo> qosSustainInfos) {
    this.qosSustainInfos = qosSustainInfos;
  }

  public EventNotification ueComms(List<UeCommunication> ueComms) {
    this.ueComms = ueComms;
    return this;
  }

  public EventNotification addUeCommsItem(UeCommunication ueCommsItem) {
    if (this.ueComms == null) {
      this.ueComms = new ArrayList<>();
    }
    this.ueComms.add(ueCommsItem);
    return this;
  }

  /**
   * Get ueComms
   * @return ueComms
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<UeCommunication> getUeComms() {
    return ueComms;
  }

  public void setUeComms(List<UeCommunication> ueComms) {
    this.ueComms = ueComms;
  }

  public EventNotification ueMobs(List<UeMobility> ueMobs) {
    this.ueMobs = ueMobs;
    return this;
  }

  public EventNotification addUeMobsItem(UeMobility ueMobsItem) {
    if (this.ueMobs == null) {
      this.ueMobs = new ArrayList<>();
    }
    this.ueMobs.add(ueMobsItem);
    return this;
  }

  /**
   * Get ueMobs
   * @return ueMobs
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<UeMobility> getUeMobs() {
    return ueMobs;
  }

  public void setUeMobs(List<UeMobility> ueMobs) {
    this.ueMobs = ueMobs;
  }

  public EventNotification userDataCongInfos(List<UserDataCongestionInfo> userDataCongInfos) {
    this.userDataCongInfos = userDataCongInfos;
    return this;
  }

  public EventNotification addUserDataCongInfosItem(UserDataCongestionInfo userDataCongInfosItem) {
    if (this.userDataCongInfos == null) {
      this.userDataCongInfos = new ArrayList<>();
    }
    this.userDataCongInfos.add(userDataCongInfosItem);
    return this;
  }

  /**
   * Get userDataCongInfos
   * @return userDataCongInfos
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<UserDataCongestionInfo> getUserDataCongInfos() {
    return userDataCongInfos;
  }

  public void setUserDataCongInfos(List<UserDataCongestionInfo> userDataCongInfos) {
    this.userDataCongInfos = userDataCongInfos;
  }

  public EventNotification abnorBehavrs(List<AbnormalBehaviour> abnorBehavrs) {
    this.abnorBehavrs = abnorBehavrs;
    return this;
  }

  public EventNotification addAbnorBehavrsItem(AbnormalBehaviour abnorBehavrsItem) {
    if (this.abnorBehavrs == null) {
      this.abnorBehavrs = new ArrayList<>();
    }
    this.abnorBehavrs.add(abnorBehavrsItem);
    return this;
  }

  /**
   * Get abnorBehavrs
   * @return abnorBehavrs
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<AbnormalBehaviour> getAbnorBehavrs() {
    return abnorBehavrs;
  }

  public void setAbnorBehavrs(List<AbnormalBehaviour> abnorBehavrs) {
    this.abnorBehavrs = abnorBehavrs;
  }

  public EventNotification nwPerfs(List<NetworkPerfInfo> nwPerfs) {
    this.nwPerfs = nwPerfs;
    return this;
  }

  public EventNotification addNwPerfsItem(NetworkPerfInfo nwPerfsItem) {
    if (this.nwPerfs == null) {
      this.nwPerfs = new ArrayList<>();
    }
    this.nwPerfs.add(nwPerfsItem);
    return this;
  }

  /**
   * Get nwPerfs
   * @return nwPerfs
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<NetworkPerfInfo> getNwPerfs() {
    return nwPerfs;
  }

  public void setNwPerfs(List<NetworkPerfInfo> nwPerfs) {
    this.nwPerfs = nwPerfs;
  }

  public EventNotification dnPerfInfos(List<DnPerfInfo> dnPerfInfos) {
    this.dnPerfInfos = dnPerfInfos;
    return this;
  }

  public EventNotification addDnPerfInfosItem(DnPerfInfo dnPerfInfosItem) {
    if (this.dnPerfInfos == null) {
      this.dnPerfInfos = new ArrayList<>();
    }
    this.dnPerfInfos.add(dnPerfInfosItem);
    return this;
  }

  /**
   * Get dnPerfInfos
   * @return dnPerfInfos
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<DnPerfInfo> getDnPerfInfos() {
    return dnPerfInfos;
  }

  public void setDnPerfInfos(List<DnPerfInfo> dnPerfInfos) {
    this.dnPerfInfos = dnPerfInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNotification eventNotification = (EventNotification) o;
    return Objects.equals(this.event, eventNotification.event) &&
        Objects.equals(this.start, eventNotification.start) &&
        Objects.equals(this.expiry, eventNotification.expiry) &&
        Objects.equals(this.timeStampGen, eventNotification.timeStampGen) &&
        Objects.equals(this.failNotifyCode, eventNotification.failNotifyCode) &&
        Objects.equals(this.rvWaitTime, eventNotification.rvWaitTime) &&
        Objects.equals(this.anaMetaInfo, eventNotification.anaMetaInfo) &&
        Objects.equals(this.nfLoadLevelInfos, eventNotification.nfLoadLevelInfos) &&
        Objects.equals(this.nsiLoadLevelInfos, eventNotification.nsiLoadLevelInfos) &&
        Objects.equals(this.sliceLoadLevelInfo, eventNotification.sliceLoadLevelInfo) &&
        Objects.equals(this.svcExps, eventNotification.svcExps) &&
        Objects.equals(this.qosSustainInfos, eventNotification.qosSustainInfos) &&
        Objects.equals(this.ueComms, eventNotification.ueComms) &&
        Objects.equals(this.ueMobs, eventNotification.ueMobs) &&
        Objects.equals(this.userDataCongInfos, eventNotification.userDataCongInfos) &&
        Objects.equals(this.abnorBehavrs, eventNotification.abnorBehavrs) &&
        Objects.equals(this.nwPerfs, eventNotification.nwPerfs) &&
        Objects.equals(this.dnPerfInfos, eventNotification.dnPerfInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, start, expiry, timeStampGen, failNotifyCode, rvWaitTime, anaMetaInfo, nfLoadLevelInfos, nsiLoadLevelInfos, sliceLoadLevelInfo, svcExps, qosSustainInfos, ueComms, ueMobs, userDataCongInfos, abnorBehavrs, nwPerfs, dnPerfInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotification {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    timeStampGen: ").append(toIndentedString(timeStampGen)).append("\n");
    sb.append("    failNotifyCode: ").append(toIndentedString(failNotifyCode)).append("\n");
    sb.append("    rvWaitTime: ").append(toIndentedString(rvWaitTime)).append("\n");
    sb.append("    anaMetaInfo: ").append(toIndentedString(anaMetaInfo)).append("\n");
    sb.append("    nfLoadLevelInfos: ").append(toIndentedString(nfLoadLevelInfos)).append("\n");
    sb.append("    nsiLoadLevelInfos: ").append(toIndentedString(nsiLoadLevelInfos)).append("\n");
    sb.append("    sliceLoadLevelInfo: ").append(toIndentedString(sliceLoadLevelInfo)).append("\n");
    sb.append("    svcExps: ").append(toIndentedString(svcExps)).append("\n");
    sb.append("    qosSustainInfos: ").append(toIndentedString(qosSustainInfos)).append("\n");
    sb.append("    ueComms: ").append(toIndentedString(ueComms)).append("\n");
    sb.append("    ueMobs: ").append(toIndentedString(ueMobs)).append("\n");
    sb.append("    userDataCongInfos: ").append(toIndentedString(userDataCongInfos)).append("\n");
    sb.append("    abnorBehavrs: ").append(toIndentedString(abnorBehavrs)).append("\n");
    sb.append("    nwPerfs: ").append(toIndentedString(nwPerfs)).append("\n");
    sb.append("    dnPerfInfos: ").append(toIndentedString(dnPerfInfos)).append("\n");
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
