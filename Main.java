import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String[] usernames, passwords;
    Scanner input = new Scanner(System.in);
    usernames = new String[]{"Bob","Suzy","Chris"};
    passwords = new String[]{"123456","password","aa"};
    int attempts=0;
    int index = -1;
    String user, pword;
    boolean loggedIn=false;
    do{
      System.out.println("Enter your username: ");
      user = input.nextLine();
      System.out.println("Enter your password: ");
      pword = input.nextLine();
      for(int i = 0; i<usernames.length; i++){
        if(user.equals(usernames[i]) &&
          pword.equals(passwords[i])){
          System.out.println("Logged in!");
          loggedIn = true;
          }
      }
      attempts++;
    }while(!loggedIn && attempts<3);
    if(!loggedIn && attempts>=3){
      System.out.println("Denied entry");
    }else{
      System.out.println("Welcome to our system!");     
    }
 }
}