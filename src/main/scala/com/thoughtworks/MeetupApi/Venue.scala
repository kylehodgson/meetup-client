package com.thoughtworks.MeetupApi

/**
 * User: Thoughtworks
 * Date: 9/20/12
 * Time: 12:16 PM
 */
case class Venue(
                           id: Int,
                           lon: Float,
                           name: String,
                           state: String,
                           address_1: String,
                           lat: Float,
                           country: String,
                           city: String) {
  override def toString = name + " (" + address_1 + ")"
}
