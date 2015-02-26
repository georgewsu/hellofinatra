package com.georgewsu.hellofinatra

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import com.twitter.finatra.FinatraServer
import com.twitter.finatra.test.SpecHelper

class AppSpec extends FlatSpec with ShouldMatchers with SpecHelper {

  val controller = new MainController
  override val server = new FinatraServer
  server.register(controller)

  "GET /index.html" should "respond 200" in {
    get("/")
    response.body.contains("Finatra - The scala web framework") should equal(true)
    response.code should equal(200)
  }

  "GET /data.json" should """respond with {"foo":"bar"}""" in {
    get("/data.json")
    response.body should equal("""{"foo":"bar"}""")
  }

}
