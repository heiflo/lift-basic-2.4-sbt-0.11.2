
name := "lift-basic"

version := "0.1.0"

organization := "net.lift"
 
scalaVersion := "2.9.1"
 
seq(webSettings: _*)

resolvers += "Java.net Maven2 Repo" at "http://download.java.net/maven/2/"

resolvers += "Lift Snapshots" at "http://scala-tools.org/repo-snapshots/"

resolvers += "Scala-Tools Maven2 Repository" at "http://scala-tools.org/repo-releases"

resolvers += "Scala-Tools Maven2 Snapshot Repository" at "http://scala-tools.org/repo-snapshots"
 
libraryDependencies ++= {
  val liftVersion = "2.4"
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default" withSources(),
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default" withSources(),
    "net.liftweb" %% "lift-wizard" % liftVersion % "compile->default" withSources()
  )
}
  
libraryDependencies ++= Seq(
  "junit" % "junit" % "4.5" % "test->default",
  "org.eclipse.jetty" % "jetty-webapp" % "7.5.4.v20111024" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
  "com.h2database" % "h2" % "1.2.138",
  "ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default",
  "postgresql" % "postgresql" % "9.0-801.jdbc4" % "compile->default"
)