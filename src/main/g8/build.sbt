name := "$name$"

organization := "$organization$"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

version := "$version$"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.5" % "test" withSources() withJavadoc()
)

// show feature and deprecation warnings.
scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions")

updateOptions := updateOptions.value.withCachedResolution(true)

initialCommands := "import $organization$.$name;format="lower,word"$._"
