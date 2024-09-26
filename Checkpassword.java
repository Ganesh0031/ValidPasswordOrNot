package Strins;

import java.util.Scanner;
class check{
   private String Username="ganu0031";
   private String Gmail="gingle0731@gmail.com";
   private String password="Ganu0731";
   public void checkingProcess(String Uname,String mail,String psd){
       if(Username.equalsIgnoreCase(Uname) && Gmail.equals(mail) && password.equals(psd)){
           System.out.println("Login is SuccessFully ");
       }
       else if(Username.equalsIgnoreCase(Uname) && Gmail.equals(mail) && !password.equals(psd) ){
           System.out.println("Invalid Passwords Pleased Try again! ");
       }
       else if(Username.equalsIgnoreCase(Uname) && ! Gmail.equals(mail) && password.equals(psd) ){
           System.out.println("Invalid Gmail Pleased Try again! ");
       }
       else if(!Username.equalsIgnoreCase(Uname) && ! Gmail.equals(mail) && password.equals(psd) ){
           System.out.println("Invalid Gmail and Username Pleased Try again! ");
       }
       else if(Username.equalsIgnoreCase(Uname) && ! Gmail.equals(mail) && !password.equals(psd) ){
           System.out.println("Invalid Gmail and password Pleased Try again! ");
       }
       else if(!Username.equalsIgnoreCase(Uname) &&  Gmail.equals(mail) && !password.equals(psd) ){
           System.out.println("Invalid Username and password Pleased Try again! ");
       }
       else if(!Username.equalsIgnoreCase(Uname) &&  Gmail.equals(mail) && password.equals(psd) ){
           System.out.println("Invalid Username Pleased Try again! ");
       }
       else{
           System.out.println("All is invalid ");
       }
   }
}
public class Checkpassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Username: ");
        String uname=sc.nextLine();
        System.out.println("Enter the Gmail: ");
        String mail=sc.nextLine();
        System.out.println("Enter the password: ");
        String psd=sc.next();
        check c=new check();
        c.checkingProcess(uname,mail,psd);
    }
}
