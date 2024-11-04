ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "smithy4s-aws-only",
    scalaVersion := sys.env.getOrElse("SCALA_VERSION", "3.3.3"),
    libraryDependencies ++= Seq(
      "com.disneystreaming.smithy4s" %% "smithy4s-aws-http4s" % "0.18.16",
      "org.http4s" %% "http4s-ember-server" % "0.23.26"
    ),
    Compile / run / fork := true,
    /*
    scalacOptions += "-Vprofile",
    scalacOptions += "-Vprofile-details:10",
    scalacOptions += "-Yprofile-enabled",
    scalacOptions += "-Yprofile-destination:" + ((ThisBuild / baseDirectory).value / "profile.csv").toString */
  )
