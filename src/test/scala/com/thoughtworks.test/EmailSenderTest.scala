package com.thoughtworks.test

import org.scalatest.FunSuite
import com.thoughtworks.Service.EmailService

/**
 * User: Thoughtworks
 * Date: 9/27/12
 * Time: 3:21 PM
 */
class EmailSenderTest extends FunSuite{
  var sender: EmailService = _

  test("Calls to EmailSender.Send don't fail") {
    sender = new EmailService()
    sender.SendEmail
  }
}
