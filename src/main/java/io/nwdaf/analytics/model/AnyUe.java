package io.nwdaf.analytics.model;

import java.util.Objects;

public class AnyUe {
private boolean anyUe = false;
	
	public AnyUe(String anyUe) {
		anyUe = anyUe.toLowerCase();
		if(anyUe.equals("true")) {
			this.anyUe = true;
		}
		else {
			this.anyUe = false;
		}
	}
	
	
	
  public boolean getAnyUe() {
		return anyUe;
	}



	public void setAnyUe(boolean anyUe) {
		this.anyUe = anyUe;
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
    sb.append("{\n");
    sb.append(this.anyUe);
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
