package com.thoughtworks

import Service.{Crawler, EmailService}

/**
 * User: Thoughtworks
 * Date: 9/27/12
 * Time: 10:20 PM
 */
class ProcessRunner {

  def main(args: Array[String]) {
    new Crawler().Crawl()
    Thread.sleep(10000)
    new EmailService().SendEmail
  }

}
