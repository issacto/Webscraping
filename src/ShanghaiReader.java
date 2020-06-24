

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import com.opencsv.CSVReader;
import java.net.URISyntaxException;


public class ShanghaiReader {
    ArrayList<String[]> listings = new ArrayList<String[]>();

    public ShanghaiReader(){
        System.out.print("Begin loading Shanghai University Ranking dataset...");
        String csvFile = "/Users/issac/Documents/GitHub/GUI for University/src/sample/output.csv";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] university = line.split(",");
                listings.add(university);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public ArrayList<String[]> getListings(){
        return listings;
    }


}
