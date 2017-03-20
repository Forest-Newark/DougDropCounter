import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 * Created by forestnewark on 3/20/17.
 */
public class CounterService implements Serializable {

    private ArrayList<String> countTimeArray;
    File saveFile = new File("dropCount.txt");

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public CounterService() {

        countTimeArray = new ArrayList<>();
    }


    public void addDrop() {
        LocalDateTime timeNow = LocalDateTime.now();
        countTimeArray.add(timeNow.format(formatter));

    }

    public int getDropCount() {
       return countTimeArray.size();
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("** Doug's Drop Log **");
        sb.append("\n");
        int dropNum = 1;
        for (String time : countTimeArray) {
            sb.append("Drop # " + dropNum + " Happened at: " + time);
            sb.append("\n");
            dropNum++;
        }
        sb.append("Total Drops: " + countTimeArray.size());
        return sb.toString();

    }

    public void save() throws IOException {
            try {
                FileWriter fw = new FileWriter(saveFile);
                Writer output = new BufferedWriter(fw);
                for (String date : countTimeArray) {
                    output.write(date + "\n");

                }
                output.close();
            }
            catch (Exception e) {
                System.out.println("No Such File");
            }



    }

    public void load() throws IOException {
        String line;
        try {
            BufferedReader input = new BufferedReader(new FileReader(saveFile));
            if (!input.ready()) {
                throw new IOException();
            }
            while ((line = input.readLine()) != null) {
                countTimeArray.add(line);
            }
        }
        catch (Exception e) {

            System.out.println(e);

        }

    }

    public void resetLog() {
       countTimeArray.clear();
    }


}
