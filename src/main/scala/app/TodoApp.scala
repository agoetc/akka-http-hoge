package app

import akka.http.scaladsl.server.Directives.complete
import akka.http.scaladsl.server.Route
import de.heikoseeberger.akkahttpcirce.FailFastCirceSupport._
import io.circe.generic.auto._

class TodoApp {

  case class Todo(title: String)

  def todo(): Route = complete(Todo("hoge"))
}
