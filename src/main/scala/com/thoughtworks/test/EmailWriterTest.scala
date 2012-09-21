package com.thoughtworks.test

import org.scalatest.FunSuite
import com.thoughtworks.EmailWriter
 
class EmailWriterTest extends FunSuite  {

	test("Should write an email") {
		
		val emailWriter = new EmailWriter()
		val email = emailWriter.writeMessage()
		assert(email != None)
		assert(email=="Hi! Meetups are nice. You should totally go. Meetup.com is a good palce to find them.")
	}
}
