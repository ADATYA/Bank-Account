package com.bikrom.ex;

public class Main {
  public static void main(String[] args) {
    Account bikromsAccount = new Account("12345", 0.00, "BIKROM", "bikromroy0711@gmail.com", "01935952772");
    double DepositMoney;
    bikromsAccount.DepositMoney(96000);
    bikromsAccount.WithdrowMoney(1000); //If I have less then 500 taka then the value print unsuccessfull.
  }
  }
  

