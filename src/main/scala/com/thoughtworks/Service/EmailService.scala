package com.thoughtworks.Service

import com.thoughtworks.Repository.EventRepository
import javax.mail._
import javax.mail.internet._
import java.util.Properties._

class EmailService {
  val repo: EventRepository = new EventRepository()

  def writeMessage = {

    val paragraphs = for {
      e <- repo.FutureEvents()
      email = e.toHtmlEmail
    } yield email

    paragraphs.mkString
  }

  def SendEmail{


  }
}