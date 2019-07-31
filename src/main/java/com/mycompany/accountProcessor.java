package com.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.mongodb.BasicDBObject;

public class accountProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		
		Object body = exchange.getIn().getBody();
		if (body instanceof Account) {
			((Account) body).set_id(exchange.getIn().getHeader("accountId", String.class));
			((Account) body).setAccountId(exchange.getIn().getHeader("accountId", String.class));
			((Account) body).setUsdBalance(exchange.getIn().getHeader("usdBalance", Double.class));
			((Account) body).setBtcBalance(exchange.getIn().getHeader("btcBalance", Double.class));
		} else if (body instanceof BasicDBObject) {
			((BasicDBObject) body).put("usdBalance", exchange.getIn().getHeader("usdBalance", Double.class));
			((BasicDBObject) body).put("btcBalance", exchange.getIn().getHeader("btcBalance", Double.class));
		}
	}
}
