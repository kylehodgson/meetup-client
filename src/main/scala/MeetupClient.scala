package com.thoughtworks

import com.thoughtworks.MeetupUrl

class MeetupClient {

	def getEventsUrl(): String = {
			val m = new MeetupUrl()
			m.getEventsUrl(sites(1))
		} 

	

	private val sites = List(
	  	"toronto-code-retreat", 
	  	"toronto-coding-dojo", 
	  	"atlanta-scala", 
	  	"CMP-TO", 
	  	"DevOpsTo", 
	  	"first100Hours",
	  	"GraphTO")
  
}