name := "hellofinatra"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra" % "1.5.2",
  "com.typesafe.akka" %% "akka-actor" % "2.3.9"
)

resolvers += "Twitter" at "http://maven.twttr.com"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
