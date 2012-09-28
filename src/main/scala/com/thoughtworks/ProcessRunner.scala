package com.thoughtworks

import Service.{Crawler, EmailService}

/**
 * User: Thoughtworks
 * Date: 9/27/12
 * Time: 10:20 PM
 */
object ProcessRunner {

  def main(args: Array[String]) {
    new Crawler().Crawl()
  }

}
