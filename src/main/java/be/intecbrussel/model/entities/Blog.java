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

    public Blog(Author author, List<Comment> comments, int likeCount, String message) {
        this.author = author;
        this.comments = comments;
        this.likeCount = likeCount;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public Author getAuthor() {
        return author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public String getMessage() {
        return message;
    }

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

    public void cloneFrom(Blog blog) {
        this.author = blog.author;
        this.comments = blog.comments;
        this.likeCount = blog.likeCount;
        this.message = blog.message;
    }
}
