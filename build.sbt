scalaVersion := "2.13.1"
name := "spider"
organization := "com.tosone"
version := "1.0"

mainClass in (Compile, packageBin) := Some("Main")
mainClass in (Compile, run) := Some("Main")

libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.30.1"
