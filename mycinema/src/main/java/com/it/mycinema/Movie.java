package com.it.mycinema;
public class Movie {
   private String title ;
   private int duration ;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "{" + title + ", duration: " + duration + " minutes }";
    }
    
   
}
