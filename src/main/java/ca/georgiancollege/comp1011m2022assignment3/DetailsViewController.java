package ca.georgiancollege.comp1011m2022assignment3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DetailsViewController implements Initializable {

    @FXML
    private ImageView imageView;

    @FXML
    private ListView<Movie> resultsListView;

    @FXML
    void goBackButtonClicked(ActionEvent event) throws Exception{
        SceneManager.Instance().changeScene(event,"search-view.fxml");

    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
