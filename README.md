# Scala Binding for ZeroMQ

This version is intend to support lib-zmq-4.X, jna-4.2.2 and jnr-0.8.4, as the lastest ones currently.

CAUTION: Since this is not an official version, use it with care. I suggest you use sbt `publish-local` to make it a local repository.

Here I also thank Alex for his contribution: https://github.com/alexdeleon/zeromq-scala-binding. He did most of the updates for ZeroMQLibrary and the two tests.

The Scala binding for ZeroMQ is based on ZeroMQ versions 2.1.x and uses [JNA][]
for accessing native functions. It is a thin wrapper of the ZeroMQ API, but
offers also a `jzmq`-like API intending to be compatible with the Java binding
for ZeroMQ; users of the Java binding wanting to access ZeroMQ over JNA can
switch over to the Scala binding.

[JNA]: https://github.com/twall/jna

## Installation

Scala binding for ZeroMQ is made available through a Maven repository. If
you're using SBT, ament your `build.sbt` with:

````
resolvers += "Sonatype (releases)" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies += "org.zeromq" %% "zeromq-scala-binding" % "0.0.9"
````

## Configure for GPG signed artefacts

When publishing a package to OSS Sonatype, you may sign the artefacts by adding
the following lines to `project/plugins.sbt`:

````
resolvers += Resolver.url("sbt-plugin-release", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases")) (Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.7")
````

Also, you need create a file containing your Sonatype credentials
`~/.sbt/sonatype.sbt`:

````
credentials += Credentials("Sonatype Nexus Repository Manager",
                           "oss.sonatype.org",
                           "your-sonatype-username",
                           "your-sonatype-password")
````
