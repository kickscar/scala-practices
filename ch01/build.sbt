ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "me.kickscar"

lazy val ch01 = (project in file("."))
  .settings(
    name := "ch01"
  )