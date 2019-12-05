package be.intecbrussel.model.entities;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Author author;
    private String message;
    private int likeCount;
}
