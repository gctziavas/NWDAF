package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.NnwdafEventsSubscription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents an existing subscription for a specific type of analytics to a specific NWDAF.
 */
@ApiModel(description = "Represents an existing subscription for a specific type of analytics to a specific NWDAF.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class SpecificAnalyticsSubscription   {
  @JsonProperty("subscriptionId")
  private String subscriptionId = null;

  @JsonProperty("producerId")
  private UUID producerId = null;

  @JsonProperty("producerSetId")
  private String producerSetId = null;

  @JsonProperty("nwdafEvSub")
  private NnwdafEventsSubscription nwdafEvSub = null;

  public SpecificAnalyticsSubscription subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SpecificAnalyticsSubscription producerId(UUID producerId) {
    this.producerId = producerId;
    return this;
  }

  /**
   * Get producerId
   * @return producerId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getProducerId() {
    return producerId;
  }

  public void setProducerId(UUID producerId) {
    this.producerId = producerId;
  }

  public SpecificAnalyticsSubscription producerSetId(String producerSetId) {
    this.producerSetId = producerSetId;
    return this;
  }

  /**
   * Get producerSetId
   * @return producerSetId
  **/
  @ApiModelProperty(value = "")
  
    public String getProducerSetId() {
    return producerSetId;
  }

  public void setProducerSetId(String producerSetId) {
    this.producerSetId = producerSetId;
  }

  public SpecificAnalyticsSubscription nwdafEvSub(NnwdafEventsSubscription nwdafEvSub) {
    this.nwdafEvSub = nwdafEvSub;
    return this;
  }

  /**
   * Get nwdafEvSub
   * @return nwdafEvSub
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public NnwdafEventsSubscription getNwdafEvSub() {
    return nwdafEvSub;
  }

  public void setNwdafEvSub(NnwdafEventsSubscription nwdafEvSub) {
    this.nwdafEvSub = nwdafEvSub;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecificAnalyticsSubscription specificAnalyticsSubscription = (SpecificAnalyticsSubscription) o;
    return Objects.equals(this.subscriptionId, specificAnalyticsSubscription.subscriptionId) &&
        Objects.equals(this.producerId, specificAnalyticsSubscription.producerId) &&
        Objects.equals(this.producerSetId, specificAnalyticsSubscription.producerSetId) &&
        Objects.equals(this.nwdafEvSub, specificAnalyticsSubscription.nwdafEvSub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, producerId, producerSetId, nwdafEvSub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecificAnalyticsSubscription {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    producerId: ").append(toIndentedString(producerId)).append("\n");
    sb.append("    producerSetId: ").append(toIndentedString(producerSetId)).append("\n");
    sb.append("    nwdafEvSub: ").append(toIndentedString(nwdafEvSub)).append("\n");
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
