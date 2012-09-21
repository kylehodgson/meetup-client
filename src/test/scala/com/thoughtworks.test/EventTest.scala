package com.thoughtworks.test

import org.scalatest.{BeforeAndAfter, FunSuite}
import com.thoughtworks.Model.Event

/**
 * User: Thoughtworks
 * Date: 9/21/12
 * Time: 5:23 PM
 */
class EventTest extends FunSuite with BeforeAndAfter {

  var target: Event = _

  before {
    target = new TestUtils().getMeetup.toEvent

  }
  test("Should be able to generate its email") {
    val actual = target.toEmail
    assert(actual.contains("Uken"), "Event.toEmail didn't contain Uken (which should be present!)")
    assert(actual.length>2300, "Email.length should have been more than 2300 characters but was " + actual.length)
  }

}
