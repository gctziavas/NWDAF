package io.nwdaf.analytics.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FALSE represents not applicable for all slices. TRUE represents applicable for all slices.
 */
@ApiModel(description = "FALSE represents not applicable for all slices. TRUE represents applicable for all slices.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-27T12:24:16.086762+02:00[Europe/Athens]")
public class AnySlice   {
	private boolean anySlice = false;
	
	public AnySlice(String anySlice) {
		anySlice = anySlice.toLowerCase();
		if(anySlice.equals("true")) {
			this.anySlice = true;
		}
		else {
			this.anySlice = false;
		}
	}
	
	
	
  public boolean getAnySlice() {
		return anySlice;
	}



	public void setAnySlice(boolean anySlice) {
		this.anySlice = anySlice;
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
    sb.append("class AnySlice {\n");
    
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
