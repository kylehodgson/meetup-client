package com.thoughtworks.test

import org.scalatest.{BeforeAndAfter, FunSuite}
import com.thoughtworks.MeetupApi.{EventsResponse, Client}

class ClientTest extends FunSuite with BeforeAndAfter {

  val meetupkey = "91265472064185a5951581b526b175f"
  var target: Client= _
  before {
    target = new Client
  }
  test("getEvents") {
    var got_response = false
    val promise = target.getEventsFor("Toronto-CTO-Group")
    Thread.sleep(20000)
    assert(promise != None)
    val event = promise()
    got_response = true
    assert(event != None)
    assert(event.results.length > 0)
    assert(got_response, "Never received a response for grou Toronto-CTO-Group")
  }

  test("get sites works") {
    val sites = new Client().getSites
    assert(sites != None)
    assert(sites.length > 1)
    assert(sites.contains("toronto-coding-dojo"))
  }

}