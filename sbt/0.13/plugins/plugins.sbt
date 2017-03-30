resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

addSbtPlugin("org.ensime" % "sbt-ensime" % "1.12.5")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M15")
addSbtPlugin("de.heikoseeberger" % "sbt-fresh" % "1.8.0")
//addSbtPlugin("org.scala-debugger" % "sbt-jdi-tools" % "1.0.0")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.2")
