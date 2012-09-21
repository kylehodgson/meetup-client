package com.thoughtworks.Model

import java.util.Date

/**
 * User: Thoughtworks
 * Date: 9/20/12
 * Time: 3:22 PM
 */
case class Event(
                  eventType: String,
                  groupName: String,
                  venueName: String,
                  venueAddress: String,
                  date: Date,
                  url: String,
                  description: String) {
  def toEmail = {
    "Event group name: " + groupName + "\n" +
    "Venue: " + venueName + "\n" +
    "Address: " + venueAddress + "\n" +
    "Date: " + date.toString + "\n" +
    "\n" + description
  }

}
