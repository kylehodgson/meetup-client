//package com.thoughtworks.test
//
//import org.scalatest.{BeforeAndAfter, FunSuite}
//import com.thoughtworks.Service.EmailWriter
//
//class EmailWriterTest extends FunSuite with BeforeAndAfter {
//  var utils: TestUtils = _
//  var target: EmailWriter = _
//
//  before {
//    utils = new TestUtils()
//    utils.deleteMeetupEvents()
//    target = new EmailWriter()
//    utils.deleteMeetupEvents()
//  }
//
//  test("Should write an email") {
//
//    utils.createFutureMeetups()
//
//    val email = target.writeMessage
//
//    assert(email != None)
//    assert(email.contains("Uken"), "Email didnt contains Uken")
//    assert(email.length > 1000, "Email length was only " + email.length)
//  }
//
//  after {
//
//
//  }
//
//
//}
