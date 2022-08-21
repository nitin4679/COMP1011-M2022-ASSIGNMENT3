package ca.georgiancollege.comp1011m2022assignment3;

import com.google.gson.annotations.SerializedName;

public class Movie {
    // Private Instance Members
    @SerializedName("Title")
    private String m_title;

    @SerializedName("Year")
    private String m_year;

    @SerializedName("Rated")
    private String m_rated;

    @SerializedName("Released")
    private String m_released;

    @SerializedName("Runtime")
    private String m_runtime;

    @SerializedName("Genre")
    private String m_genre;

    @SerializedName("Director")
    private String m_director;

    @SerializedName("Writer")
    private String m_writers;

    @SerializedName("Actors")
    private String m_actors;

    @SerializedName("Plot")
    private String m_plot;

    @SerializedName("Poster")
    private String m_poster;

    @SerializedName("imdbID")
    private String m_imdbID;

    @SerializedName("Type")
    private String m_type;


    // Getters (Mutators)

    public String getTitle() {
        return m_title;
    }

    public String getYear() {
        return m_year;
    }

    public String getRated() {
        return m_rated;
    }

    public String getReleased() {
        return m_released;
    }

    public String getRuntime() {
        return m_runtime;
    }

    public String getGenre() {
        return m_genre;
    }

    public String getDirector() {
        return m_director;
    }

    public String getWriters() {
        return m_writers;
    }

    public String getActors() {
        return m_actors;
    }

    public String getPlot() {
        return m_plot;
    }

    public String getPoster() {
        return m_poster;
    }

    public String getIMDB_ID() {
        return m_imdbID;
    }

    public String getType() {
        return m_type;
    }

    // Constructors
    public Movie() {
        this.m_title = "";
        this.m_year = "";
        this.m_rated = "";
        this.m_released = "";
        this.m_runtime = "";
        this.m_genre = "";
        this.m_director = "";
        this.m_writers = "";
        this.m_actors = "";
        this.m_plot = "";
        this.m_poster = "";
        this.m_imdbID = "";
        this.m_type = "";
    }

    public Movie(String title, String year, String rated, String released, String runtime, String genre, String director, String writers, String actors, String plot, String poster, String imdbID, String type) {
        this.m_title = title;
        this.m_year = year;
        this.m_rated = rated;
        this.m_released = released;
        this.m_runtime = runtime;
        this.m_genre = genre;
        this.m_director = director;
        this.m_writers = writers;
        this.m_actors = actors;
        this.m_plot = plot;
        this.m_poster = poster;
        this.m_imdbID = imdbID;
        this.m_type = type;
    }

    // Overridden Methods
    @Override
    public String toString() {

        return String.format("Title: %s, Year: %s",
                getTitle(), getYear());
    }


}
