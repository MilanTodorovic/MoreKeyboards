package MoreKeyboards;

// TODO https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html#develop_with_maven

// TODO https://github.com/java-native-access/jna
//  https://devblogs.microsoft.com/oldnewthing/20160627-00/?p=93755
//  https://devblogs.microsoft.com/oldnewthing/20030723-00/?p=43073


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
