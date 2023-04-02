package myProject;

import java.time.LocalTime;
import java.util.List;

public class Store {
    private final List<String> Pickers;
    private final LocalTime pickingStartTime;
    private final LocalTime pickingEndTime;

    public Store(List<String> pickers, LocalTime pickingStartTime, LocalTime pickingEndTime) {
        this.Pickers = pickers;
        this.pickingStartTime = pickingStartTime;
        this.pickingEndTime = pickingEndTime;
    }

    public List<String> getPickers() {
        return Pickers;
    }

    public LocalTime getPickingStartTime() {
        return pickingStartTime;
    }

    public LocalTime getPickingEndTime() {
        return pickingEndTime;
    }

}
