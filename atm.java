import java.util.*;
class atm{
    String name = "";
    int money = 10000,dep_amount,with_amount;
    int r_pin,pin;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        atm a = new atm();
        String ch="";
        a.CreateAccount();

        do{ 
            a.list();
            int choice = sc.nextInt();
        switch(choice){
            case 1:
               a.deposite();
               break;
            case 2:
               a.Withdraw();
               break;
            case 3:
               a.checkBalance();
               break;
            case 4:
               a.exit();
               break;
            default:
               System.out.println("Make sure to slect a number from the given list");
        }
        System.out.println("Do you want to continue? Y/N");
        ch = sc.next();
       
    }
    
       while(ch.equalsIgnoreCase("Y"));
    }
    public void CreateAccount(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
         name = sc.next();
        System.out.println("Set a pin to your account and it must contain at least 4 digits :");
        pin = sc.nextInt();
        String res = (pin > 1000) ? "Welcome "+name +", Your account successfully created." : "Pin must contain at least 4 digits.";
        System.out.println(res);
        
    }
    public void list(){
        String n = name.equals("") ? "Dear customer" : name;
        System.out.println("Hello "+n+", Welcome to ATM....");
        String arr[] = {"Select 1 for Deposite","Select 2 for Withdraw","Select 3 for Check Balance","Select 4 for Exit"};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void deposite(){
        System.out.print("Enter the amount: \n");
        dep_amount = sc.nextInt();
        System.out.print("Enter the pin: \n");
        r_pin = sc.nextInt();
        if(r_pin == pin){System.out.println("Successfully you have deposited your amount. ");
        money = money+dep_amount;
        } 
        else{System.out.println("You've entered wrong pin, Please try again....");
        deposite();}
    }
    public void Withdraw(){
        System.out.print("Withdraw: \nEnter the amount: \n");
        with_amount = sc.nextInt();
        System.out.print("Enter the pin: \n");
        r_pin = sc.nextInt();
        if(r_pin == pin){System.out.println("Successfully you have deposited your amount. ");
        money = money - with_amount;
        } 
        else{System.out.println("You've entered wrong pin, Please try again....");
        Withdraw();}
    }
    public void checkBalance(){
        System.out.print("Enter the pin: \n");
        r_pin = sc.nextInt();
        if(r_pin == pin){System.out.println("Your current bank balence is "+money); } 
        else{System.out.println("You've entered wrong pin, Please try again....");
        checkBalance();}
    }
    public void exit(){
        System.out.println("Thanks for using.....");
    }

}