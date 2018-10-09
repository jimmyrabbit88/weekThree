public class Film {
    private String title;
    private String director;
    private int duration;
    private static int noOfFilms = 0;


    public Film(String title, String director, int duration){
        this.setTitle(title);
        this.setDirector(director);
        this.setDuration(duration);
        // add to number of films
        noOfFilms++;
    }

    public Film(){
        this ("no title", "no Director", 0);
    }

    public String toString(){
        return "name : "+ title + "\nDirector" + director + "\nDuration"+ duration + "\n";
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public static int getNoOfFilms(){
        return noOfFilms;
    }
}

