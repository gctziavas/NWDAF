package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The current usage of the virtual resources assigned to the NF instances belonging to a particular network slice instance.
 */
@ApiModel(description = "The current usage of the virtual resources assigned to the NF instances belonging to a particular network slice instance.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ResourceUsage   {
  @JsonProperty("cpuUsage")
  private Integer cpuUsage = null;

  @JsonProperty("memoryUsage")
  private Integer memoryUsage = null;

  @JsonProperty("storageUsage")
  private Integer storageUsage = null;

  public ResourceUsage cpuUsage(Integer cpuUsage) {
    this.cpuUsage = cpuUsage;
    return this;
  }

  /**
   * Get cpuUsage
   * @return cpuUsage
  **/
  @ApiModelProperty(value = "")
  
    public Integer getCpuUsage() {
    return cpuUsage;
  }

  public void setCpuUsage(Integer cpuUsage) {
    this.cpuUsage = cpuUsage;
  }

  public ResourceUsage memoryUsage(Integer memoryUsage) {
    this.memoryUsage = memoryUsage;
    return this;
  }

  /**
   * Get memoryUsage
   * @return memoryUsage
  **/
  @ApiModelProperty(value = "")
  
    public Integer getMemoryUsage() {
    return memoryUsage;
  }

  public void setMemoryUsage(Integer memoryUsage) {
    this.memoryUsage = memoryUsage;
  }

  public ResourceUsage storageUsage(Integer storageUsage) {
    this.storageUsage = storageUsage;
    return this;
  }

  /**
   * Get storageUsage
   * @return storageUsage
  **/
  @ApiModelProperty(value = "")
  
    public Integer getStorageUsage() {
    return storageUsage;
  }

  public void setStorageUsage(Integer storageUsage) {
    this.storageUsage = storageUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceUsage resourceUsage = (ResourceUsage) o;
    return Objects.equals(this.cpuUsage, resourceUsage.cpuUsage) &&
        Objects.equals(this.memoryUsage, resourceUsage.memoryUsage) &&
        Objects.equals(this.storageUsage, resourceUsage.storageUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuUsage, memoryUsage, storageUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceUsage {\n");
    
    sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
    sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
    sb.append("    storageUsage: ").append(toIndentedString(storageUsage)).append("\n");
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
