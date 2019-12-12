package be.intecbrussel;

import be.intecbrussel.data.GenericMapper;
import be.intecbrussel.model.entities.Author;
import be.intecbrussel.model.entities.Blog;
import be.intecbrussel.model.entities.Comment;
import be.intecbrussel.tools.BCrypter;
import be.intecbrussel.tools.HTMLChecker;

public class Main {
    public static void main(String[] args) {
        Author aris = new Author("momo", BCrypter.hashPassword("mo"), "mo", "superpaws", "momo@nono.toto", "momolenbeek", 22, "millecinquante", 1050);
        Blog blog = new Blog(aris, "Soyez bon, la jeunesse");
        Comment comment = new Comment(aris, "Personne ne m'aime :(");

        blog.addComment(comment);

        GenericMapper<Blog> bm = new GenericMapper<>();

        blog = bm.addObject(blog);

        blog.getAuthor().setEmail("MY MAIL");

        bm.editObject(blog);

        System.out.println(bm.getObject(new Blog(), 1));
        System.out.println("mo ? -> " + BCrypter.checkPassword("mo", aris.getPassword()));
        System.out.println("Mo ? -> " + BCrypter.checkPassword("Mo", aris.getPassword()));

//        String script = "<script src=\"some js script\"></script>";
//        System.out.println(script);
//        script = HTMLChecker.onlyAllowIFrames(script);
//        System.out.println(script);

    }
}
