package oops_2;

class BankAccount{
  private String accountHolderName;
  private int accountNo;
  private int balance;
  
  //Setter
  public void setHolderName(String accountHolderName){
    this.accountHolderName=accountHolderName;
  }
  public void setAccountNo(int accountNo){
    this.accountNo=accountNo;
  }
  public void setbalance(int balance){
    if(balance>=0){
      this.balance=balance;
    }else{
      System.out.println("Balance can't be negative sign");
    }
  }

  //Getter
  public String getHolderName(){
    return this.accountHolderName;
  }
  public int getAccountNo(){
    return this.accountNo;
  }
  public int getbalance(){
    return this.balance;
  }
}
public class oops3 {
  public static void main(String[] args) {
    BankAccount c=new BankAccount();
    c.setHolderName("Akash");
    c.setAccountNo(23453);
    c.setbalance(40);

    System.out.println(c.getbalance());
  }    
  
  
}
