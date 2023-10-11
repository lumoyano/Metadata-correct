package handlers;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

public class JScanner {
    public static void readJson(){
        ArrayList<File> jsonFiles = new ArrayList<>();
        jsonFiles.add(Paths.get("src/sampleJson.json").toFile());
        jsonFiles.add(Paths.get("src/samplePhotosJson.JPG.json").toFile());

        try {
            ObjectMapper objectMapper = new ObjectMapper();

            jsonFiles.forEach((i) -> {
               System.out.println("\n"+i);
               Map<?,?> map = null;

               try {
                   map = objectMapper.readValue(i, Map.class);
                   for (Map.Entry<?, ?> entry : map.entrySet()) {
                       System.out.println(entry.getKey() + "=" + entry.getValue());
                   }
               } catch (IOException e) {
                   throw new RuntimeException(e);
               }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
