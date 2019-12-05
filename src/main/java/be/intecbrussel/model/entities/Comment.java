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

    public Comment(Author author, String message, int likeCount) {
        this.author = author;
        this.message = message;
        this.likeCount = likeCount;
    }

    public int getId() {
        return id;
    }

    public Author getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void cloneFrom(Comment comment) {
        this.author = comment.author;
        this.message = comment.message;
        this.likeCount = comment.likeCount;
    }
}
