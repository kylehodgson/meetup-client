package com.thoughtworks.test 
 
import org.scalatest.FunSuite
import com.thoughtworks.MeetupClient
 
class MeetupClientTest extends FunSuite {
	val meetupkey="91265472064185a5951581b526b175f"
	test("getEvents") {
		val events = new MeetupClient().getEvents()
		assert(events.length==7)
  	}
 
  //test("disposition") {
  //  expect("Awesome") { new MeetupClient().disposition }
  //}
}