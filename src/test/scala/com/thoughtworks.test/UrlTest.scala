package com.thoughtworks.test

import org.scalatest.FunSuite
import com.thoughtworks.MeetupApi.Url

class UrlTest extends FunSuite {

  test("getEventsUrl") {
    expect("http://api.meetup.com/2/events/?key=91265472064185a5951581b526b175f&group_urlname=thoughtworks-site&fields=rsvpable,rsvp_rules") {
      new Url().getEventsUrl("thoughtworks-site")
    }
  }

}