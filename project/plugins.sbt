addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.5.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.28")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.4.2")

addSbtPlugin("com.lihaoyi" % "scalatex-sbt-plugin" % "0.3.11")
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25"
