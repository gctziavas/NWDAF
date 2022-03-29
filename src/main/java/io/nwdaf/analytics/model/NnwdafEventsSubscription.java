package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.ConsumerNfInformation;
import io.nwdaf.analytics.model.EventNotification;
import io.nwdaf.analytics.model.EventSubscription;
import io.nwdaf.analytics.model.FailureEventInfo;
import io.nwdaf.analytics.model.ReportingInformation;
import io.nwdaf.analytics.model.SpecificAnalyticsSubscription2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents an Individual NWDAF Event Subscription resource.
 */
@ApiModel(description = "Represents an Individual NWDAF Event Subscription resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NnwdafEventsSubscription   {
  @JsonProperty("eventSubscriptions")
  @Valid
  private List<EventSubscription> eventSubscriptions = new ArrayList<>();

  @JsonProperty("evtReq")
  private ReportingInformation evtReq = null;

  @JsonProperty("notificationURI")
  private String notificationURI = null;

  @JsonProperty("supportedFeatures")
  private String supportedFeatures = null;

  @JsonProperty("eventNotifications")
  @Valid
  private List<EventNotification> eventNotifications = null;

  @JsonProperty("failEventReports")
  @Valid
  private List<FailureEventInfo> failEventReports = null;

  @JsonProperty("prevSub")
  private SpecificAnalyticsSubscription2 prevSub = null;

  @JsonProperty("consNfInfo")
  private ConsumerNfInformation consNfInfo = null;

  public NnwdafEventsSubscription eventSubscriptions(List<EventSubscription> eventSubscriptions) {
    this.eventSubscriptions = eventSubscriptions;
    return this;
  }

  public NnwdafEventsSubscription addEventSubscriptionsItem(EventSubscription eventSubscriptionsItem) {
    this.eventSubscriptions.add(eventSubscriptionsItem);
    return this;
  }

  /**
   * Subscribed events
   * @return eventSubscriptions
  **/
  @ApiModelProperty(required = true, value = "Subscribed events")
      @NotNull
    @Valid
  @Size(min=1)   public List<EventSubscription> getEventSubscriptions() {
    return eventSubscriptions;
  }

  public void setEventSubscriptions(List<EventSubscription> eventSubscriptions) {
    this.eventSubscriptions = eventSubscriptions;
  }

  public NnwdafEventsSubscription evtReq(ReportingInformation evtReq) {
    this.evtReq = evtReq;
    return this;
  }

  /**
   * Get evtReq
   * @return evtReq
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ReportingInformation getEvtReq() {
    return evtReq;
  }

  public void setEvtReq(ReportingInformation evtReq) {
    this.evtReq = evtReq;
  }

  public NnwdafEventsSubscription notificationURI(String notificationURI) {
    this.notificationURI = notificationURI;
    return this;
  }

  /**
   * Get notificationURI
   * @return notificationURI
  **/
  @ApiModelProperty(value = "")
  
    public String getNotificationURI() {
    return notificationURI;
  }

  public void setNotificationURI(String notificationURI) {
    this.notificationURI = notificationURI;
  }

  public NnwdafEventsSubscription supportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
    return this;
  }

  /**
   * Get supportedFeatures
   * @return supportedFeatures
  **/
  @ApiModelProperty(value = "")
  
  @Pattern(regexp="^[A-Fa-f0-9]*$")   public String getSupportedFeatures() {
    return supportedFeatures;
  }

  public void setSupportedFeatures(String supportedFeatures) {
    this.supportedFeatures = supportedFeatures;
  }

  public NnwdafEventsSubscription eventNotifications(List<EventNotification> eventNotifications) {
    this.eventNotifications = eventNotifications;
    return this;
  }

  public NnwdafEventsSubscription addEventNotificationsItem(EventNotification eventNotificationsItem) {
    if (this.eventNotifications == null) {
      this.eventNotifications = new ArrayList<>();
    }
    this.eventNotifications.add(eventNotificationsItem);
    return this;
  }

  /**
   * Get eventNotifications
   * @return eventNotifications
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<EventNotification> getEventNotifications() {
    return eventNotifications;
  }

  public void setEventNotifications(List<EventNotification> eventNotifications) {
    this.eventNotifications = eventNotifications;
  }

  public NnwdafEventsSubscription failEventReports(List<FailureEventInfo> failEventReports) {
    this.failEventReports = failEventReports;
    return this;
  }

  public NnwdafEventsSubscription addFailEventReportsItem(FailureEventInfo failEventReportsItem) {
    if (this.failEventReports == null) {
      this.failEventReports = new ArrayList<>();
    }
    this.failEventReports.add(failEventReportsItem);
    return this;
  }

  /**
   * Get failEventReports
   * @return failEventReports
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<FailureEventInfo> getFailEventReports() {
    return failEventReports;
  }

  public void setFailEventReports(List<FailureEventInfo> failEventReports) {
    this.failEventReports = failEventReports;
  }

  public NnwdafEventsSubscription prevSub(SpecificAnalyticsSubscription2 prevSub) {
    this.prevSub = prevSub;
    return this;
  }

  /**
   * Get prevSub
   * @return prevSub
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SpecificAnalyticsSubscription2 getPrevSub() {
    return prevSub;
  }

  public void setPrevSub(SpecificAnalyticsSubscription2 prevSub) {
    this.prevSub = prevSub;
  }

  public NnwdafEventsSubscription consNfInfo(ConsumerNfInformation consNfInfo) {
    this.consNfInfo = consNfInfo;
    return this;
  }

  /**
   * Get consNfInfo
   * @return consNfInfo
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public ConsumerNfInformation getConsNfInfo() {
    return consNfInfo;
  }

  public void setConsNfInfo(ConsumerNfInformation consNfInfo) {
    this.consNfInfo = consNfInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NnwdafEventsSubscription nnwdafEventsSubscription = (NnwdafEventsSubscription) o;
    return Objects.equals(this.eventSubscriptions, nnwdafEventsSubscription.eventSubscriptions) &&
        Objects.equals(this.evtReq, nnwdafEventsSubscription.evtReq) &&
        Objects.equals(this.notificationURI, nnwdafEventsSubscription.notificationURI) &&
        Objects.equals(this.supportedFeatures, nnwdafEventsSubscription.supportedFeatures) &&
        Objects.equals(this.eventNotifications, nnwdafEventsSubscription.eventNotifications) &&
        Objects.equals(this.failEventReports, nnwdafEventsSubscription.failEventReports) &&
        Objects.equals(this.prevSub, nnwdafEventsSubscription.prevSub) &&
        Objects.equals(this.consNfInfo, nnwdafEventsSubscription.consNfInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSubscriptions, evtReq, notificationURI, supportedFeatures, eventNotifications, failEventReports, prevSub, consNfInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NnwdafEventsSubscription {\n");
    
    sb.append("    eventSubscriptions: ").append(toIndentedString(eventSubscriptions)).append("\n");
    sb.append("    evtReq: ").append(toIndentedString(evtReq)).append("\n");
    sb.append("    notificationURI: ").append(toIndentedString(notificationURI)).append("\n");
    sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
    sb.append("    eventNotifications: ").append(toIndentedString(eventNotifications)).append("\n");
    sb.append("    failEventReports: ").append(toIndentedString(failEventReports)).append("\n");
    sb.append("    prevSub: ").append(toIndentedString(prevSub)).append("\n");
    sb.append("    consNfInfo: ").append(toIndentedString(consNfInfo)).append("\n");
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
