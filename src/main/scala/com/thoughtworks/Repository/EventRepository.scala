package com.thoughtworks.Repository

import com.mongodb.casbah.Imports._
import java.util.Calendar
import com.thoughtworks._
import Model._
import com.novus.salat._
import com.novus.salat.global._

class EventRepository {

  val mongoConn = MongoConnection(connString)
  def getDb = mongoConn
  val eventColl = mongoConn("meetup_manager")("meetup_events")

  def SaveOrUpdate(event: Event) {
    val dbo = grater[Event].asDBObject(event)
    eventColl.save(dbo)
  }

  def FutureEvents() = {
    for {
      event <- eventColl.find("date" $gte  Calendar.getInstance.getTime)
        future = grater[Event].asObject(event)
    } yield future
  }

  def connString = {
    if ( System.getenv("COMMUNITY_EMAILER_MONGO_CONNECTION") == None ) ""
    else  System.getenv("COMMUNITY_EMAILER_MONGO_CONNECTION")
  }

}

