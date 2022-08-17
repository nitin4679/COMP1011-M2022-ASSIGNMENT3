package ca.georgiancollege.comp1011m2022assignment3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DetailsViewController {

    @FXML
    private Label actorsLabel;

    @FXML
    private Label directorLabel;

    @FXML
    private Label genreLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private Label imdbIDLabel;

    @FXML
    private Label plotLabel;

    @FXML
    private Label ratedLabel;

    @FXML
    private Label releasedLabel;

    @FXML
    private Label runtimeLabel;

    @FXML
    private Label titleLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private Label writersLabel;

    @FXML
    private Label yearLabel;

    @FXML
    void goBackButtonClicked(ActionEvent event) throws IOException {
        SceneManager.Instance().changeScene(event, "search-view.fxml");

    }

    private Movie movieDetails;

    public void getMovieDetails(String imdbID){
        movieDetails = APIManager.Instance().getMovieDetailsFromOMDBByID(imdbID);
        titleLabel.setText(movieDetails.getTitle());
        yearLabel.setText(movieDetails.getYear());
        ratedLabel.setText(movieDetails.getRated());
        releasedLabel.setText(movieDetails.getReleased());
        runtimeLabel.setText(movieDetails.getRuntime());
        genreLabel.setText(movieDetails.getGenre());
        directorLabel.setText(movieDetails.getDirector());
        writersLabel.setText(movieDetails.getWriters());
        actorsLabel.setText(movieDetails.getActors());
        plotLabel.setText(movieDetails.getPlot());
        imdbIDLabel.setText(movieDetails.getIMDB_ID());
        typeLabel.setText(movieDetails.getType());

        var posterNotFoundImage = new Image(getClass().getResourceAsStream("poster-not-found.png"));

        try
        {
            imageView.setImage(new Image((movieDetails.getPoster())));
        }catch(Exception e)
        {
            imageView.setImage(posterNotFoundImage);
        }
    }

}
