package Quiz;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;


public class SporgsmaalMedBilleder extends Sporgsmaal {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hovedstadsspørgsmål");

        FileInputStream input = new FileInputStream("resources/Whatiwannadorightnow.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        Button button = new Button("Guessed Right", imageView);

        Scene scene = new Scene(button, 1000, 950);
        primaryStage.setScene(scene);
        primaryStage.show();
            }
}