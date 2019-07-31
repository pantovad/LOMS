package com.mycompany;

public class Order {

private String _id;
private String orderId;
private String accountId;
private Double priceLimit;
private Double amount;
private Boolean executed = false;

public String get_id() {
return _id;
}

public void set_id(String _id) {
this._id = _id;
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

public Double getAmount() {
return amount;
}

public void setAmount(Double amount) {
this.amount = amount;
}

public Boolean getExecuted() {
return executed;
}

public void setExecuted(Boolean executed) {
this.executed = executed;
}

}
