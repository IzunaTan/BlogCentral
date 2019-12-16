package be.intecbrussel.model.entities;

import be.intecbrussel.model.EntityInterface;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Comment implements EntityInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @NotNull
    private Author author;

    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private Blog blog;

    @NotNull
    private String message;

    @NotNull
    private int likeCount;

    public Comment() {
    }

    public Comment(Author author, Blog blog, String message) {
        this.blog=blog;
        this.author = author;
        this.message = message;
        this.likeCount = 0;
    }

    public Comment setId(int id) {
        this.id = id;
        return this;
    }

    public Comment setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }


    public Comment setMessage(String message) {
        this.message = message;
        return this;
    }

    public Comment setLikeCount(int likeCount) {
        this.likeCount = likeCount;
        return this;
    }


    public Object getId() {
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

    public Blog getBlog() {
        return blog;
    }


    // Copies all the attributes from an comment object to this comment object
    public void cloneFrom(EntityInterface commentt) {
        Comment comment = (Comment) commentt;
        this.author = comment.author;
        this.message = comment.message;
        this.likeCount = comment.likeCount;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", author=" + author +
                ", blog=" + blog +
                ", message='" + message + '\'' +
                ", likeCount=" + likeCount +
                '}';
    }
}
