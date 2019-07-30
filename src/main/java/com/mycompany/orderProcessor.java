package com.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class orderProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		Order body = (Order) exchange.getIn().getBody();
		body.set_id("O-" + exchange.getExchangeId());
		body.setOrderId("O-" + exchange.getExchangeId());
	}
}
