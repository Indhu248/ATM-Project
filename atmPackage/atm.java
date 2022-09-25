package atmPackage;

import java.util.*;
class atm{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        atmInnerMethods obj1 = new atmInnerMethods();

        atm b = new atm();

        char p;

        int current_amount = 10000;
        String confirmPin;

        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter the pin: ");
        String pin = sc.next();
        obj1.createAccount(name, pin);
       
        do{
            System.out.println(" 1.Withdraw \n 2.deposite \n 3.check balance \n 5.Exit");
            int choice = sc.nextInt();
            switch(choice){
               case 1:
                       System.out.println("Enter the amount to withdraw");
                       int withdraw_amount = sc.nextInt();
                       System.out.println("Enter the confirmation pin");
                       confirmPin = sc.next();

                       if(confirmPin.equals(pin)){

                           obj1.withdraw(withdraw_amount,current_amount);
                           int final_amount = current_amount-withdraw_amount;
                           current_amount = final_amount;
                        }
                        else{
                            System.out.println("Wrong pin, Please try again");                
                         }

                      break;
            
            case 2:
                     System.out.println("Enter the amount you want to deposite: ");
                     int deposite_amount = sc.nextInt();
                     obj1.deposite(deposite_amount, current_amount);
                     int final_amount=deposite_amount+current_amount;
                     current_amount = final_amount;
                     break;

               case 3:
              
                   System.out.println("Your current bank balance is "+current_amount);

               break;
               default:
                 System.out.println("Thanks for using our ATM");
            }

            System.out.println("Do you want to continue? Y/N");
            p = sc.next().charAt(0);
        }
       
        while(p =='y');
    }

}