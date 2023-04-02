package myProject;

import java.time.Duration;
import java.time.LocalTime;

public class Order {
    private final String OrderId;
    private final Duration pickingTime;
    private final LocalTime completeBy;

    public Order(String orderId, Duration pickingTime, LocalTime completeBy) {
        OrderId = orderId;
        this.pickingTime = pickingTime;
        this.completeBy = completeBy;
    }

    public String getOrderId() {
        return OrderId;
    }

    public Duration getPickingTime() {
        return pickingTime;
    }

    public LocalTime getCompleteBy() {
        return completeBy;
    }

}
