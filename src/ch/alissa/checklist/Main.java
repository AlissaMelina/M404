package ch.alissa.checklist;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application
{

    private static Controller controller;

    @Override
    public void start(Stage stage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("ToDo");
        stage.setScene(new Scene(root, 980, 120));
        stage.show();

        controller = new Controller();
    }

    @Override
    public void stop() throws Exception
    {
        super.stop();
    }

    public static void main(String[] args)
    {
        launch();
    }

}
