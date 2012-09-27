package com.thoughtworks.MeetupApi

class Url {
  def getEventsUrl(meetup: String): String = {
    var fields = ""
    fieldList.foreach {
      field =>
        if (fields != "")
          fields += ","
        fields += field
    }
    config("base-url") + config("events") + "/?key=" + config("key") + "&group_urlname=" + meetup + "&fields=" + fields
  }

  private val config = Map(
    ("base-url", "http://api.meetup.com/2/"),
    ("key", System.getenv("COMMUNITY_EMAILER_MEETUP_APIKEY")),
    ("by-group", "group_urlname"),
    ("events", "events"))
  private val fieldList = List[String]("rsvpable", "rsvp_rules")
}