ThisBuild / scalaVersion := sys.env.getOrElse("SCALA_VERSION", "3.3.3")
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .enablePlugins(Smithy4sCodegenPlugin)
  .settings(
    name := "smithy4s-aws-only",
    libraryDependencies ++= Seq(
      "com.disneystreaming.smithy4s" %% "smithy4s-http4s" % smithy4sVersion.value,
      "com.disneystreaming.smithy4s" %% "smithy4s-http4s-swagger" % smithy4sVersion.value,
      "com.disneystreaming.smithy4s" %% "smithy4s-aws-http4s" % smithy4sVersion.value,
      "org.http4s" %% "http4s-ember-server" % "0.23.26"
    ),
    smithy4sAwsSpecs ++= Seq(AWS.comprehend),
    Compile / smithy4sOutputDir := (Compile / sourceDirectory).value / "scala" / "generated",
    Compile / run / fork := true,
    /*
    scalacOptions += "-Vprofile",
    scalacOptions += "-Vprofile-details:10",
    scalacOptions += "-Yprofile-enabled",
    scalacOptions += "-Yprofile-destination:" + ((ThisBuild / baseDirectory).value / "profile.csv").toString */
  )
