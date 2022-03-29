package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.AdrfDataType;
import io.nwdaf.analytics.model.AnalyticsContextIdentifier;
import io.nwdaf.analytics.model.EventNotification;
import io.nwdaf.analytics.model.HistoricalData;
import io.nwdaf.analytics.model.SpecificAnalyticsSubscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains context information corresponding with a specific context identifier.
 */
@ApiModel(description = "Contains context information corresponding with a specific context identifier.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ContextElement   {
  @JsonProperty("contextId")
  private AnalyticsContextIdentifier contextId = null;

  @JsonProperty("pendAnalytics")
  @Valid
  private List<EventNotification> pendAnalytics = null;

  @JsonProperty("histAnalytics")
  @Valid
  private List<EventNotification> histAnalytics = null;

  @JsonProperty("lastOutputTime")
  private OffsetDateTime lastOutputTime = null;

  @JsonProperty("aggrSubs")
  @Valid
  private List<SpecificAnalyticsSubscription> aggrSubs = null;

  @JsonProperty("histData")
  @Valid
  private List<HistoricalData> histData = null;

  @JsonProperty("adrfId")
  private UUID adrfId = null;

  @JsonProperty("adrfDataTypes")
  @Valid
  private List<AdrfDataType> adrfDataTypes = null;

  @JsonProperty("aggrNwdafIds")
  @Valid
  private List<UUID> aggrNwdafIds = null;

  @JsonProperty("modelProvIds")
  @Valid
  private List<UUID> modelProvIds = null;

  public ContextElement contextId(AnalyticsContextIdentifier contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * Get contextId
   * @return contextId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public AnalyticsContextIdentifier getContextId() {
    return contextId;
  }

  public void setContextId(AnalyticsContextIdentifier contextId) {
    this.contextId = contextId;
  }

  public ContextElement pendAnalytics(List<EventNotification> pendAnalytics) {
    this.pendAnalytics = pendAnalytics;
    return this;
  }

  public ContextElement addPendAnalyticsItem(EventNotification pendAnalyticsItem) {
    if (this.pendAnalytics == null) {
      this.pendAnalytics = new ArrayList<>();
    }
    this.pendAnalytics.add(pendAnalyticsItem);
    return this;
  }

  /**
   * Output analytics for the analytics subscription which have not yet been sent to the analytics consumer.
   * @return pendAnalytics
  **/
  @ApiModelProperty(value = "Output analytics for the analytics subscription which have not yet been sent to the analytics consumer.")
      @Valid
  @Size(min=1)   public List<EventNotification> getPendAnalytics() {
    return pendAnalytics;
  }

  public void setPendAnalytics(List<EventNotification> pendAnalytics) {
    this.pendAnalytics = pendAnalytics;
  }

  public ContextElement histAnalytics(List<EventNotification> histAnalytics) {
    this.histAnalytics = histAnalytics;
    return this;
  }

  public ContextElement addHistAnalyticsItem(EventNotification histAnalyticsItem) {
    if (this.histAnalytics == null) {
      this.histAnalytics = new ArrayList<>();
    }
    this.histAnalytics.add(histAnalyticsItem);
    return this;
  }

  /**
   * Historical output analytics.
   * @return histAnalytics
  **/
  @ApiModelProperty(value = "Historical output analytics.")
      @Valid
  @Size(min=1)   public List<EventNotification> getHistAnalytics() {
    return histAnalytics;
  }

  public void setHistAnalytics(List<EventNotification> histAnalytics) {
    this.histAnalytics = histAnalytics;
  }

  public ContextElement lastOutputTime(OffsetDateTime lastOutputTime) {
    this.lastOutputTime = lastOutputTime;
    return this;
  }

  /**
   * Get lastOutputTime
   * @return lastOutputTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getLastOutputTime() {
    return lastOutputTime;
  }

  public void setLastOutputTime(OffsetDateTime lastOutputTime) {
    this.lastOutputTime = lastOutputTime;
  }

  public ContextElement aggrSubs(List<SpecificAnalyticsSubscription> aggrSubs) {
    this.aggrSubs = aggrSubs;
    return this;
  }

  public ContextElement addAggrSubsItem(SpecificAnalyticsSubscription aggrSubsItem) {
    if (this.aggrSubs == null) {
      this.aggrSubs = new ArrayList<>();
    }
    this.aggrSubs.add(aggrSubsItem);
    return this;
  }

  /**
   * Information about analytics subscriptions that the NWDAF has with other NWDAFs to perform aggregation.
   * @return aggrSubs
  **/
  @ApiModelProperty(value = "Information about analytics subscriptions that the NWDAF has with other NWDAFs to perform aggregation.")
      @Valid
  @Size(min=1)   public List<SpecificAnalyticsSubscription> getAggrSubs() {
    return aggrSubs;
  }

  public void setAggrSubs(List<SpecificAnalyticsSubscription> aggrSubs) {
    this.aggrSubs = aggrSubs;
  }

  public ContextElement histData(List<HistoricalData> histData) {
    this.histData = histData;
    return this;
  }

  public ContextElement addHistDataItem(HistoricalData histDataItem) {
    if (this.histData == null) {
      this.histData = new ArrayList<>();
    }
    this.histData.add(histDataItem);
    return this;
  }

  /**
   * Historical data related to the analytics subscription.
   * @return histData
  **/
  @ApiModelProperty(value = "Historical data related to the analytics subscription.")
      @Valid
  @Size(min=1)   public List<HistoricalData> getHistData() {
    return histData;
  }

  public void setHistData(List<HistoricalData> histData) {
    this.histData = histData;
  }

  public ContextElement adrfId(UUID adrfId) {
    this.adrfId = adrfId;
    return this;
  }

  /**
   * Get adrfId
   * @return adrfId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getAdrfId() {
    return adrfId;
  }

  public void setAdrfId(UUID adrfId) {
    this.adrfId = adrfId;
  }

  public ContextElement adrfDataTypes(List<AdrfDataType> adrfDataTypes) {
    this.adrfDataTypes = adrfDataTypes;
    return this;
  }

  public ContextElement addAdrfDataTypesItem(AdrfDataType adrfDataTypesItem) {
    if (this.adrfDataTypes == null) {
      this.adrfDataTypes = new ArrayList<>();
    }
    this.adrfDataTypes.add(adrfDataTypesItem);
    return this;
  }

  /**
   * Type(s) of data stored in the ADRF by the NWDAF.
   * @return adrfDataTypes
  **/
  @ApiModelProperty(value = "Type(s) of data stored in the ADRF by the NWDAF.")
      @Valid
  @Size(min=1)   public List<AdrfDataType> getAdrfDataTypes() {
    return adrfDataTypes;
  }

  public void setAdrfDataTypes(List<AdrfDataType> adrfDataTypes) {
    this.adrfDataTypes = adrfDataTypes;
  }

  public ContextElement aggrNwdafIds(List<UUID> aggrNwdafIds) {
    this.aggrNwdafIds = aggrNwdafIds;
    return this;
  }

  public ContextElement addAggrNwdafIdsItem(UUID aggrNwdafIdsItem) {
    if (this.aggrNwdafIds == null) {
      this.aggrNwdafIds = new ArrayList<>();
    }
    this.aggrNwdafIds.add(aggrNwdafIdsItem);
    return this;
  }

  /**
   * NWDAF identifiers of NWDAF instances used by the NWDAF service consumer when aggregating multiple analytics subscriptions.
   * @return aggrNwdafIds
  **/
  @ApiModelProperty(value = "NWDAF identifiers of NWDAF instances used by the NWDAF service consumer when aggregating multiple analytics subscriptions.")
      @Valid
  @Size(min=1)   public List<UUID> getAggrNwdafIds() {
    return aggrNwdafIds;
  }

  public void setAggrNwdafIds(List<UUID> aggrNwdafIds) {
    this.aggrNwdafIds = aggrNwdafIds;
  }

  public ContextElement modelProvIds(List<UUID> modelProvIds) {
    this.modelProvIds = modelProvIds;
    return this;
  }

  public ContextElement addModelProvIdsItem(UUID modelProvIdsItem) {
    if (this.modelProvIds == null) {
      this.modelProvIds = new ArrayList<>();
    }
    this.modelProvIds.add(modelProvIdsItem);
    return this;
  }

  /**
   * Identifiers of NWDAFs that provide ML models used by the NF service consumer.
   * @return modelProvIds
  **/
  @ApiModelProperty(value = "Identifiers of NWDAFs that provide ML models used by the NF service consumer.")
      @Valid
  @Size(min=1)   public List<UUID> getModelProvIds() {
    return modelProvIds;
  }

  public void setModelProvIds(List<UUID> modelProvIds) {
    this.modelProvIds = modelProvIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContextElement contextElement = (ContextElement) o;
    return Objects.equals(this.contextId, contextElement.contextId) &&
        Objects.equals(this.pendAnalytics, contextElement.pendAnalytics) &&
        Objects.equals(this.histAnalytics, contextElement.histAnalytics) &&
        Objects.equals(this.lastOutputTime, contextElement.lastOutputTime) &&
        Objects.equals(this.aggrSubs, contextElement.aggrSubs) &&
        Objects.equals(this.histData, contextElement.histData) &&
        Objects.equals(this.adrfId, contextElement.adrfId) &&
        Objects.equals(this.adrfDataTypes, contextElement.adrfDataTypes) &&
        Objects.equals(this.aggrNwdafIds, contextElement.aggrNwdafIds) &&
        Objects.equals(this.modelProvIds, contextElement.modelProvIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, pendAnalytics, histAnalytics, lastOutputTime, aggrSubs, histData, adrfId, adrfDataTypes, aggrNwdafIds, modelProvIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContextElement {\n");
    
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    pendAnalytics: ").append(toIndentedString(pendAnalytics)).append("\n");
    sb.append("    histAnalytics: ").append(toIndentedString(histAnalytics)).append("\n");
    sb.append("    lastOutputTime: ").append(toIndentedString(lastOutputTime)).append("\n");
    sb.append("    aggrSubs: ").append(toIndentedString(aggrSubs)).append("\n");
    sb.append("    histData: ").append(toIndentedString(histData)).append("\n");
    sb.append("    adrfId: ").append(toIndentedString(adrfId)).append("\n");
    sb.append("    adrfDataTypes: ").append(toIndentedString(adrfDataTypes)).append("\n");
    sb.append("    aggrNwdafIds: ").append(toIndentedString(aggrNwdafIds)).append("\n");
    sb.append("    modelProvIds: ").append(toIndentedString(modelProvIds)).append("\n");
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
