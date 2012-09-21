package com.thoughtworks.Service

import com.thoughtworks.Repository.EventRepository

class EmailWriter {
  val repo: EventRepository = new EventRepository()

  def writeMessage: String = {

    val paragraphs = for {
      e <- repo.FutureEvents()
      email = e.toEmail
    } yield email

    // THIS IS DEBUGGING
    paragraphs.foreach {
      p=>
        println("=========== finally!! " + p)
    }

    return paragraphs.toList.mkString
  }
}