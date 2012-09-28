package com.thoughtworks.MeetupApi

import dispatch._
import com.codahale.jerkson.Json

class Client {

  private val sites = List(
  "toronto-code-retreat",
  "toronto-coding-dojo",
  "atlanta-scala",
  "CMP-TO",
  "DevOpsTo",
  "first100hours",
  "GirlGeeksToronto",
  "GraphTO",
  "hackshackers",
  "HTML5-Web-App-Developers",
  "metrotorontoug",
  "OpenStackTO",
  "SproutUpTo",
  "Startup-Grind-Toronto",
  "TEDxToronto",
  "Toronto-NET-Developer-Meetup",
  "Toronto-dotNet-Hackers",
  "Toronto-CTO-Group",
  "TorontoHUG",
  "toronto-high-scalability",
  "Toronto-HTML-5-User-Group",
  "torontojs",
  "torontojshackers",
  "Toronto-MongoDB-User-Group",
  "toronto-net-tuesday",
  "torontoruby",
  "Toronto-Selenium-Meetup-Group"
  )

  def getSites = sites

  def getEventsFor(site: String)  = {

    val svc = url(new Url().getEventsUrl(site)) <:< Map("Accept-Charset" -> "utf-8")
    val responses = Http(svc OK as.String)
    for  {
      r <- responses
      apiResponse = Json.parse[EventsResponse](r)
      if apiResponse.results.length > 0
    } yield apiResponse

  }
}