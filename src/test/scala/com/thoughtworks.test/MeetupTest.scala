package com.thoughtworks.test

import org.scalatest.FunSuite
import java.util.Date

class MeetupTest extends FunSuite {

  test("should be able to create a meetup from JSON") {
    val event = new TestUtils().getMeetup
    assert(event.toString == "NewRelic and Uken Games", "Test object failed to parse succesfully. Failed in parse case class MeetupApiEvent.toString. Should have received 'NewRelic and Uken Games', received instead " + event.toString)
    assert(event.rsvp_limit == 70, "Failed to parse MeetupApiEvent from JSON. rsvp_limit should be 70, was " + event.rsvp_limit)
    assert(event.status == "upcoming")
    assert(event.visibility == "public")
    assert(event.maybe_rsvp_count == 0)
    assert(event.id == "82213942")
    assert(event.utc_offset == -14400000)
    assert(event.venue.id == 9239932)
    assert(event.venue.name == "Uken Games Test", "Failed to parse MeetupApiEvent and corresponding MeetupApiVenue from JSON. event.venue.name should be 'Uken Games', was instead " + event.venue.name)
    assert(event.group.name == "DevOps Toronto", "Failed to parse MeetupApiEvent and corresponding MeetupApiGroup from JSON. event.group.name should be 'DevOps Toronto', was instead " + event.group.name)

  }

  test("should be able to convert meetup to event") {
    val meetup = new TestUtils().getMeetup
    val event = meetup.toEvent
    assert(event.description==meetup.description,"Event description incorrect")
    assert(event.eventType=="meetup.com","Event type incorrect")
    assert(event.url==meetup.event_url,"Event url incorrect")
    assert(event.groupName==meetup.group.name, "Event group name incorrect")
    assert(event.venueAddress==meetup.venue.address_1, "Event venue address incorrect")
    assert(event.venueName==meetup.venue.name, "Event venue name incorrect")
    assert(event.date==new Date(meetup.time), "Event venue name incorrect")
  }
}