package com.ao.pizzeria

import org.scalatra.test.specs2._

// For more on Specs2, see http://etorreborre.github.com/specs2/guide/org.specs2.guide.QuickStart.html
class pizzeria_servletSpec extends ScalatraSpec { def is =
  "GET / on pizzeria_servlet"                     ^
    "should return status 200"                  ! root200^
                                                end

  addServlet(classOf[pizzeria_servlet], "/*")

  def root200 = get("/") {
    status must_== 200
  }
}