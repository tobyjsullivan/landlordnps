package controllers

import models.LandlordScore
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}

object API extends Controller {
  def rate = Action {
    Ok(Json.obj("result" -> "OK"))
  }

  def browse = Action {
    val results = List(
      LandlordScore("ChIJCXMtHCxyhlQRA7NJwYaFCGg", None, -32),
      LandlordScore("38f4705c05b9f51b84e6668750784c7d6dd03a75", Some("Graham"), -12)
    )

    Ok(Json.obj("result" -> results))
  }
}
