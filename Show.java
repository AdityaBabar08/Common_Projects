import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class Show extends Records {

    //List<String> headersList = Arrays.asList("NAME", "GENDER", "MARRIED", "AGE", "SALARY($)");
    String currentLine;
    String value[];

    public String getCurrentLine() {
        return currentLine;
    }

    public String[] getValue() {
        return value;
    }

    public void setValue(String[] value) {
        this.value = value;
    }

    public void showRecord() {

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            while ((currentLine = br.readLine())!= null){
            setValue(currentLine.split(","));
            }
            System.out.println(value[0] + value[1] + value[2] + value[3] + value[4]);

        }
        catch (Exception e){

        }

    }



}
