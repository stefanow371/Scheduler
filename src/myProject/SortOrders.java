package myProject;

import java.util.Comparator;
import java.util.List;

public class SortOrders {
    public static void sort(List<myProject.Order> ordersList) {
        ordersList.sort(Comparator.comparing(myProject.Order::getCompleteBy));
    }
}
