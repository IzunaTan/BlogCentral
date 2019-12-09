package be.intecbrussel;

import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.model.entities.Author;
import be.intecbrussel.model.entities.Blog;
import be.intecbrussel.model.entities.Comment;

public class Main {
    public static void main(String[] args) {
        Author aris = new Author("momo", "mo", "mo", "superpaws", "momo@nono.toto", "momolenbeek", 22, "millecinquante", 1050);
        Blog blog = new Blog(aris, "Soyez bon, la jeunesse");
        Comment comment = new Comment(aris, "Personne ne m'aime :(");

        blog.addComment(comment);

        GenericMapper<Blog> bm = new GenericMapper<>();

        blog = bm.addObject(blog);

        blog.getAuthor().setEmail("MY MAIL");

        bm.editObject(blog);

        System.out.println(bm.getObject(new Blog(), 1));
    }
}
