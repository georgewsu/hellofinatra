package com.georgewsu.hellofinatra

import com.twitter.finatra._
import com.twitter.finatra.ContentType._

class MainController extends Controller {

  get("/") { request =>
    render.static("index.html").toFuture
  }

  get("/data.json") { request =>
    render.json(Map("foo" -> "bar")).toFuture
  }

  error { request =>
    request.error match {
      case Some(e: Exception) => {
        e.printStackTrace()
        render.status(500).plain("Something went wrong!").toFuture
      }
      case _ => {
        render.status(500).plain("Something went wrong!").toFuture
      }
    }
  }

}
