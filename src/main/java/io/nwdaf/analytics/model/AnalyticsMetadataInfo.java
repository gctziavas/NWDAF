package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.Accuracy;
import io.nwdaf.analytics.model.DatasetStatisticalProperty;
import io.nwdaf.analytics.model.OutputStrategy;
import io.nwdaf.analytics.model.TimeWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains analytics metadata information required for analytics aggregation.
 */
@ApiModel(description = "Contains analytics metadata information required for analytics aggregation.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class AnalyticsMetadataInfo   {
  @JsonProperty("numSamples")
  private Integer numSamples = null;

  @JsonProperty("dataWindow")
  private TimeWindow dataWindow = null;

  @JsonProperty("dataStatProps")
  @Valid
  private List<DatasetStatisticalProperty> dataStatProps = null;

  @JsonProperty("strategy")
  private OutputStrategy strategy = null;

  @JsonProperty("accuracy")
  private Accuracy accuracy = null;

  public AnalyticsMetadataInfo numSamples(Integer numSamples) {
    this.numSamples = numSamples;
    return this;
  }

  /**
   * Get numSamples
   * @return numSamples
  **/
  @ApiModelProperty(value = "")
  
    public Integer getNumSamples() {
    return numSamples;
  }

  public void setNumSamples(Integer numSamples) {
    this.numSamples = numSamples;
  }

  public AnalyticsMetadataInfo dataWindow(TimeWindow dataWindow) {
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

  public AnalyticsMetadataInfo dataStatProps(List<DatasetStatisticalProperty> dataStatProps) {
    this.dataStatProps = dataStatProps;
    return this;
  }

  public AnalyticsMetadataInfo addDataStatPropsItem(DatasetStatisticalProperty dataStatPropsItem) {
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

  public AnalyticsMetadataInfo strategy(OutputStrategy strategy) {
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

  public AnalyticsMetadataInfo accuracy(Accuracy accuracy) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsMetadataInfo analyticsMetadataInfo = (AnalyticsMetadataInfo) o;
    return Objects.equals(this.numSamples, analyticsMetadataInfo.numSamples) &&
        Objects.equals(this.dataWindow, analyticsMetadataInfo.dataWindow) &&
        Objects.equals(this.dataStatProps, analyticsMetadataInfo.dataStatProps) &&
        Objects.equals(this.strategy, analyticsMetadataInfo.strategy) &&
        Objects.equals(this.accuracy, analyticsMetadataInfo.accuracy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numSamples, dataWindow, dataStatProps, strategy, accuracy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsMetadataInfo {\n");
    
    sb.append("    numSamples: ").append(toIndentedString(numSamples)).append("\n");
    sb.append("    dataWindow: ").append(toIndentedString(dataWindow)).append("\n");
    sb.append("    dataStatProps: ").append(toIndentedString(dataStatProps)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
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
