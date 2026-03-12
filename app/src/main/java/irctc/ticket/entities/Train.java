package irctc.ticket.entities;

import java.sql.Time;
import java.util.*;

public class Train {
    private String trainId;
    private String trainNumber;
    private List<List<Boolean>> seats;
    private Map<String, Time> stationsTime;
    private List<String> stations;
}
