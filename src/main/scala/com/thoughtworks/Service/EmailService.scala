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
    val properties = System.getProperties
    val smtpUserName: String = System.getenv("COMMUNITY_EMAILER_GMAIL_USERNAME")
    val smtpPassword: String = System.getenv("COMMUNITY_EMAILER_GMAIL_PASSWORD")
    val recipient: String = "khodgson@thoughtworks.com"
    val smtpServer: String = "smtp.gmail.com"
    val tcpPort: Int = 465

    val body: String = writeMessage
    val session = Session.getDefaultInstance(properties)
    val message = new MimeMessage(session)

    message.setFrom(new InternetAddress(smtpUserName))
    message.setRecipients(Message.RecipientType.TO, recipient)
    message.setSubject("Toronto Community Events")
    message.setContent(body, "text/html" )

    val transport = session.getTransport("smtps")

    transport.connect(smtpServer, tcpPort, smtpUserName, smtpPassword)
    val addresses = List[Address](new InternetAddress (recipient))
    transport.sendMessage(message, addresses.toArray)
  }
}