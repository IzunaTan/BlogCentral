package be.intecbrussel.model.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @NotNull
    private Author author;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comment> comments;
    @NotNull
    private int likeCount;
    @NotNull
    private String message;

    public Blog(Author author, String message) {
        this.author = author;
        this.likeCount = 0;
        this.message = message;
        this.comments = new ArrayList<>();
    }

    public Blog() {
        this.comments = new ArrayList<>();
        this.likeCount = 0;
    }

    public Blog setId(int id) {
        this.id = id;
        return this;
    }

    public Blog setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Blog setComments(List<Comment> comments) {
        this.comments = comments;
        return this;
    }

    public Blog setLikeCount(int likeCount) {
        this.likeCount = likeCount;
        return this;
    }

    public Blog setMessage(String message) {
        this.message = message;
        return this;
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

    public void addComment(Comment comment){
        this.comments.add(comment);
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

    @Override
    public String toString() {
        return "\nBlog{" +
                "id=" + id +
                ", author=" + author +
                ", comments=" + comments +
                ", likeCount=" + likeCount +
                ", message='" + message + '\'' +
                "}\n";
    }
}
