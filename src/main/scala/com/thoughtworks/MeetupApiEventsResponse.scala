package com.thoughtworks

/**
 * User: Thoughtworks
 * Date: 9/20/12
 * Time: 12:11 PM
 */
case class MeetupApiEventsResponse(results: List[MeetupApiEvent],meta: Map[String,String])
{
	override def toString = "MeetupApiEventsResponse containing " + results.length + " events."
}
