package ca.georgiancollege.comp1011m2022assignment3;

import com.google.gson.annotations.SerializedName;

public class MovieSearchResults
{
    // private instance members (fields)
    @SerializedName("Search")
    private Movie[] m_movies;

    // Getters (Readonly Properties)

    public Movie[] getMovies() {
        return m_movies;
    }

    // Overridden methods
    @Override
    public String toString()
    {
        String movieList = "";
        for (var movie: getMovies())
        {
            movieList += "Title: " + movie.getTitle() + ", Year: " + movie.getYear() + ", IMDB ID: " + movie.getIMDB_ID() + "\n";
        }

        return movieList;
    }
}
