//This program is scalafx slider sample.
//This is based on Javafx official demo (https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/slider.htm).

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.beans.value.ObservableValue
import scalafx.geometry.Insets
import scalafx.scene.{Group, Scene}
import scalafx.scene.control.Button
import scalafx.scene.layout.GridPane
import scalafx.scene.paint.Color
import scalafx.stage.Stage


object ExternalProcess extends JFXApp {
  private final val button1 = new Button{
    text = "process1"
    onAction = handle {getClass().getResourceAsStream("process1.py")}
  }
  private final val button2 = new Button{
    text = "process2"
    onAction = handle {getClass().getResourceAsStream("process2.py")}
  }

  private final val textColor = Color.BLACK

  private final val root = new Group() 

	stage = new JFXApp.PrimaryStage {
		title = "Slider Sample"
		val s = new Scene(root, 300, 200)

    
  }  

}
