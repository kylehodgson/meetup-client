package com.thoughtworks

import com.mongodb.casbah.Imports._
import java.util.Date


class MeetupRepository
{
	val mongoConn = MongoConnection()
	val eventColl = mongoConn("meetup_manager")("meetup_events")

	def SaveOrUpdate(event: MeetupApiEvent)
	{
		event.hydrate

		
		val builder = MongoDBObject.newBuilder
		builder += "event" -> event
		builder += "venue" -> event.venue
		builder += "group" -> event.group

		eventColl += builder.result

	}

	def FutureEvents() = 
	{
		var output = List(MeetupApiEvent)
		for ( event <- eventColl.find("event.time" $gt new Date) ) {
			println("======= FutureEvents event: " + event)
			//output = new MeetupApiEvent(event) :: output
		}
		output
	}

}

