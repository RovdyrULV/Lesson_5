import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        AppData appdata1 = new AppData(new String[]{"Value1;"}, new int[5][5]);
        FileOutputStream outputStream = new FileOutputStream("Table");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(appdata1);
        objectOutputStream.close();


    }
}
