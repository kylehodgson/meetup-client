package com.thoughtworks.test

import org.scalatest.FunSuite
import com.thoughtworks.MeetupApi.Client

class MeetupClientTest extends FunSuite {

  val meetupkey = "91265472064185a5951581b526b175f"
  test("getEvents") {
    val events = new Client().getEventsFor("toronto-coding-dojo")
    assert(events != None)
  }

  test("get sites works") {
    val sites = new Client().getSites
    assert(sites != None)
    assert(sites.length > 1)
    assert(sites.contains("toronto-coding-dojo"))
  }

}