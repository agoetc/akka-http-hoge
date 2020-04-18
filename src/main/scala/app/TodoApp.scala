package app

import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.Directives.complete
import akka.http.scaladsl.server.Route

class TodoApp {

  def todo(): Route = {
    complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Todo</h1>"))
  }

}
