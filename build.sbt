import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

name := "meetup-client"

version := "0.1"

scalaVersion := "2.9.1"

resolvers ++= Seq("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots")

resolvers ++= Seq("releases"  at "https://oss.sonatype.org/content/groups/scala-tools")

resolvers ++= Seq("repo.novus rels" at "http://repo.novus.com/releases/")

resolvers ++= Seq("repo.novus snaps" at "http://repo.novus.com/snapshots/")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.6.1" % "test",
  "net.databinder.dispatch" %% "core" % "0.9.1",
  "org.mockito" % "mockito-core" % "1.9.5-rc1",
  "com.novus" %% "salat" % "1.9.1",
  "javax.mail" % "mail" % "1.4.2"
)

resolvers ++= Seq("Codahale" at "http://repo.codahale.com")

libraryDependencies ++= Seq("com.codahale" %% "jerkson" % "0.5.0")

//resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
//  "releases"  at "http://oss.sonatype.org/content/repositories/releases")

