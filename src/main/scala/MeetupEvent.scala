package com.thoughtworks

class MeetupEvent(val name: String, val url: String, val xml: String) {
	override def toString() = name + " " + url + " " + xml
}