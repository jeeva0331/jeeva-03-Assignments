import java.util.Scanner;

class LoginSystem{
    void login(String username, String password){
        System.out.println("the page is login successfully");
        }
        void login(String email, int paasword){
                System.out.println("The email  is login successfully");

    
        }
        void login(long mobilenumber, int otp){
            System.out.println("the page is login successfully");

        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            LoginSystem l=new LoginSystem();
            
            System.out.println("choose one login type:");
            System.out.println("1.username and password");
            System.out.println("2.email and password");
            System.out.println("3.mobilenumbar and OTP");
            
            int choice=sc.nextInt();
            
            if(choice==1){
                System.out.println("enter the username:");
                String username=sc.next();
                System.out.println("entere the password:");
                String password=sc.next();
        
                l.login(username,password);
            }
            else if(choice == 2){
            System.out.println("Enter email:");
            String email = sc.next();
System.out.println("entere the password:");
                int password=sc.nextInt();
            l.login(email,password);
        }

        else if(choice == 3){
            System.out.println("Enter mobile number:");
            long mobilenumber = sc.nextLong();

            System.out.println("Enter OTP:");
            int otp = sc.nextInt();

            l.login(mobilenumber, otp);
        }

        else{
            System.out.println("Invalid option");
        }
        }
}
