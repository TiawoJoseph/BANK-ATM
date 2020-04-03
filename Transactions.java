import java.util.Scanner;


public class Transactions
{
    public static void main (String []args) 
    {
        Scanner scan = new Scanner(System.in);
        int message;
        int acc1 = 604032;
        Double balance = 123.45;
        int branchn = 2117;
        String acchldnm ="Ezekiel Ogunnupe";
       
        Double withdral;
        Double transfer;
        Double emailtr;  
        int pin1 = 1234;
        int action;
        int brnum;
        int accnum;
        int amt;
        String email;

    System.out.println("Hi there welcome to TJT Bank! Please enter your pin number.");
    message = scan.nextInt();

    if 
        (message == pin1){
        System.out.println("Thank you " +acchldnm);
        System.out.println("Your account balance is: $"+balance);
        System.out.println("Your account number is: "+acc1);
        System.out.println("Your branch number is: "+branchn);
        }else if (message != pin1){
    System.out.println("incorrect pin Number. Please remove your card and Re-Insert.");
        }
       else {
    System.out.println("There is something wrong on our end");
       }


       Double deposit;  
    System.out.println("So what brings you in today? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
    action=scan.nextInt();

    if (action == 1){
        System.out.println("Please enter the amount to be deposited.");
        deposit =scan.nextDouble();
        System.out.println(" The balance in your account is now : " + (balance + deposit));
        System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
        action=scan.nextInt();
        if (action == 1){
            System.out.println("Please enter the amount to be deposited.");
            deposit =scan.nextDouble();
            System.out.println(" The balance in your account is now : " + balance + deposit);
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 2){
            System.out.println("Please enter the amount you would like to withdraw.");
            withdral =scan.nextDouble();
            System.out.println(" The balance in your account is now : ");
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 3){
            System.out.println("Please enter the branch number : ");
            System.out.println("Please enter the Account number : ");
            System.out.println("Please enter the Amount to transfer : ");
            transfer=scan.nextDouble();
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 4){
            System.out.println("Please enter the email address of the recipient : ");
            System.out.println("Please enter the Amount to transfer : ");
            emailtr =scan.nextDouble();
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action <=0){
            System.out.println("Please enter a number between 1 and 4");
        }
        else {
            System.out.println("OOPS! Looks like there is something wrong on our end");
        }
    }
    else if (action == 2){
        System.out.println("Please enter the amount you would like to withdraw.");
        withdral =scan.nextDouble();
        System.out.println(" The balance in your account is now : ");
        System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
        action=scan.nextInt();

        if (action == 1){
            System.out.println("Please enter the amount to be deposited.");
            deposit =scan.nextDouble();
            System.out.println(" The balance in your account is now : " + balance + deposit);
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 2){
            System.out.println("Please enter the amount you would like to withdraw.");
            withdral =scan.nextDouble();
            System.out.println(" The balance in your account is now : ");
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 3){
            System.out.println("Please enter the branch number : ");
            System.out.println("Please enter the Account number : ");
            System.out.println("Please enter the Amount to transfer : ");
            transfer=scan.nextDouble();
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 4){
            System.out.println("Please enter the email address of the recipient : ");
            System.out.println("Please enter the Amount to transfer : ");
            emailtr =scan.nextDouble();
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action <=0){
            System.out.println("Please enter a number between 1 and 4");
        }
        else {
            System.out.println("OOPS! Looks like there is something wrong on our end");
        }
    }
    else if (action == 3){
        System.out.println("Please enter the branch number : ");
        branchn=scan.nextInt();
        System.out.println("Please enter the Account number : ");
        accnum=scan.nextInt();
        System.out.println("Please enter the Amount to transfer : ");
        amt= scan.nextInt();
        transfer=scan.nextDouble();
        System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
        action=scan.nextInt();


        if (action == 1){
            System.out.println("Please enter the amount to be deposited.");
            deposit =scan.nextDouble();
            System.out.println(" The balance in your account is now : " + balance + deposit);
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 2){
            System.out.println("Please enter the amount you would like to withdraw.");
            withdral =scan.nextDouble();
            System.out.println(" The balance in your account is now : ");
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 3){
            System.out.println("Please enter the branch number : ");
            System.out.println("Please enter the Account number : ");
            System.out.println("Please enter the Amount to transfer : ");
            transfer=scan.nextDouble();
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 4){
            System.out.println("Please enter the email address of the recipient : ");
            System.out.println("Please enter the Amount to transfer : ");
            emailtr =scan.nextDouble();
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action <=0){
            System.out.println("Please enter a number between 1 and 4");
        }
        else {
            System.out.println("OOPS! Looks like there is something wrong on our end");
        }
    }
    else if (action == 4){
        System.out.println("Please enter the email address of the recipient : ");
        email=scan.next();
        System.out.println("Please enter the Amount to transfer : ");
        emailtr =scan.nextDouble();
        System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
        action=scan.nextInt();


        // if (action == 1){
            System.out.println("Please enter the amount to be deposited.");
            deposit =scan.nextDouble();
            System.out.println(" The balance in your account is now : " + balance + deposit);
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 2){
            System.out.println("Please enter the amount you would like to withdraw.");
            withdral =scan.nextDouble();
            System.out.println(" The balance in your account is now : ");
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 3){
            System.out.println("Please enter the branch number : ");
            System.out.println("Please enter the Account number : ");
            System.out.println("Please enter the Amount to transfer : ");
            transfer=scan.nextDouble();
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action == 4){
            System.out.println("Please enter the email address of the recipient : ");
            System.out.println("Please enter the Amount to transfer : ");
            emailtr =scan.nextDouble();
            System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
            action=scan.nextInt();
        }
        else if (action <=0){
            System.out.println("Please enter a number between 1 and 4");
        }
        else {
            System.out.println("OOPS! Looks like there is something wrong on our end");
        }
    
    elseif (action <=0) {
        System.out.println("Please enter a number between 1 and 4");
    }

    
   /* Double X = balance + deposit;
    if
       (deposit>=1){
           System.out.println("Account balance after deposit: $"+ (X));
           System.out.println("Thank you for choosing TJT Bank!");
       }else if 
       (deposit<0){
           System.out.println("Please enter an amount abouve 0");
       }
       else{
           System.out.println("There is an error on our system.");
       }

   */

    


    int X=0;

while (X<=4){
    System.out.println(X);

    X+=1;

}

    
    


        
    }
}






else if (action == 2){
    System.out.println("Please enter the amount you would like to withdraw.");
    withdral =scan.nextDouble();
    System.out.println(" The balance in your account is now : ");
    System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
    action=scan.nextInt();

    if (action == 1){
        System.out.println("Please enter the amount to be deposited.");
        deposit =scan.nextDouble();
        System.out.println(" The balance in your account is now : " + balance + deposit);
        System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
        action=scan.nextInt();
    }
    else if (action == 2){
        System.out.println("Please enter the amount you would like to withdraw.");
        withdral =scan.nextDouble();
        System.out.println(" The balance in your account is now : ");
        System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
        action=scan.nextInt();
    }
    else if (action == 3){
        System.out.println("Please enter the branch number : ");
        System.out.println("Please enter the Account number : ");
        System.out.println("Please enter the Amount to transfer : ");
        transfer=scan.nextDouble();
        System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
        action=scan.nextInt();
    }
    else if (action == 4){
        System.out.println("Please enter the email address of the recipient : ");
        System.out.println("Please enter the Amount to transfer : ");
        emailtr =scan.nextDouble();
        System.out.println("Would you like to predform another transaction? Press 1 = Deposit, 2 = Withdral, 3 = Transfer, 4 = Email Transfer.");
        action=scan.nextInt();
    }
    else if (action <=0){
        System.out.println("Please enter a number between 1 and 4");
    }
    else {
        System.out.println("OOPS! Looks like there is something wrong on our end");
    }



    if (etot==acchldnm && erel==chq){
        System.out.println("Congrats!! Looks like we've got your signature and your cheqing account is all setup you balance is: " + balance/balance);


    }