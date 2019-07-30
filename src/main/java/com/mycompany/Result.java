package com.mycompany;

import java.util.LinkedHashMap;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class Result implements Processor {

	public void process(Exchange exchange) throws Exception {
		LinkedHashMap<String, Object> newBody = new LinkedHashMap<String, Object>();
		newBody.put("status", "success");
		newBody.put("data", exchange.getIn().getBody());
		exchange.getIn().setBody(newBody);
	}
}