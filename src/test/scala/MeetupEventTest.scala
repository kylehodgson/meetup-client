package com.thoughtworks.test
 
import org.scalatest.FunSuite
import com.thoughtworks.MeetupEvent


class MeetupEventTest extends FunSuite {
 
  test("test events") {
    expect("toronto coding dojo http://www.meetup.com/toronto-coding-dojo <xml></xml>") 
    	{ new MeetupEvent("toronto coding dojo",
    		"http://www.meetup.com/toronto-coding-dojo",
    		"<xml></xml>").toString }
  }
 
}