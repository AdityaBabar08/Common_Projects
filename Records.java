import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Records {


    Scanner sc = new Scanner(System.in);

    int ID, mob;
    String name, loc, course;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void saveData() {

        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File("RECORD.csv"), true));
            pw.append(ID + "," + name + "," + mob + "," + loc + "," + course + "\n");
            pw.flush();
            pw.close();
            pw = null;


        } catch (Exception e) {
            System.out.println("!!!! RECORD NOT ADDED !!!!");
        }
        System.out.println("  RECORD ADDED SUCCESSFULLY  ");
        System.out.println("Register Another Student ? ");
        System.out.println("YES : 1   NO : 0");
        int op = sc.nextInt();

        if (op == 1) {
            Register();
        }

    }

    void Register() {
        System.out.print("Enter ID : ");
        setID(sc.nextInt());
        System.out.print("Enter Name : ");
        setName(sc.next());
        System.out.print("Enter Contact number : ");
        setMob(sc.nextInt());
        System.out.print("Enter Address : ");
        setLoc(sc.next());
        System.out.print("Enter Course : ");
        setCourse(sc.next());
        saveData();


    }


}
