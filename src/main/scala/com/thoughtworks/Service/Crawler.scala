package com.thoughtworks.Service

import com.thoughtworks.MeetupApi.Client
import com.thoughtworks.Repository.EventRepository

/**
 * User: Thoughtworks
 * Date: 9/27/12
 * Time: 10:27 PM
 */
class Crawler {

  val meetup: Client = new Client
  val repo: EventRepository = new EventRepository

  def Crawl() {

//    for {
//      site <- meetup.getSites
//      response <- meetup.getEventsFor(site)
//      meetup <- response.results
//      repo.SaveOrUpdate(meetup.toEvent)
//    } yield true

    meetup.getSites.foreach(
    site =>
      meetup.getEventsFor(site).foreach(
      response=>
        response.results.foreach(
        meetup =>
          repo.SaveOrUpdate(meetup.toEvent)
        )
      )
    )

  }

}
