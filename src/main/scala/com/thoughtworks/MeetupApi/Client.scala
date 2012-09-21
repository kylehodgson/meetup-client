package com.thoughtworks.MeetupApi

import dispatch._
import com.codahale.jerkson.Json

class Client {

  private val sites = List(
    "toronto-code-retreat",
    "toronto-coding-dojo")

  def getSites = sites

  def getEventsFor(site: String): List[Meetup] = {
    var events = List[Meetup]()
    val svc = url(new Url().getEventsUrl(site))
    val responses = Http(svc OK as.String)
    for (r <- responses) {
      val apiResponse = Json.parse[EventsResponse](r)
      if (apiResponse.results.length > 0) {
        val event = Json.parse[EventsResponse](r).results(0)
        events = event :: events
      }

    }
    events
  }

}