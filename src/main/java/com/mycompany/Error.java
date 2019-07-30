package com.mycompany;

import java.util.LinkedHashMap;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Error implements Processor {

	public void process(Exchange exchange) throws Exception {
		LinkedHashMap<String, Object> newBody = new LinkedHashMap<String, Object>();
		newBody.put("status", "failure");
		newBody.put("error", exchange.getIn().getHeader("errorMessage"));
		exchange.getIn().setBody(newBody);
	}
}