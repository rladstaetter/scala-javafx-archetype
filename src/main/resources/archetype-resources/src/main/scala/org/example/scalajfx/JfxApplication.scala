package org.example.scalajfx

import javafx.application.Application
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.fxml.JavaFXBuilderFactory
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.stage.Stage
import java.net.URL
import java.util.ResourceBundle

object JfxApplication {

  def main(args: Array[String]): Unit = {
    Application.launch(classOf[JfxApplication], args: _*)
  }

}

class JfxApplication extends javafx.application.Application {

  override def start(primaryStage: Stage): Unit = {
    primaryStage.setTitle("HelloWorld");
    val root = new StackPane();
    primaryStage.setScene(new Scene(root));
    val page = FXMLLoader.load(classOf[JfxApplication].getResource("/skel.fxml"), null, new JavaFXBuilderFactory()).asInstanceOf[Parent]
    primaryStage.getScene().setRoot(page)
    primaryStage.sizeToScene()
    primaryStage.show();
  }

}

class JfxApplicationController extends Initializable {

  @FXML def doSomething() = {
    println("hello world")
  }
  
  override def initialize(url: URL, rb: ResourceBundle) = {
  }

}
