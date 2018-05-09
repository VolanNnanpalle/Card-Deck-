
package carddeck;

import java.awt.Button;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * A program that displays three cards randomly selected from a deck of 52
 *
 * @author Volan Nnanpalle
 */
public class CardDeck extends Application
{
    Button btRefresh = new Button("Refresh");

    @Override
    public void start(Stage primaryStage)

    {
        ArrayList list=new ArrayList(); //creates an array list

        FlowPane pane=new FlowPane(); // creates a flow pane 
        pane.setPadding(new Insets(40, 50, 10, 50));
        pane.setHgap(40);
        pane.setVgap(40);
        //pane.add(btRefresh,2, 0b1010);
        
        //stores 52 values in the list array
        for(int i=1; i<52; i++)
        {
            list.add(i);
        }
        Collections.shuffle(list); //shuffle the list

        //prints out 3 cards
        for(int i=0; i<3; i++)
        {
            Image image=new Image("file:"+list.get(i)+".png"); //load image
            ImageView imageView=new ImageView();
            imageView.setImage(image);
            pane.getChildren().add(imageView);
        }


        //create a scene and place it in the stage
        Scene scene=new Scene(pane, 400, 180);
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("CardDeck");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args)
    {

        launch(args);
    }

}
