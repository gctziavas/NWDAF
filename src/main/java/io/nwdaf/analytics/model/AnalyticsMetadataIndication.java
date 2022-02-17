package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.DatasetStatisticalProperty;
import io.nwdaf.analytics.model.OutputStrategy;
import io.nwdaf.analytics.model.TimeWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains analytics metadata information requested to be used during analytics generation.
 */
@ApiModel(description = "Contains analytics metadata information requested to be used during analytics generation.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class AnalyticsMetadataIndication   {
  @JsonProperty("dataWindow")
  private TimeWindow dataWindow = null;

  @JsonProperty("dataStatProps")
  @Valid
  private List<DatasetStatisticalProperty> dataStatProps = null;

  @JsonProperty("strategy")
  private OutputStrategy strategy = null;

  @JsonProperty("aggrNwdafIds")
  @Valid
  private List<UUID> aggrNwdafIds = null;

  public AnalyticsMetadataIndication dataWindow(TimeWindow dataWindow) {
    this.dataWindow = dataWindow;
    return this;
  }

  /**
   * Get dataWindow
   * @return dataWindow
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public TimeWindow getDataWindow() {
    return dataWindow;
  }

  public void setDataWindow(TimeWindow dataWindow) {
    this.dataWindow = dataWindow;
  }

  public AnalyticsMetadataIndication dataStatProps(List<DatasetStatisticalProperty> dataStatProps) {
    this.dataStatProps = dataStatProps;
    return this;
  }

  public AnalyticsMetadataIndication addDataStatPropsItem(DatasetStatisticalProperty dataStatPropsItem) {
    if (this.dataStatProps == null) {
      this.dataStatProps = new ArrayList<>();
    }
    this.dataStatProps.add(dataStatPropsItem);
    return this;
  }

  /**
   * Get dataStatProps
   * @return dataStatProps
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<DatasetStatisticalProperty> getDataStatProps() {
    return dataStatProps;
  }

  public void setDataStatProps(List<DatasetStatisticalProperty> dataStatProps) {
    this.dataStatProps = dataStatProps;
  }
  
  public void setDataStatPropsFromStringList(List<String> dataStatPropsStringList) {
	  List<DatasetStatisticalProperty> dataStatProps = new ArrayList<DatasetStatisticalProperty>();
	  
	  for(int i=0; i<dataStatPropsStringList.size(); i++) {
		  dataStatProps.add(new DatasetStatisticalProperty(dataStatPropsStringList.get(i)));
	  }
	  this.dataStatProps = dataStatProps;
  }
  
  public AnalyticsMetadataIndication strategy(OutputStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

  /**
   * Get strategy
   * @return strategy
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OutputStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(OutputStrategy strategy) {
    this.strategy = strategy;
  }

  public AnalyticsMetadataIndication aggrNwdafIds(List<UUID> aggrNwdafIds) {
    this.aggrNwdafIds = aggrNwdafIds;
    return this;
  }

  public AnalyticsMetadataIndication addAggrNwdafIdsItem(UUID aggrNwdafIdsItem) {
    if (this.aggrNwdafIds == null) {
      this.aggrNwdafIds = new ArrayList<>();
    }
    this.aggrNwdafIds.add(aggrNwdafIdsItem);
    return this;
  }

  /**
   * Get aggrNwdafIds
   * @return aggrNwdafIds
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<UUID> getAggrNwdafIds() {
    return aggrNwdafIds;
  }

  public void setAggrNwdafIds(List<UUID> aggrNwdafIds) {
    this.aggrNwdafIds = aggrNwdafIds;
  }
  
  public void setAggrNwdafIdsFromString(List<String> aggrNwdafIdsString) {
	  List<UUID> aggrNwdafIds = new ArrayList<UUID>();
	  for(int i=0; i<aggrNwdafIdsString.size(); i++) {
		  UUID curUUID = UUID.fromString(aggrNwdafIdsString.get(i));
		  aggrNwdafIds.add(curUUID);
	  }
	  this.aggrNwdafIds = aggrNwdafIds;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsMetadataIndication analyticsMetadataIndication = (AnalyticsMetadataIndication) o;
    return Objects.equals(this.dataWindow, analyticsMetadataIndication.dataWindow) &&
        Objects.equals(this.dataStatProps, analyticsMetadataIndication.dataStatProps) &&
        Objects.equals(this.strategy, analyticsMetadataIndication.strategy) &&
        Objects.equals(this.aggrNwdafIds, analyticsMetadataIndication.aggrNwdafIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataWindow, dataStatProps, strategy, aggrNwdafIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("    dataWindow: ").append(toIndentedString(dataWindow)).append(",\n");
    sb.append("    dataStatProps: ").append(toIndentedString(dataStatProps)).append(",\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append(",\n");
    sb.append("    aggrNwdafIds: ").append(toIndentedString(aggrNwdafIds)).append("\n");
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
