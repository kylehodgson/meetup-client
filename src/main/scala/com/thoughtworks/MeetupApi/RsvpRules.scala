package com.thoughtworks.MeetupApi

/**
 * User: Thoughtworks
 * Date: 9/20/12
 * Time: 12:16 PM
 */

case class RsvpRules(
                               closed: Int,
                               guest_limit: Int,
                               waitlisting: String) {
  def toMap: Map[String, Any] = {
    Map(
      "closed" -> closed,
      "guest_limit" -> guest_limit,
      "waitlisting" -> waitlisting
    )
  }
}
