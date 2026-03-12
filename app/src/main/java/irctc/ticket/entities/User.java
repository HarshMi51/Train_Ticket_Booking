package irctc.ticket.entities;

import java.util.List;

public class User {
    private String userId;
    private String name;
    private String hashPassword;
    private String password;
    private List<Tickets> ticketsBooked;
}
