package myProject;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssignOrder {
    public static void assignOrders(List<Order> orders, Store store) {
        Map<Order, String> assignedMap = new HashMap<>();
        LocalTime time = store.getPickingStartTime();
        SortOrders.sort(orders);

        for (Order order : orders) {
            if (time.isAfter(store.getPickingEndTime().minus(order.getPickingTime()))) {
                break;
            }
            String currentPicker = null;
            for (String picker : store.getPickers()) {
                boolean isOverlapping = false;
                for (Order assignedOrder : assignedMap.keySet()) {
                    if (assignedMap.get(assignedOrder).equals(picker) &&
                            assignedOrder.getCompleteBy().isAfter(order.getCompleteBy().minus(order.getPickingTime()))) {
                        isOverlapping = true;
                        break;
                    }
                }
                if (!isOverlapping) {
                    assignedMap.put(order, picker);
                    currentPicker = picker;
                    System.out.println(picker + " " + order.getOrderId() + " " + time);
                    time = time.plus(order.getPickingTime());
                    break;
                }
            }

            if (currentPicker == null) {
                break;
            }
        }
    }
}

