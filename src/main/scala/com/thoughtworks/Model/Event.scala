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
  def toHtmlEmail = {
    "<p>"
    "<b>Group name:</b>" + groupName + "\n" +
    "<b>Venue:</b>" + venueName + "\n" +
    "<b>Address:</b>" + venueAddress + "\n" +
    "<b>Date:</b>" + date.toString + "\n" +
    "</p>\n" + description
  }

}
