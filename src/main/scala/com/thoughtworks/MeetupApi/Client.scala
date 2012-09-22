package com.thoughtworks.MeetupApi

import dispatch._
import com.codahale.jerkson.Json

class Client {

  private val sites = List(
    "toronto-code-retreat",
    "toronto-coding-dojo")

  def getSites = sites

  def getEventsFor(site: String) = {

    val svc = url(new Url().getEventsUrl(site))
    val responses = Http(svc OK as.String)

    for  {
      r <- responses
      apiResponse = Json.parse[EventsResponse](r)
      if apiResponse.results.length > 0
    } yield apiResponse

  }

}