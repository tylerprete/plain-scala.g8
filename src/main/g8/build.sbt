name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.13" % "test",
  "org.scalatest" %% "scalatest" % "2.2.0" % "test"
)
