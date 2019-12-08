package project

object Dependencies {

  object Version {
    val scalaTest = "3.1.0"
  }

  val root: Seq[Setting[_]] = deps(
    "org.scalatest" %% "scalatest" % Version.scalaTest,
  )

  private def deps(modules: ModuleID*): Seq[Setting[_]] = Seq(libraryDependencies ++= modules)
}
