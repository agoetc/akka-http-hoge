import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import app.TodoApp

object Route {

  lazy val todoApp = new TodoApp

  val route =
    path("hello") {
      get {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
      }
    } ~
      path("todo") {
        get {
          todoApp.todo()
        }
      }

}