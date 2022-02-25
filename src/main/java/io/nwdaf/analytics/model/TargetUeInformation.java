package io.nwdaf.analytics.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Identifies the target UE information.
 */
@ApiModel(description = "Identifies the target UE information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class TargetUeInformation   {
  @JsonProperty("anyUe")
  private Boolean anyUe = false;

  @JsonProperty("supis")
  @Valid
  private List<String> supis = null;

  @JsonProperty("gpsis")
  @Valid
  private List<String> gpsis = null;

  @JsonProperty("intGroupIds")
  @Valid
  private List<String> intGroupIds = null;

  public TargetUeInformation anyUe(Boolean anyUe) {
    this.anyUe = anyUe;
    return this;
  }

  /**
   * Get anyUe
   * @return anyUe
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isAnyUe() {
    return anyUe;
  }

  public void setAnyUe(Boolean anyUe) {
    this.anyUe = anyUe;
  }

  public TargetUeInformation supis(List<String> supis) {
    int flag = 0;
    for(int i = 0; i<supis.size(); i++) {
    	if(!supis.get(i).equals(new Supi(supis.get(i)).supiValue())) {
    		flag++;
    	}
    }
	if(flag==0) {  
	  this.supis = supis;
    return this;
	}
	else {
		throw new IllegalArgumentException("Not valid supi argument. Supi must must follow the \"^(imsi-[0-9]{5,15}|nai-.+| gci-.+|gli-.+|.+)$\" pattern.");
	}
  }

  public TargetUeInformation addSupisItem(String supisItem) {
    if (this.supis == null) {
      this.supis = new ArrayList<>();
    }
    this.supis.add(new Supi(supisItem).supiValue());
    return this;
  }

  /**
   * Get supis
   * @return supis
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getSupis() {
    return supis;
  }

  public void setSupis(List<String> supis) {
	    int flag = 0;
	    for(int i = 0; i<supis.size(); i++) {
	    	if(!supis.get(i).equals(new Supi(supis.get(i)).supiValue())) {
	    		flag++;
	    	}
	    }
		if(flag==0) {  
		  this.supis = supis;
		}
		else {
			throw new IllegalArgumentException("Not valid supi argument. Supi must must follow the \"^(imsi-[0-9]{5,15}|nai-.+| gci-.+|gli-.+|.+)$\" pattern.");
		}
  }

  public TargetUeInformation gpsis(List<String> gpsis) {
	    int flag = 0;
	    for(int i = 0; i<gpsis.size(); i++) {
	    	if(!gpsis.get(i).equals(new Gpsi(gpsis.get(i)).gpsiValue())) {
	    		flag++;
	    	}
	    }
		if(flag==0) {  
		  this.gpsis = gpsis;
		  return this;
		}
		else {
			throw new IllegalArgumentException("Not valid gpsi argument. Gpsi must must follow the \"^(msisdn-[0-9]{5,15}|extid-.+@.+|.+)$\" pattern.");
		}
  }

  public TargetUeInformation addGpsisItem(String gpsisItem) {
    if (this.gpsis == null) {
      this.gpsis = new ArrayList<>();
    }
    this.gpsis.add(new Gpsi(gpsisItem).gpsiValue());
    return this;
  }

  /**
   * Get gpsis
   * @return gpsis
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getGpsis() {
    return gpsis;
  }

  public void setGpsis(List<String> gpsis) {
	    int flag = 0;
	    for(int i = 0; i<gpsis.size(); i++) {
	    	if(!gpsis.get(i).equals(new Gpsi(gpsis.get(i)).gpsiValue())) {
	    		flag++;
	    	}
	    }
		if(flag==0) {  
		  this.gpsis = gpsis;
		}
		else {
			throw new IllegalArgumentException("Not valid gpsi argument. Gpsi must must follow the \"^(msisdn-[0-9]{5,15}|extid-.+@.+|.+)$\" pattern.");
		}
  }
  

  public TargetUeInformation intGroupIds(List<String> intGroupIds) {
	    int flag = 0;
	    for(int i = 0; i<intGroupIds.size(); i++) {
	    	if(!intGroupIds.get(i).equals(new GroupId(intGroupIds.get(i)).groupIdValue())) {
	    		flag++;
	    	}
	    }
		if(flag==0) {  
		  this.intGroupIds = intGroupIds;
		  return this;
		}
		else {
			throw new IllegalArgumentException("Not valid groupId argument. GroupId must must follow the \"^[A-Fa-f0-9]{8}-[0-9]{3}-[0-9]{2,3}-([A-Fa-f0-9][A-Fa-f0-9]){1,10}$\" pattern.");
		}
  }

  public TargetUeInformation addIntGroupIdsItem(String intGroupIdsItem) {
    if (this.intGroupIds == null) {
      this.intGroupIds = new ArrayList<>();
    }
    this.intGroupIds.add(new GroupId(intGroupIdsItem).groupIdValue());
    return this;
  }

  /**
   * Get intGroupIds
   * @return intGroupIds
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getIntGroupIds() {
    return intGroupIds;
  }

  public void setIntGroupIds(List<String> intGroupIds) {
	    int flag = 0;
	    for(int i = 0; i<intGroupIds.size(); i++) {
	    	if(!intGroupIds.get(i).equals(new GroupId(intGroupIds.get(i)).groupIdValue())) {
	    		flag++;
	    	}
	    }
		if(flag==0) {  
		  this.intGroupIds = intGroupIds;
		}
		else {
			throw new IllegalArgumentException("Not valid groupId argument. GroupId must must follow the \"^[A-Fa-f0-9]{8}-[0-9]{3}-[0-9]{2,3}-([A-Fa-f0-9][A-Fa-f0-9]){1,10}$\" pattern.");
		}
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetUeInformation targetUeInformation = (TargetUeInformation) o;
    return Objects.equals(this.anyUe, targetUeInformation.anyUe) &&
        Objects.equals(this.supis, targetUeInformation.supis) &&
        Objects.equals(this.gpsis, targetUeInformation.gpsis) &&
        Objects.equals(this.intGroupIds, targetUeInformation.intGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anyUe, supis, gpsis, intGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetUeInformation {\n");
    
    sb.append("    anyUe: ").append(toIndentedString(anyUe)).append("\n");
    sb.append("    supis: ").append(toIndentedString(supis)).append("\n");
    sb.append("    gpsis: ").append(toIndentedString(gpsis)).append("\n");
    sb.append("    intGroupIds: ").append(toIndentedString(intGroupIds)).append("\n");
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
