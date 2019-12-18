package be.intecbrussel.model.entities;

import be.intecbrussel.model.EntityInterface;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Comment implements EntityInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @NotNull
    private Author author;
    @NotNull
    private String message;
    @NotNull
    private int likeCount;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comment> comments;

    public Comment(Author author, String message) {
        this.author = author;
        this.message = message;
        this.likeCount = 0;
        this.comments = new ArrayList<>();
    }

    public Comment addComments(Comment... comments){
        Arrays.stream(comments).forEach(e -> this.comments.add(e));
        return this;
    }

    public Comment(){
        this.likeCount = 0;
        this.comments = new ArrayList<>();
    }

    public Comment setId(int id) {
        this.id = id;
        return this;
    }

    public Comment setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Comment setMessage(String message) {
        this.message = message;
        return this;
    }

    public Comment setLikeCount(int likeCount) {
        this.likeCount = likeCount;
        return this;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Comment setComments(List<Comment> comments) {
        this.comments = comments;
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

    // Copies all the attributes from an comment object to this comment object
    public void cloneFrom(EntityInterface commentt) {
        Comment comment = (Comment) commentt;
        this.author = comment.author;
        this.message = comment.message;
        this.likeCount = comment.likeCount;
    }

    @Override
    public String toString() {
        return "\n Comment{" +
                "id=" + id +
                ", author=" + author +
                ", message='" + message + '\'' +
                ", likeCount=" + likeCount +
                ", comments=" + comments +
                "}\n";
    }
}