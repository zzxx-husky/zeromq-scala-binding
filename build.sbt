organization := "org.zeromq"

name := "zeromq-scala-binding"

version := "0.2.0-husky-team-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "net.java.dev.jna" %  "jna"             % "4.2.2",
  "com.github.jnr"   %  "jnr-constants"   % "0.9.1",
  "org.scalatest"    %%  "scalatest"  % "2.2.6"
)

isSnapshot := true

scalacOptions := Seq("-deprecation", "-unchecked")

publishMavenStyle := true

publishTo <<= version { v: String =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT")) Some("snapshots" at nexus + "content/repositories/snapshots")
  else                             Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

sources in (Compile, doc) ~= (_ filter (_ => false))

pomIncludeRepository := { _ => false }

pomExtra := (
  <scm>
    <url>https://github.com/zzxx-husky/zeromq-scala-binding</url>
  </scm>
  <developers>
    <developer>
      <id>kro</id>
      <name>Karim Vuorisara</name>
      <url>http://github.com/kro/</url>
    </developer>
    <developer>
      <id>zzxx</id>
      <name>zzxx</name>
      <url>http://github.com/zzxx-husky/</url>
    </developer>
  </developers>
)

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/zzxx-husky/zeromq-scala-binding"))
