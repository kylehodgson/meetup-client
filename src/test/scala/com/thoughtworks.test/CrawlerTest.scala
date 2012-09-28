package com.thoughtworks.test

import org.scalatest.FunSuite
import com.thoughtworks.Service.Crawler

/**
 * User: Thoughtworks
 * Date: 9/27/12
 * Time: 10:30 PM
 */
class CrawlerTest extends FunSuite {

  val target: Crawler = new Crawler

  test("Should run without exceptions") {
    target.Crawl()
  }

}
