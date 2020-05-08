import $exec.plugins
import io.github.davidgregory084.TpolecatModule
import mill._
import mill.scalalib.ScalaModule

object project extends ScalaModule with TpolecatModule {
  override def scalaVersion = "2.13.2"
}

def verify() = T.command {
  assert(project.scalacOptions() == Seq("-encoding", "utf8", "-explaintypes", "-feature", "-language:existentials", "-language:experimental.macros", "-language:higherKinds", "-language:implicitConversions", "-unchecked", "-Xcheckinit", "-Xfatal-warnings", "-Xlint:adapted-args", "-Xlint:constant", "-Xlint:delayedinit-select", "-Xlint:deprecation", "-Xlint:doc-detached", "-Xlint:inaccessible", "-Xlint:infer-any", "-Xlint:missing-interpolator", "-Xlint:nullary-override", "-Xlint:nullary-unit", "-Xlint:option-implicit", "-Xlint:package-object-classes", "-Xlint:poly-implicit-overload", "-Xlint:private-shadow", "-Xlint:stars-align", "-Xlint:type-parameter-shadow", "-Wdead-code", "-Wextra-implicit", "-Wnumeric-widen", "-Wunused:implicits", "-Wunused:imports", "-Wunused:locals", "-Wunused:params", "-Wunused:patvars", "-Wunused:privates", "-Wvalue-discard"))
}
