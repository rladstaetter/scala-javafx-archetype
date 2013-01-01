package org.example.scalajfx

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec
import org.jemmy.fx.SceneDock
import org.jemmy.fx.AppExecutor
import org.jemmy.fx.control.ToggleButtonDock
import org.jemmy.fx.control.LabeledDock

class JfxApplicationSpec extends FlatSpec with ShouldMatchers {

  AppExecutor.executeNoBlock(classOf[JfxApplication])

  val scene = new SceneDock

  "a button" must "be present." in {
    val b = new LabeledDock(scene.asParent)
    println(b.asText().text())
  }

  "hello world" should "be shown ten times on the console." in {
    val mouseAtButton = new LabeledDock(scene.asParent()).mouse()
    for (i <- 1 to 10) mouseAtButton.click
  }
  
}