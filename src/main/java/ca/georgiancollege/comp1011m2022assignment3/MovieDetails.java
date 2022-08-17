package ca.georgiancollege.comp1011m2022assignment3;

import com.google.gson.annotations.SerializedName;

public class MovieDetails {

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


    // Getters and Setters (Mutators and Accessors)

    public String getTitle() {
        return m_title;
    }

    public void setTitle(String title) {
        this.m_title = title;
    }

    public String getYear() {
        return m_year;
    }

    public void setYear(String year) {
        this.m_year = year;
    }

    public String getRated() {
        return m_rated;
    }

    public void setRated(String rated) {
        this.m_rated = rated;
    }

    public String getReleased() {
        return m_released;
    }

    public void setReleased(String released) {
        this.m_released = released;
    }

    public String getRuntime() {
        return m_runtime;
    }

    public void setRuntime(String runtime) {
        this.m_runtime = runtime;
    }

    public String getGenre() {
        return m_genre;
    }

    public void setGenre(String genre) {
        this.m_genre = genre;
    }

    public String getDirector() {
        return m_director;
    }

    public void setDirector(String director) {
        this.m_director = director;
    }

    public String getWriters() {
        return m_writers;
    }

    public void setWriters(String writers) {
        this.m_writers = writers;
    }

    public String getActors() {
        return m_actors;
    }

    public void setActors(String actors) {
        this.m_actors = actors;
    }

    public String getPlot() {
        return m_plot;
    }

    public void setPlot(String plot) {
        this.m_plot = plot;
    }

    public String getPoster() {
        return m_poster;
    }

    public void setPoster(String poster) {
        this.m_poster = poster;
    }

    public String getIMDB_ID() {
        return m_imdbID;
    }

    public void setIMDB_ID(String imdbId) {
        this.m_imdbID = imdbId;
    }

    public String getType() {
        return m_type;
    }

    public void setType(String type) {
        this.m_type = type;
    }
}
