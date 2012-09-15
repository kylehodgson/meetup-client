package com.thoughtworks

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
		new MeetupEvent(site,"meetup.com/" + site, "<xml><" +site+ "></" +site+ "></xml>")
	}
  
}