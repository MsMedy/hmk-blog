package com.techtalentsouth.TechTalentBlog.BlogPosts;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;

@Entity
public class BlogPost {
    //purpose of this class
    //is to be used as a blueprint for the
    //SQL database we will use

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String author;
    private String blogEntry;

    public BlogPost(){

    }

    public BlogPost(String title, String author, String blogEntry) {
        this.title = title;
        this.author = author;
        this.blogEntry = blogEntry;
        //this constructor set the data, it will create a new Blog entry and then
        //send the data off to SQL

        //make sure there is some sort of exception to generate an error
        // message to be created when
        //user doesnt include all needed info in constructor. otherwise
        //backend (SQL) will crash

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogEntry() {
        return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
        this.blogEntry = blogEntry;
    }

    @Override
    public String toString() {
        return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
    //allows us to console out a blog post
    //overriding toString specifically because when call any class it will
        // call toString automatically, so we make sure to override this function
    }




}
