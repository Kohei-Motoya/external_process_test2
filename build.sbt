libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.0-R4"

fork in run := true

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/ext/jfxrt.jar"))

scalaVersion := "2.11.6"
