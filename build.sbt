organization := "org.ozb"

name := "Test Scala Config"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  // Typesafe config
  "com.typesafe" % "config" % "1.3.1",
	// logging
	"org.slf4j" %  "slf4j-api" % "1.7.+",
	"ch.qos.logback" % "logback-classic" % "1.2.2"
)

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

// Uncomment the following lines to specify a configuration file to load
//fork := true
//javaOptions := Seq("-Dconfig.resource=prod.conf")
