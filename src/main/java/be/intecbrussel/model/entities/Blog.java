package be.intecbrussel.model.entities;

import be.intecbrussel.model.EntityInterface;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Blog implements EntityInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    @NotNull
    private Author author;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comment> comments;
    @NotNull
    private int likeCount;
    @NotNull
    private String message;
    private String title;

    public String getTitle() {
        return title;
    }

    public Blog setTitle(String title) {
        this.title = title;
        return this;
    }

    public Blog(Author author, String title, String message) {
        this.author = author;
        this.title = title;
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

    public Object getId() {
        return id;
    }

    @Override
    public Object setId(String id) {
        this.id = Integer.parseInt(id);
        return this;
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

    public void addComments(Comment... comments){
        Arrays.stream(comments).forEach(e -> this.comments.add(e));
    }

    // Copies all the attributes from an blog object to this blog object
    public void cloneFrom(EntityInterface blogg) {
        Blog blog = (Blog) blogg;
        if (blog.getComments().size() != this.comments.size()) {
            Comment comment = blog.getComments().get(((Blog) blogg).getComments().size() - 1);
            comment.setAuthor(author);
            comments.add(comment);
        }
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
