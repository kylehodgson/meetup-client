package com.thoughtworks.test 
 
import org.scalatest.FunSuite
import com.thoughtworks.MeetupClient
 
class MeetupClientTest extends FunSuite {
 
  test("getEventsUrl") {
    expect("http://api.meetup.com/2/?events&id=91265472064185a5951581b526b175f&group_urlname=toronto-coding-dojo") { new MeetupClient().getEventsUrl() }
  }
 
  //test("disposition") {
  //  expect("Awesome") { new MeetupClient().disposition }
  //}
}