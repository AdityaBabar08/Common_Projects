import java.util.*;

public class Main {


    public static void login() {
        Scanner lg = new Scanner(System.in);
        System.out.print("ENTER LOGIN ID : ");
        String Id = lg.nextLine();
        System.out.print("ENTER PASSWORD : ");
        int pw = lg.nextInt();
        if (Id.equals("Aditya") && pw == 0) {
            System.out.println("!!!!! LOGIN SUCCESSFUL!!!!!!!");
            menu();
        } else {
            System.out.println("INVALID");
        }
    }

    public static void Register() {

        String name;
        int id, mob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        id = sc.nextInt();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.println("Enter Contact number : ");
        mob = sc.nextInt();
        System.out.println("  RECORD ADDED SUCCESSFULLY  ");
    }


    public static void menu() {
        System.out.println("1 : REGISTER NEW STUDENT \n2 : DELETE RECORD \n3 : SHOW RECORD \n4 : LOGOUT");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch (op) {
            case 1:
                Register();
                break;
            case 2: //delete();break;
            case 3: //show();break;
            case 4:
                System.out.println("LOGGED OUT");
                System.exit(0);
        }
    }


    public static void main(String[] args) {

        System.out.println("STUDENT REGISTRATION PORTAL");
        System.out.println("1 : LOGIN");
        System.out.println("2 : EXIT");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch (op) {
            case 1 -> login();
            case 2 -> System.exit(0);
        }
    }
}