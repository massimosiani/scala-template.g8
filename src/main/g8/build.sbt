import sbt._

lazy val $name$ = (project in file("."))
  .configs(Configs.all: _*)
  .settings(Settings.root: _*)
