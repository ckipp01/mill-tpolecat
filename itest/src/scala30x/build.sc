import $exec.plugins
import io.github.davidgregory084.TpolecatModule
import mill._
import mill.scalalib.ScalaModule

object project extends ScalaModule with TpolecatModule {
  override def scalaVersion = "3.0.2"
}

def verify() = T.command {
  assert(project.scalacOptions() == Seq(
    "-encoding",
    "utf8",
    "-deprecation",
    "-explain-types",
    "-explain",
    "-feature",
    "-language:experimental.macros",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-unchecked",
    "-Xfatal-warnings",
    "-Ykind-projector",
  ), s"scalacOptions did not match, got instead: ${project.scalacOptions()}")
}
