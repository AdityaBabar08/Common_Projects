import java.io.*;

public class OperationsOnRecords extends Records {


    public void search() {
        System.out.print("Enter Name to be search : ");
        String se = sc.next();
        int pos = 1;
        String CurrentLine;
        String data[];

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            while ((CurrentLine = br.readLine()) != null) {
                data = CurrentLine.split(",");
                if (data[pos].equalsIgnoreCase(se)) {
                    System.out.println("!! RECORD FOUND !!");
                    System.out.print("ID : ");
                    System.out.println(data[0]);
                    System.out.print("Name : ");
                    System.out.println(data[1]);
                    System.out.print("Mobile No. : ");
                    System.out.println(data[2]);
                    System.out.print("Location : ");
                    System.out.println(data[3]);
                    System.out.print("Course : ");
                    System.out.println(data[4]);
                } else {
                    System.out.println("!! RECORD FOR" + se + "NOT FOUND !!");
                }
            }
        } catch (Exception e) {

        }


    }

    public void Delete() {

        System.out.print("Enter the Name for which Record is Deleted : ");
        String termtoremove = sc.next();


        int position = 1;
        String Tempfile = "temp.csv";
        File newfile = new File(Tempfile);

        String currentline;
        String data[];

        try {
            FileWriter fr = new FileWriter(Tempfile, true);
            BufferedWriter bw = new BufferedWriter(fr);
            PrintWriter pr = new PrintWriter(bw);

            FileReader fre = new FileReader(f);
            BufferedReader br = new BufferedReader(fre);

            while ((currentline = br.readLine()) != null) {
                data = currentline.split(",");
                if (!(data[position].equalsIgnoreCase(termtoremove))) {
                    pr.println(currentline);

                }

            }
            pr.flush();
            pr.close();
            pr = null;
            fre.close();
            fre = null;
            br.close();
            br = null;
            bw.close();
            bw = null;
            fr.close();
            fr = null;

            System.out.println("!!!Record Deleted successfully!!!");

        } catch (Exception q) {
        } finally {
            System.gc();
            boolean n = f.delete();
            File dump = new File("RECORD.csv");
            boolean n2 = newfile.renameTo(dump);
            System.out.println(n);
            System.out.println(n2);

        }
    }
}



