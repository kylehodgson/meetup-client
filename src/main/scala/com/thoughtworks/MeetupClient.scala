package com.thoughtworks

import dispatch._
import com.codahale.jerkson.Json

class MeetupClient {

	private val sites = List(
	  	"toronto-code-retreat", 
	  	"toronto-coding-dojo")

	def getSites() = sites
	
	def getEventsFor(site: String): List[MeetupApiEvent] = {
		var events = List[MeetupApiEvent]()
		val svc = url(new MeetupUrl().getEventsUrl(site))
		val responses = Http(svc OK as.String)
		for ( r <- responses) {
			val apiResponse = Json.parse[MeetupApiEventsResponse](r)
			if (apiResponse.results.length>0) {
				val event = Json.parse[MeetupApiEventsResponse](r).results(0)
				events = event :: events
			}
				
		}
		return events
	}
  
}