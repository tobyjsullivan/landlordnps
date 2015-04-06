package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def rate = Action {

    Ok(views.html.rate())
  }

  def browse = Action {

    Ok(views.html.browse())
  }

  def search = Action {

    Ok(views.html.search())
  }
}