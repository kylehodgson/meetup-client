package com.thoughtworks.test

import org.scalatest.{BeforeAndAfter, FunSuite}
import com.thoughtworks._
import Repository.EventRepository


class EventRepositoryTest extends FunSuite with BeforeAndAfter{

  var utils: TestUtils = _
  var target: EventRepository = _

  before {
    utils = new TestUtils()
    target = new EventRepository()
    utils.deleteMeetupEvents()
  }

  test("should be able to save an event") {

    val event = utils.getMeetup.toEvent
    target = new EventRepository()
    target.SaveOrUpdate(event)

    assert(utils.countMeetupEvents() == 1,"We saved one event but found " + utils.countMeetupEvents())


  }
  test("should be able to retrieve future events") {
    utils.createFutureMeetups()
    val actual = target.FutureEvents()
    assert(actual.length==2,"Expected FutureEvents to return two events, instead it returned " + actual.length + " of them.")

  }

  after {

  }


}