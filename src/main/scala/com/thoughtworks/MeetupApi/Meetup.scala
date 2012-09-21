package com.thoughtworks.MeetupApi

import com.thoughtworks.Model.Event
import java.util.Date


/**
 * User: Thoughtworks
 * Date: 9/20/12
 * Time: 12:13 PM
 */
case class Meetup(
                           rsvp_limit: Int,
                           status: String,
                           visibility: String,
                           maybe_rsvp_count: Int,
                           venue: Venue,
                           id: String,
                           utc_offset: Int,
                           duration: Int,
                           time: Int,
                           waitlist_count: Int,
                           updated: Int,
                           created: Int,
                           yes_rsvp_count: Int,
                           event_url: String,
                           description: String,
                           name: String,
                           group: Group,
                           rsvpable: Boolean,
                           rsvp_rules: RsvpRules) {

  override def toString = name

  def toEvent = new Event(
    "meetup.com",
    group.name,
    venue.name,
    venue.address_1,
    new Date(time),
    event_url,
    description
  )
}
