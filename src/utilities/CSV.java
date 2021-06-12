package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    //ta metoda będzie odczytywać plik CSV i zapisze go jako listę
    public static List<String[]> read(String file) {
        //Lista naszych importowanych kont
        List<String[]> data = new LinkedList<>();
        String dataRow;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            //pętla while, która odpowiada za odczyt kolejnych linijek z pliku CSV
            while ((dataRow = bufferedReader.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("fille is missing");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("can`t read the file");
            e.printStackTrace();
        }
        return data;
    }
}
