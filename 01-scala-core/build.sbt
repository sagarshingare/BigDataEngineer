ThisBuild / scalaVersion := "2.13.4"

ThisBuild / organization := "com.sagarshingare"
ThisBuild / version := "1.0.0"

lazy val root = (project in file("."))
  .settings(
    name := "scala-core",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test,
      "org.apache.spark" %% "spark-core" % "3.5.6",
      "org.apache.spark" %% "spark-sql" % "3.5.6",
      "org.apache.spark" %% "spark-mllib" % "3.5.6",
      "org.apache.spark" %% "spark-streaming" % "3.5.6",
      "org.twitter4j" % "twitter4j-core" % "4.0.4",
      "org.twitter4j" % "twitter4j-stream" % "4.0.4"
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked",
      "-encoding", "UTF-8"
    )
  )