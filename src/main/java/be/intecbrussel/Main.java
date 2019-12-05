package be.intecbrussel;

import be.intecbrussel.data.AuthorMapper;
import be.intecbrussel.data.BlogMapper;
import be.intecbrussel.data.EntityManagerFactoryProvider;
import be.intecbrussel.model.entities.Author;
import be.intecbrussel.model.entities.Blog;
import be.intecbrussel.model.entities.Comment;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
        Author aris = new Author("momo", "mo", "mo", "superpaws", "momo@nono.toto", "momolenbeek", 22, "millecinquante", 1050);
        Blog blog = new Blog(aris, "Soyez bon, la jeunesse");
        Comment comment = new Comment(aris, "Personne ne m'aime :(");

        blog.addComment(comment);

        BlogMapper bm = new BlogMapper();

        bm.addNewBlog(blog);

        blog = bm.getBlog(1);

        blog.getAuthor().setEmail("MY MAIL");

        bm.editBlog(blog);

    }
}
