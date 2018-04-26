name := "untitled"

version := "0.1"

scalaVersion := "2.12.5"



libraryDependencies ++= Seq(
  "org.jooq" % "jooq" % "3.10.6",
  "org.jooq" % "jooq-meta" % "3.10.6",
  "org.jooq" % "jooq-codegen" % "3.10.6",
  "org.jooq" %% "jooq-scala" % "3.10.6",
  "com.h2database" % "h2" % "1.3.159"
)

enablePlugins(PackPlugin)
