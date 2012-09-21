package com.thoughtworks

class MeetupUrl {
	def getEventsUrl(meetup: String): String = {
		var fields = ""
		fieldList.foreach {
			field =>
				if ( fields != "") 
					fields += ","
				fields += field
		}
		config("base-url") + config("events") + "/?key=" + config("key") + "&group_urlname=" + meetup + "&fields=" + fields
	}
	private val config = Map(
 		("base-url","http://api.meetup.com/2/"),
 		("key", "91265472064185a5951581b526b175f"),
 		("by-group","group_urlname"),
 		("events","events"))
	private val fieldList = List[String]("rsvpable","rsvp_rules")
}