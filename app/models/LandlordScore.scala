package models

import play.api.libs.json.{Json, Format}

object LandlordScore {
  implicit val fmt: Format[LandlordScore] = Json.format[LandlordScore]
}

case class LandlordScore(placeId: String, landlordName: Option[String], score: Int)
