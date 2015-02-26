import NativePackagerKeys._

name := "hellofinatra"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra" % "1.6.0",
  "org.scalatest" % "scalatest_2.10" % "2.2.4" % "test"
)

resolvers +=
  "Twitter" at "http://maven.twttr.com"

packageArchetype.java_application
