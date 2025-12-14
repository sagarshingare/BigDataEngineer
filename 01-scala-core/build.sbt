ThisBuild / scalaVersion := "2.13.12"

ThisBuild / organization := "com.sagarshingare"
ThisBuild / version := "1.0.0"

lazy val root = (project in file("."))
  .settings(
    name := "scala-core",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked",
      "-encoding", "UTF-8"
    )
  )
