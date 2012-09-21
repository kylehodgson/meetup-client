package com.thoughtworks
import java.util.Date
/**
 * User: Thoughtworks
 * Date: 9/20/12
 * Time: 12:13 PM
 */
case class MeetupApiEvent(
                           rsvp_limit: Int,
                           status: String,
                           visibility: String,
                           maybe_rsvp_count: Int,
                           venue: MeetupApiVenue,
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
                           group: MeetupApiGroup,
                           rsvpable: Boolean,
                           rsvp_rules: MeetupApiRsvpRules,

	var eventDate: Date,
	var lastUpdatedDate: Date,
	var createdDate: Date
	)
{
	// def this(mongoObject: MongoDBObject) {
	// 	this(
	// 		mongoObject("event").rsvp_limit,
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event"),
	// 		mongoObject("event")
	// 		)
	// }
	override def toString = name
	def hydrate() {
		lastUpdatedDate = new Date(updated.toLong)
		createdDate = new Date(created.toLong)
		eventDate = new Date(time.toLong)
	}
}
