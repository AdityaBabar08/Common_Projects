public class Portal extends Records {
    Show s = new Show();
    OperationsOnRecords o = new OperationsOnRecords();

    void menu() {
        System.out.println("1 : REGISTER NEW STUDENT \n2 : DELETE RECORD \n3 : SHOW RECORD \n4 : SEARCH \n5 : LOGOUT");
        int op = sc.nextInt();
        switch (op) {
            case 1 : Register();break;
            case 2 : o.Delete();break;
            case 3 : s.showRecord();break;
            case 4 : o.search();break;
            case 5 : System.out.println("LOGGED OUT");System.exit(0);


        }
    }


    public void login() {

        System.out.print("ENTER LOGIN ID : ");
        String Id = sc.nextLine();
        System.out.print("ENTER PASSWORD : ");
        int pw = sc.nextInt();
        if (Id.equals("Aditya") && pw == 0) {
            System.out.println("!!!!! LOGIN SUCCESSFUL!!!!!!!");
            menu();
        } else {
            System.out.println("INVALID");
        }


    }


}
