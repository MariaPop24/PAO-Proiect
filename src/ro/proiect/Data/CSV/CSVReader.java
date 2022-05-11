package ro.proiect.Data.CSV;

import java.io.*;
import java.util.ArrayList;

public class CSVReader {
    private static CSVReader instance;

    private CSVReader() {
    }

    public static CSVReader getInstance() {
        if (instance == null) {
            instance = new CSVReader();
        }
        return instance;
    }

    public ArrayList<String[]> readCsvFile(String cale) throws Exception {

        BufferedReader r = new BufferedReader(new FileReader(cale));
        ArrayList<String[]> rows = new ArrayList<>();
        String row;

        while ((row = r.readLine()) != null) {
            row = row.strip();
            if (row.equals("")) {
                continue;
            }
            rows.add(row.split(","));
        }

        return rows;
    }
}
