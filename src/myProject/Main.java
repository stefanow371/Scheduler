package myProject;
import java.io.IOException;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        String storeJSON = args[0];
        String ordersJSON = args [1];

        Store store = ParseStore.getStoresFromJSON(storeJSON);
        List<Order> orders = ParseOrders.getOrdersFromFile(ordersJSON);
        AssignOrder.assignOrders(orders,store);
    }
}