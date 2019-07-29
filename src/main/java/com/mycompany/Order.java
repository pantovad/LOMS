package com.mycompany;

public class Order {

private String id;
private String orderId;
private String accountId;
private Double priceLimit;
private Boolean executed;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getOrderId() {
return orderId;
}

public void setOrderId(String orderId) {
this.orderId = orderId;
}

public String getAccountId() {
return accountId;
}

public void setAccountId(String accountId) {
this.accountId = accountId;
}

public Double getPriceLimit() {
return priceLimit;
}

public void setPriceLimit(Double priceLimit) {
this.priceLimit = priceLimit;
}

public Boolean getExecuted() {
return executed;
}

public void setExecuted(Boolean executed) {
this.executed = executed;
}

}
