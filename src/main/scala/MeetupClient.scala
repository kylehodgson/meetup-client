package com.thoughtworks

import dispatch._

class MeetupClient {

	val sites = List(
	  	"toronto-code-retreat", 
	  	"toronto-coding-dojo", 
	  	"atlanta-scala", 
	  	"CMP-TO", 
	  	"DevOpsTo", 
	  	"first100Hours",
	  	"GraphTO")

	def getEvents(): List[MeetupEvent] = {
		var events = List[MeetupEvent]()
		sites.foreach {
			site =>
				events = getEventFor(site) :: events
		}
		return events
	}
	
	private def getEventFor(site: String): MeetupEvent = {
		val meetupUrl = new MeetupUrl().getEventsUrl(site)
		println("***** MEETUPURL ***** " + meetupUrl)
		val svc = url(meetupUrl)
		val responses = Http(svc OK as.String)
		for ( r <- responses)
			println("***** RESPONSE ***** " + r)
		new MeetupEvent(site,"meetup.com/" + site, "<xml><" +site+ "></" +site+ "></xml>")
	}
  
}