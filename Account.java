package com.bikrom.ex; //create Package

public class Account {
    private String ac_number;
    private double ac_balence;
    private String Name;
    private  String Email;
    private String contact;

//Creating constructor  area.

    public Account(String ac_number,double ac_balence,String Name,String Email,String contact){
        this.ac_number=ac_number;
        this.ac_balence=ac_balence;
        this.Name=Name;
        this.Email=Email;
        this.contact=contact;

    }
    //Start working for Method..
    public void DepositMoney(double DepositMoney){
        this.ac_balence+=DepositMoney;
        System.out.println("Deposit is SUCCESSFULLY  ## NEW BALANCE IS -->> " + this.ac_balence);
    }
    public  void  WithdrowMoney (double withdrowalMoney){
        if(this.ac_balence - withdrowalMoney < 0 ){
            System.out.println("Withdrow UNSUCCESSFULLY you have only -->> " +  this.ac_balence+ " left your account :(");

        }else{
            this.ac_balence-=withdrowalMoney;
            System.out.println("Withdrow money SUCCESSFULLY now current balence is" +this.ac_balence+"in your account :)");
        }
    }
// Start get-set method.

    public String getAc_number() {
        return ac_number;
    }

    public void setAc_number(String ac_number) {
        this.ac_number = ac_number;
    }

    public double getAc_balence() {
        return ac_balence;
    }

    public void setAc_balence(double ac_balence) {
        this.ac_balence = ac_balence;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
