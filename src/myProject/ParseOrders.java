package myProject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ParseOrders {
    private static final String ORDER_ID = "orderId";
    private static final String PICKING_TIME = "pickingTime";
    private static final String COMPLETE_BY = "completeBy";

    public static List<myProject.Order> getOrdersFromFile(String filePath) throws IOException {
        Gson gson = new Gson();
        JsonArray jsonArray = gson.fromJson(new FileReader(filePath), JsonArray.class);
        List<myProject.Order> orders = new ArrayList<>();

        for (JsonElement jsonElement : jsonArray) {
            JsonObject orderJson = jsonElement.getAsJsonObject();

            String orderId = orderJson.get(ORDER_ID).getAsString();
            Duration pickingTime = Duration.parse(orderJson.get(PICKING_TIME).getAsString());
            LocalTime completeBy = LocalTime.parse(orderJson.get(COMPLETE_BY).getAsString());

            myProject.Order order = new myProject.Order(orderId, pickingTime, completeBy);
            orders.add(order);
        }
        return orders;
    }
}
