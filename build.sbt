name := "scala-code-analysis"

version := "0.1"

scalaVersion := "2.13.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

scapegoatVersion in ThisBuild := "1.3.9"

sonarProperties ++= Map(
  "sonar.host.url" -> "http://192.168.99.102:9000",
  "sonar.sources" -> "src/main/scala",
  "sonar.tests" -> "src/test/scala"
)