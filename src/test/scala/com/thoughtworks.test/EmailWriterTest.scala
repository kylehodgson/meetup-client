package com.thoughtworks.test

import org.scalatest.{BeforeAndAfter, FunSuite}
import com.thoughtworks.Service.EmailService

class EmailWriterTest extends FunSuite with BeforeAndAfter {
  var utils: TestUtils = _
  var target: EmailService = _

  before {
    utils = new TestUtils()
    utils.cleanUp()
    target = new EmailService()
  }

  test("Should write an email") {
    Thread.sleep(2000)
    utils.createFutureMeetups()

    val email = target.writeMessage


    assert(email != None)
    assert(email.contains("Uken"), "Email didnt contains Uken. Instead it was " + email.mkString)
    assert(email.length > 1000, "Email length was only " + email.length)
  }


  after {


  }


}
