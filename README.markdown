# hellofinatra

Requires [sbt](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html) to build and run the app.

## SBT Instructions

### Runs the app on port 7070

    sbt run

### Runs the app on port 8080

    sbt -Dcom.twitter.finatra.config.port=:8080 run

### Testing

    sbt test

### Stage

    sbt stage

### Packaging (fatjar)

    sbt assembly

## Heroku

### To put on heroku

    heroku create
    git push heroku master

### To run anywhere else (fatjar)

    java -jar target/*-0.0.1-SNAPSHOT-jar-with-dependencies.jar

### To run fatjar on port 8080

    java -Dcom.twitter.finatra.config.port=:8080 -jar target/*-0.0.1-SNAPSHOT-jar-with-dependencies.jar
