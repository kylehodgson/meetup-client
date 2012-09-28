package com.thoughtworks

import Service.{Crawler, EmailService}

/**
 * User: Thoughtworks
 * Date: 9/27/12
 * Time: 10:20 PM
 */
class ProcessRunner {

  def main(args: Array[String]) {
    args(0) match {
      case "emailer" => new EmailService().SendEmail
      case "crawler" => new Crawler().Crawl
    }
  }

}
