package com.thoughtworks.test
 
import org.scalatest.FunSuite
import com.thoughtworks.MeetupUrl
 
class MeetupUrlTest extends FunSuite {
 
  test("getEventsUrl") {
    expect("http://api.meetup.com/2/?events&id=91265472064185a5951581b526b175f&group_urlname=test-site") 
    	{ new MeetupUrl().getEventsUrl("test-site") }
  }
 
}