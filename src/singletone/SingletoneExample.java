package singletone;

import java.io.File;
import java.io.IOException;

public class SingletoneExample {

    public static void main(String[] args) throws IOException {
        /*File f = new File("db.txt");
        f.createNewFile();*/
        DataBase db1 = DataBase.getInstance();
        db1.readDataFromDB();
        DataBase db2 = DataBase.getInstance();
        db2.readDataFromDB();
    }


}
