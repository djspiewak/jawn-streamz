// import SonatypeKeys._

// sonatypeSettings

organization := "org.http4s"

name := "jawn-streamz"

version := "0.4.1"

scalaVersion := "2.10.5"

crossScalaVersions := Seq("2.10.5", "2.11.6")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/"))

resolvers ++= Seq(
  "bintray/non" at "http://dl.bintray.com/non/maven",
  "bintray/scalaz" at "http://dl.bintray.com/scalaz/releases"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-feature"
)

val JawnVersion = "0.7.4"

libraryDependencies ++= Seq(
  "org.spire-math" %% "jawn-parser" % JawnVersion,
  "org.spire-math" %% "jawn-ast" % JawnVersion % "test",
  "org.scalaz.stream" %% "scalaz-stream" % "0b8034baed5edf0e71b378174f476da1c95121f8",
  "org.specs2" %% "specs2" % "2.4" % "test"
)
