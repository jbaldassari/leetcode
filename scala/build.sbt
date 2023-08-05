val scala3Version = "3.3.0"

//resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

Test / logBuffered := false

lazy val root = project
  .in(file("."))
  .settings(
    name := "leetcode-scala",
    version := "1.0.0",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.16",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % Test
  )
