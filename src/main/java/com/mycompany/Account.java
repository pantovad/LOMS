package com.mycompany;

public class Account {

private String _id;
private String accountId;
private String name;
private Double usdBalance;
private Double btcBalance = (double) 0;

public String get_id() {
return _id;
}

public void set_id(String _id) {
this._id = _id;
}

public String getAccountId() {
return accountId;
}

public void setAccountId(String accountId) {
this.accountId = accountId;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Double getUsdBalance() {
return usdBalance;
}

public void setUsdBalance(Double usdBalance) {
this.usdBalance = usdBalance;
}

public Double getBtcBalance() {
return btcBalance;
}

public void setBtcBalance(Double btcBalance) {
this.btcBalance = btcBalance;
}

}