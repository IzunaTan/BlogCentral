package be.intecbrussel.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Author author;
    @OneToMany
    private List<Comment> comments;
    private int likeCount;
    private String message;

    private void editPost(){

    }

    private void deletePost(){

    }

    private void addComment(){

    }

    private void deleteComment(){

    }

    private void editComment(){

    }
}
