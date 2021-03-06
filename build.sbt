name := "spark-ml-pipelines-with-structured-streaming-examples"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.7"
val sparkVersion = "2.4.0"
val sparkCassandraConnectorVersion = "2.3.2"
val slf4jVersion = "1.7.16"
val log4jVersion = "1.2.17"

val sparkAndDependencies = Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion
)

libraryDependencies ++= sparkAndDependencies
//  .map(_ % "provided")

libraryDependencies ++= Seq(
  "com.datastax.spark" % "spark-cassandra-connector_2.11" % sparkCassandraConnectorVersion,
  "org.postgresql" % "postgresql" % "42.1.1",
  "com.github.fommil.netlib" % "all" % "1.1.2" pomOnly(),
  "org.scalatest" %% "scalatest" % "3.0.5",
  "com.typesafe" % "config" % "1.3.1",
  "com.github.scopt" %% "scopt" % "3.6.0"
)
