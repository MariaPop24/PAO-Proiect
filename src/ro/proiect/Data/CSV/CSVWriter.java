package ro.proiect.Data.CSV;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class CSVWriter {
    private static CSVWriter instance;

    private CSVWriter() {
    }

    public static CSVWriter getInstance() {
        if (instance == null) {
            instance = new CSVWriter();
        }
        return instance;
    }

    public void writeCSV(ArrayList<String[]> data, String cale)
            throws Exception {
                BufferedWriter w = new BufferedWriter(new FileWriter(cale));
                for (String[] row : data) {
                String s = String.join(",", row) + "\n";
                w.write(s);
        }
        w.close();
    }

    public void appendCSV(String[] data, String path) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        String d = String.join(",", data);
        writer.write(d + "\n");
        writer.close();
    }
}

