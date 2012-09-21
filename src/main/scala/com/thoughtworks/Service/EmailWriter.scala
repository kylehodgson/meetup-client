package com.thoughtworks.Service

import com.thoughtworks.Repository.EventRepository

class EmailWriter {
  val repo: EventRepository = new EventRepository()

  def writeMessage = {

    val paragraphs = for {
      e <- repo.FutureEvents()
      email = e.toEmail
    } yield email

    paragraphs.mkString
  }
}