package com.thoughtworks.Repository

import com.mongodb.casbah.Imports._
import java.util.Calendar
import com.thoughtworks._
import Model._
import com.novus.salat._
import com.novus.salat.global._

class EventRepository {
  val mongoConn = MongoConnection()
  def getDb = mongoConn

  def SaveOrUpdate(event: Event) {
    val eventColl = mongoConn("meetup_manager")("meetup_events")
    val dbo = grater[Event].asDBObject(event)

    eventColl.save(dbo)
  }

  def FutureEvents() = {

    val eventColl = mongoConn("meetup_manager")("meetup_events")
    for {
      event <- eventColl.find("date" $gte  Calendar.getInstance.getTime)
        future = grater[Event].asObject(event)
    } yield future


  }

}

