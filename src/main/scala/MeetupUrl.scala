package com.thoughtworks
 
class MeetupUrl {
	def getEventsUrl(meetup: String): String = {
		val url = config("base-url") + "?" + config("events") + "&id=" + config("key") + "&group_urlname=" + meetup
		println("********" + url)
		return url
	}
	private val config = Map(
 		("base-url","http://api.meetup.com/2/"),
 		("key", "91265472064185a5951581b526b175f"),
 		("by-group","group_urlname"),
 		("events","events"))
}