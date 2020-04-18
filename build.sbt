name := "akka-http-hoge"

version := "0.1"

scalaVersion := "2.13.1"

val circeVersion = "0.13.0"

libraryDependencies ++= Seq(
  // akka
  "com.typesafe.akka" %% "akka-http" % "10.1.11",
  "com.typesafe.akka" %% "akka-stream" % "2.6.4",

  // circe
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion
)
