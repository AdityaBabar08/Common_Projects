import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class Show extends Records {

    List<String> headersList = Arrays.asList("ID", "NAME", "MOBILE", "LOCATION", "COURSE");
    List<List<String>> rowList;
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
             rowList = Arrays.asList(Arrays.asList(getValue()));
            }
            //System.out.println(value[0] + value[1] + value[2] + value[3] + value[4]);
            wagu.Board board = new wagu.Board(75);
            wagu.Table table = new wagu.Table(board, 75, headersList, rowList);
            List<Integer> colWidthsList = Arrays.asList(14, 14, 13, 14, 14);
            table.setColWidthsList(colWidthsList);
            wagu.Block tableBlock = table.tableToBlocks();
            board.setInitialBlock(tableBlock);
            board.build();
            String preview1 = board.getPreview();
            System.out.println("TABLE EXAMPLE 1");
            System.out.println(preview1);


        }
        catch (Exception e){

        }

    }



}
