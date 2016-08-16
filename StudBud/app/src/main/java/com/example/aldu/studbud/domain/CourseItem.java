package main.java.com.example.aldu.studbud.domain;

/**
 * Created by Der Bar.de on 16.08.2016.
 */

public class CourseItem implements Comparable<CourseItem>{
    private String rating;
    private String name;
    private String path;

    public CourseItem(String name, String path, String rating){
        this.name = name;
        this.path = path;
        this.rating = rating;
    }

    /* gibt dem User den Namen des CourseItems zurück */
    public String getName(){
        return name;
    }

    /* Wenn der User dem CourseItem (Bild) einen Namen geben will, kann er diese Methode aufrufen */
    public String setName(String name) {
        this.name = name;
        return name;
    }

    /* Hier lässt sich das Rating des CourseItems speichern, wenn es geändert wurde */
    public String setRating(String rating){
        this.rating = rating;
        return rating;
    }

    /* Die Methode gibt den Pfad des CourseItems zurück */
    public String getPath(){
        return path;
    }

    /* Die methode gibt das aktuelle Rating des Courseitem zurück */
    public String getRating() {
        return rating;
    }

    /* Mit dieser Methode kann die App die CourseItems anhand der Namen vergleichen. Kann für die Sortierung der FoodieItems innerhalb der Gallery verwendet werden */
    @Override
    public int compareTo(CourseItem another){
        return getName().compareTo(another.getName());
    }

}


