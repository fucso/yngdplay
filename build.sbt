name := """yngdplay"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

libraryDependencies += guice


libraryDependencies ++= Seq(evolutions, javaJdbc)
lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"