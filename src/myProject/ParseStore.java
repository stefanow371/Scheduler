package myProject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ParseStore {
    private static final String PICKERS = "pickers";
    private static final String PICKING_START =  "pickingStartTime";
    private static final String PICKING_END = "pickingEndTime";

    public static Store getStoresFromJSON(String filePath) throws FileNotFoundException {
        Gson gson = new Gson();
        List<String> pickers = new ArrayList<>();
        LocalTime pickingStartTime;
        LocalTime pickingEndTime;

        try (FileReader fileReader = new FileReader(filePath)) {
            JsonObject jsonObject = gson.fromJson(fileReader, JsonObject.class);
            JsonArray jsonArray = jsonObject.getAsJsonArray(PICKERS);
            for (JsonElement picker : jsonArray) {
                pickers.add(picker.getAsString());
            }
            pickingStartTime = LocalTime.parse(jsonObject.get(PICKING_START).getAsString());
            pickingEndTime = LocalTime.parse(jsonObject.get(PICKING_END).getAsString());
        } catch (IOException e) {
            throw new FileNotFoundException("Error reading file " + filePath);
        }

        return new Store(pickers, pickingStartTime, pickingEndTime);
    }
}





