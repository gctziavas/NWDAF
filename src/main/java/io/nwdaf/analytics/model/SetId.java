package io.nwdaf.analytics.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SetId {

	private String setId = null;
	
	public SetId(String setId) {
		  String pattern = "^([A-Za-z0-9\\-]*[A-Za-z0-9])$";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(setId);
		  if (m.matches()) {
			  this.setId = setId;
		}
		  else {
			  throw new IllegalArgumentException("Not valid setId argument. SetId must must follow the \"^([A-Za-z0-9\\-]*[A-Za-z0-9])$\" pattern.");
		  }
	}
  
	public String setIdValue() {
		return this.setId;
	}
	
	
	
}
