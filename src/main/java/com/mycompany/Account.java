package com.mycompany;

public class Account {

private String id;
private String accountId;
private String name;
private Double usdBalance;
private Double btcBalance;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
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