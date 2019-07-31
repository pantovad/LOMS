package com.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.mongodb.BasicDBObject;

public class orderProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {

		Object body =  exchange.getIn().getBody();
		if (body instanceof Order) {
			((Order) body).set_id(exchange.getIn().getHeader("orderId", String.class));
			((Order) body).setOrderId(exchange.getIn().getHeader("orderId", String.class));
			((Order) body).setExecuted(exchange.getIn().getHeader("executed", Boolean.class));
		} else if (body instanceof BasicDBObject) {
			((BasicDBObject) body).put("executed", exchange.getIn().getHeader("executed", Boolean.class));
		}			
	}
}
