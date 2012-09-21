package com.thoughtworks.test

import org.scalatest.FunSuite
import com.thoughtworks.MeetupUrl
 
class MeetupUrlTest extends FunSuite {
 
  test("getEventsUrl") {
    expect("http://api.meetup.com/2/events/?key=91265472064185a5951581b526b175f&group_urlname=test-site&fields=rsvpable,rsvp_rules") 
    	{ new MeetupUrl().getEventsUrl("test-site") }
  }
 
}