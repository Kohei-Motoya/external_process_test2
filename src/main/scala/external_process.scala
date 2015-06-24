//This program is scalafx slider sample.
//This is based on Javafx official demo (https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/slider.htm).

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.beans.value.ObservableValue
import scalafx.geometry.Insets
import scalafx.scene.{Group, Scene}
import scalafx.scene.control.Button
import scalafx.scene.layout.HBox
import scalafx.stage.Stage
import scala.sys.process._


object ExternalProcess extends JFXApp {
  val builder = new StringBuilder
	stage = new JFXApp.PrimaryStage {
		title = "Slider Sample"
    width = 200
    height = 100
		scene = new Scene {
      content = new HBox {
        padding = Insets(20)
        spacing = 10
        content = Seq(
          new Button{
            text = "process1"
            onAction = handle {("python3 " + getClass().getResourceAsStream("process1.py")) ! ProcessLogger(line => {
              builder ++= line
              builder ++= System.lineSeparator
              }, line => ())}
          },
          new Button{
            text = "process2"
            onAction = handle {("python3 " + getClass().getResourceAsStream("process2.py")) ! ProcessLogger(line => {
              builder ++= line
              builder ++= System.lineSeparator
              }, line => ())}
          }
        )
      }
    }
  }    
} 