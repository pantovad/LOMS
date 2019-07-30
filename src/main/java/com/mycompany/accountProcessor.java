package com.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class accountProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		Account body = (Account) exchange.getIn().getBody();
		body.set_id("A-" + exchange.getExchangeId());
		body.setAccountId("A-" + exchange.getExchangeId());
	}
}
