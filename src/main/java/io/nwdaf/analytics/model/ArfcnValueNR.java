package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Integer value indicating the ARFCN applicable for a downlink, uplink or bi-directional (TDD) NR global frequency raster, as definition of \&quot;ARFCN-ValueNR\&quot; IE in clause 6.3.2 of 3GPP TS 38.331.
 */
@ApiModel(description = "Integer value indicating the ARFCN applicable for a downlink, uplink or bi-directional (TDD) NR global frequency raster, as definition of \"ARFCN-ValueNR\" IE in clause 6.3.2 of 3GPP TS 38.331.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class ArfcnValueNR   {

	private Integer arfcnValueNR = null;
	
	public ArfcnValueNR(Integer arfcnValueNR) {
		setArfcnValueNR(arfcnValueNR);
	}
	
  public Integer getArfcnValueNR() {
		return arfcnValueNR;
	}

	public void setArfcnValueNR(Integer arfcnValueNR) {
		if(arfcnValueNR>-1 && arfcnValueNR<3279166) {
			this.arfcnValueNR = arfcnValueNR;
		}
		else {
			throw new IllegalArgumentException("Not valid arfcnValueNR value. ArfcnValueNR must be in range [0 , 3279165].");
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
    sb.append("class ArfcnValueNR {\n");
    sb.append("    "+ this.arfcnValueNR+"\n");
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
