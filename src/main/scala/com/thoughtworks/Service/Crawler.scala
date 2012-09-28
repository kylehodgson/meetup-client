package com.thoughtworks.Service

import com.thoughtworks.MeetupApi.Client

/**
 * User: Thoughtworks
 * Date: 9/27/12
 * Time: 10:27 PM
 */
class Crawler {

  val meetup: Client = new Client

  def Crawl() {
    meetup.getSites.foreach(
    site => (
      meetup.getEventsFor(site)
      )
    )
  }

}
