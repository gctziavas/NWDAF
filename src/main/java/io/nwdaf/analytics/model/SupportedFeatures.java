package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A string used to indicate the features supported by an API that is used as defined in clause 6.6 in 3GPP TS 29.500. The string shall contain a bitmask indicating supported features in hexadecimal representation Each character in the string shall take a value of \&quot;0\&quot; to \&quot;9\&quot;, \&quot;a\&quot; to \&quot;f\&quot; or \&quot;A\&quot; to \&quot;F\&quot; and shall represent the support of 4 features as described in table 5.2.2-3. The most significant character representing the highest-numbered features shall appear first in the string, and the character representing features 1 to 4 shall appear last in the string. The list of features and their numbering (starting with 1) are defined separately for each API. If the string contains a lower number of characters than there are defined features for an API, all features that would be represented by characters that are not present in the string are not supported
 */
@ApiModel(description = "A string used to indicate the features supported by an API that is used as defined in clause 6.6 in 3GPP TS 29.500. The string shall contain a bitmask indicating supported features in hexadecimal representation Each character in the string shall take a value of \"0\" to \"9\", \"a\" to \"f\" or \"A\" to \"F\" and shall represent the support of 4 features as described in table 5.2.2-3. The most significant character representing the highest-numbered features shall appear first in the string, and the character representing features 1 to 4 shall appear last in the string. The list of features and their numbering (starting with 1) are defined separately for each API. If the string contains a lower number of characters than there are defined features for an API, all features that would be represented by characters that are not present in the string are not supported")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class SupportedFeatures   {
	
	@JsonIgnore
	private String supportedFeaturesHex = null;
	
	private String serviceExperience = null;
	private String ueMobility = null;
	private String ueCommunication  = null;
	private String  qoSSustainability = null;
	private String abnormalBehaviour = null;
	private String userDataCongestion = null;
	private String nfLoad = null;
	private String networkPerformance = null;
	private String nsiLoad  = null;
	private String sMCongestion  = null;
	private String redundantTransmission  = null;
	private String wLANPerformance  = null;
	private String eS3XX  = null;
	

	
	
  public String getSupportedFeaturesHex() {
		return supportedFeaturesHex;
	}

	public void setSupportedFeaturesHex(String supportedFeaturesHex) {
		this.supportedFeaturesHex = supportedFeaturesHex;
	}

public String getsMCongestion() {
		return sMCongestion;
	}

	public void setsMCongestion(String sMCongestion) {
		this.sMCongestion = sMCongestion;
	}

	public String getRedundantTransmission() {
		return redundantTransmission;
	}

	public void setRedundantTransmission(String redundantTransmission) {
		this.redundantTransmission = redundantTransmission;
	}

	public String getwLANPerformance() {
		return wLANPerformance;
	}

	public void setwLANPerformance(String wLANPerformance) {
		this.wLANPerformance = wLANPerformance;
	}

	public String geteS3XX() {
		return eS3XX;
	}

	public void seteS3XX(String eS3XX) {
		this.eS3XX = eS3XX;
	}

public String getServiceExperience() {
		return serviceExperience;
	}

	public void setServiceExperience(String serviceExperience) {
		this.serviceExperience = serviceExperience;
	}

	public String getUeMobility() {
		return ueMobility;
	}

	public void setUeMobility(String ueMobility) {
		this.ueMobility = ueMobility;
	}

	public String getUeCommunication() {
		return ueCommunication;
	}

	public void setUeCommunication(String ueCommunication) {
		this.ueCommunication = ueCommunication;
	}

	public String getQoSSustainability() {
		return qoSSustainability;
	}

	public void setQoSSustainability(String qoSSustainability) {
		this.qoSSustainability = qoSSustainability;
	}

	public String getAbnormalBehaviour() {
		return abnormalBehaviour;
	}

	public void setAbnormalBehaviour(String abnormalBehaviour) {
		this.abnormalBehaviour = abnormalBehaviour;
	}

	public String getUserDataCongestion() {
		return userDataCongestion;
	}

	public void setUserDataCongestion(String userDataCongestion) {
		this.userDataCongestion = userDataCongestion;
	}

	public String getNfLoad() {
		return nfLoad;
	}

	public void setNfLoad(String nfLoad) {
		this.nfLoad = nfLoad;
	}

	public String getNetworkPerformance() {
		return networkPerformance;
	}

	public void setNetworkPerformance(String networkPerformance) {
		this.networkPerformance = networkPerformance;
	}

	public String getNsiLoad() {
		return nsiLoad;
	}

	public void setNsiLoad(String nsiLoad) {
		this.nsiLoad = nsiLoad;
	}

	public SupportedFeatures(String supportedFeatures) {
		String pattern = "^[A-Fa-f0-9]{1,4}";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(supportedFeatures);
		if (m.matches()) {
			this.supportedFeaturesHex = supportedFeatures;
			int num = (Integer.parseInt(supportedFeatures, 16));
			String supportedFeaturesBin = Integer.toBinaryString(num);
			char[] charArray = supportedFeaturesBin.toCharArray();
			char[] eachSupportedFeature = new char[13];
			//Arrays.fill(eachSupportedFeature, '0');
			//System.out.println(charArray);
			for (int i = 0; i < 13 - charArray.length; i++) {
				eachSupportedFeature[i] = '0';
				//System.out.println(i+": "+ eachSupportedFeature[i]);
			}
			for (int i = 13 - charArray.length; i < 13; i++) {

				eachSupportedFeature[i] = charArray[i - (13 - charArray.length)];
				//System.out.println("eachSupportedFeature["+i+"]"+ ": " + eachSupportedFeature[i]);
			}
			
			if (eachSupportedFeature[12] == '0') {
				seteS3XX("NOT SUPPORTED");
			} else {
				seteS3XX("SUPPORTED");
			}
			if (eachSupportedFeature[11] == '0') {
				setwLANPerformance("NOT SUPPORTED");
			} else {
				setwLANPerformance("SUPPORTED");
			}
			if (eachSupportedFeature[10] == '0') {
				setRedundantTransmission("NOT SUPPORTED");
			} else {
				setRedundantTransmission("SUPPORTED");
			}
			if (eachSupportedFeature[9] == '0') {
				setsMCongestion("NOT SUPPORTED");
			} else {
				setsMCongestion("SUPPORTED");
			}
			if (eachSupportedFeature[8] == '0') {
				setNsiLoad("NOT SUPPORTED");
			} else {
				setNsiLoad("SUPPORTED");
			}
			if (eachSupportedFeature[7] == '0') {
				setNetworkPerformance("NOT SUPPORTED");
			} else {
				setNetworkPerformance("SUPPORTED");
			}
			if (eachSupportedFeature[6] == '0') {
				setNfLoad("NOT SUPPORTED");
			} else {
				setNfLoad("SUPPORTED");
			}
			if (eachSupportedFeature[5] == '0') {
				setUserDataCongestion("NOT SUPPORTED");
			} else {
				setUserDataCongestion("SUPPORTED");
			}
			if (eachSupportedFeature[4] == '0') {
				setAbnormalBehaviour("NOT SUPPORTED");
			} else {
				setAbnormalBehaviour("SUPPORTED");
			}
			if (eachSupportedFeature[3] == '0') {
				setQoSSustainability("NOT SUPPORTED");
			} else {
				setQoSSustainability("SUPPORTED");
			}
			if (eachSupportedFeature[2] == '0') {
				setUeCommunication("NOT SUPPORTED");
			} else {
				setUeCommunication("SUPPORTED");
			}
			if (eachSupportedFeature[1] == '0') {
				setUeMobility("NOT SUPPORTED");
			} else {
				setUeMobility("SUPPORTED");
			}
			if (eachSupportedFeature[0] == '0') {
				setServiceExperience("NOT SUPPORTED");
			} else {
				setServiceExperience("SUPPORTED");
			}
			
		}
		else {
			throw new IllegalArgumentException("Illegal Supported Features argument. Supported Features argument follows the pattern \"^[A-Fa-f0-9]{1,4}\"."); 
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
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("SupportedFeatures {\n");
    sb.append("    Service Experience:"+getServiceExperience() + ",\n");
    sb.append("    UE Mobility:"+getUeMobility() + ",\n");
    sb.append("    UE Communication:"+getUeCommunication() + ",\n");
    sb.append("    QoS Sustainability:"+getQoSSustainability() + ",\n");
    sb.append("    Abnormal Beahaviour:"+getAbnormalBehaviour() + ",\n");
    sb.append("    User Data Congestion:"+getUserDataCongestion() + ",\n");
    sb.append("    NF Load:"+getNfLoad() + ",\n");
    sb.append("    Network Performance:"+getNetworkPerformance() + ",\n");
    sb.append("    NSI Load:"+getNsiLoad() + ",\n");
    sb.append("    SM Congestion:"+getsMCongestion()+ ",\n");
    sb.append("    Redundant Transmission:"+getRedundantTransmission()+ ",\n");
    sb.append("    WLAN Performance:"+getwLANPerformance()+ ",\n");
    sb.append("    ES3XX:"+geteS3XX()+ "\n");
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
