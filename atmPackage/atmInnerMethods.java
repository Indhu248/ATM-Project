package atmPackage;


public class atmInnerMethods {
  
   public void createAccount(String name,String pin){
                System.out.println("Hello "+name+", welcome to our ATM ");
                System.out.println("Your account successfully created!!!!");
              }
            
    public void withdraw(int withdraw_amount,int current_amount){

                if(withdraw_amount>=current_amount){
                  System.out.println("Your current balance is lesser than entered anount");
               }
               else{
                int final_amount = current_amount - withdraw_amount;
                System.out.println("Withdraw amount is "+withdraw_amount);
                System.out.println("Now your bank balance is "+final_amount);
                }
       
    }
    public void deposite(int deposite_amount,int current_amount){
             
               int final_amount = current_amount + deposite_amount; 
               System.out.println("Your current balance is "+final_amount);   
               current_amount=final_amount;    

    }
    }
   
