package com.thoughtworks.MeetupApi

/**
 * User: Thoughtworks
 * Date: 9/20/12
 * Time: 12:11 PM
 *
 * This class represents the initial JSON response from a Meetup.com API /events/ request.  It's composed of a list of
 * Events called results and an object called meta that represents the details of the response, including paging data.
 */
case class EventsResponse(results: List[Meetup], meta: Map[String, String]) {
  override def toString = "EventsResponse containing " + results.length + " events."
}
