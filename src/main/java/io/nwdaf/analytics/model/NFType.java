package io.nwdaf.analytics.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NF types known to NRF
 */
@ApiModel(description = "NF types known to NRF")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class NFType  implements AnyOfNFType {
	@JsonProperty("nfType")
	private String nfType = null;
	
	@JsonIgnore
	private String[] possibleValues = {"NRF","UDM","AMF","SMF","AUSF","NEF","PCF","SMSF","NSSF","UDR","LMF","GMLC","5G_EIR","SEPP","UPF","N3IWF","AF","UDSF","NEF","CHF","NWDAF","PCSCF","CBCF","UCMF","HSS","SOR_AF","SPAF","MME","SCSAS","SCEF","SCP","NSSAAF","ICSCF","SCSCF","DRA","IMS_AS","AANF","5G_DDNMF","NSACF","MFAF","EASDF","DCCF","MB-SMF","TSCTSF","ADRF","GBA_BSF","CEF","MB-UPF"};                                                                                         
	
	public NFType() {
		
	};
	public NFType(String nfType) {

		  if (Arrays.asList(possibleValues).contains(nfType)) {
			  this.nfType = nfType;
		}
		  else {
			  throw new IllegalArgumentException("Not valid nfType value.");
		  }
	}
  
	public String nfTypeValue() {
		return this.nfType;
	}
	
	public NFType randomNFType() {
		Random rand = new Random();
		Integer random = rand.nextInt(47);
		this.nfType = possibleValues[random];
		return  this;
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
    return this.nfType;
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
