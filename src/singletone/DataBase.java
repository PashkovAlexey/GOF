package singletone;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataBase {
    private File file;
    private static DataBase db;


    private DataBase(){
        File f = new File("1.txt");

    }

    public static DataBase getInstance() {
        if (db == null){
            db = new DataBase();
        }
         return db;

    }

    public String readDataFromDB (){
        try (BufferedReader br = new BufferedReader(new FileReader("db.txt"))){
            StringBuilder sb = new StringBuilder();
            String currentLine = "";
            while ((currentLine = br.readLine()) != null){
                System.out.println(currentLine);
                if (currentLine != null && !currentLine.isBlank()){
                   sb.append(currentLine);
                }
            }
            return sb.toString();
        } catch (IOException e) {
           e.printStackTrace();
           System.out.println("Данная персона не найдена");
        }
        return null;

    }

}
