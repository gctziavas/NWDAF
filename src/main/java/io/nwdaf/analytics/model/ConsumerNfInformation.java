package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.nwdaf.analytics.model.Tai;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the analytics consumer NF Information.
 */
@ApiModel(description = "Represents the analytics consumer NF Information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ConsumerNfInformation  implements AnyOfConsumerNfInformation {
  @JsonProperty("nfId")
  private UUID nfId = null;

  @JsonProperty("taiList")
  @Valid
  private List<Tai> taiList = null;

  public ConsumerNfInformation nfId(UUID nfId) {
    this.nfId = nfId;
    return this;
  }

  /**
   * Get nfId
   * @return nfId
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getNfId() {
    return nfId;
  }

  public void setNfId(UUID nfId) {
    this.nfId = nfId;
  }

  public ConsumerNfInformation taiList(List<Tai> taiList) {
    this.taiList = taiList;
    return this;
  }

  public ConsumerNfInformation addTaiListItem(Tai taiListItem) {
    if (this.taiList == null) {
      this.taiList = new ArrayList<>();
    }
    this.taiList.add(taiListItem);
    return this;
  }

  /**
   * Get taiList
   * @return taiList
  **/
  @ApiModelProperty(value = "")
      @Valid
  @Size(min=1)   public List<Tai> getTaiList() {
    return taiList;
  }

  public void setTaiList(List<Tai> taiList) {
    this.taiList = taiList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerNfInformation consumerNfInformation = (ConsumerNfInformation) o;
    return Objects.equals(this.nfId, consumerNfInformation.nfId) &&
        Objects.equals(this.taiList, consumerNfInformation.taiList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nfId, taiList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerNfInformation {\n");
    
    sb.append("    nfId: ").append(toIndentedString(nfId)).append("\n");
    sb.append("    taiList: ").append(toIndentedString(taiList)).append("\n");
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
