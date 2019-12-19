package be.intecbrussel.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TotalVisitTracker {
    @Id
    private int id = 1;
    private int totalVisits = 0;

    public int getId() {
        return id;
    }

    public TotalVisitTracker setId(int id) {
        this.id = id;
        return this;
    }

    public int getTotalVisits() {
        return totalVisits;
    }

    public TotalVisitTracker setTotalVisits(int totalVisits) {
        this.totalVisits = totalVisits;
        return this;
    }
}
