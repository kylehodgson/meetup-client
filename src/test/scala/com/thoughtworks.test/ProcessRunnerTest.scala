package com.thoughtworks.test

import org.scalatest.FunSuite
import com.thoughtworks.ProcessRunner

/**
 * User: Thoughtworks
 * Date: 9/27/12
 * Time: 10:51 PM
 */
class ProcessRunnerTest extends FunSuite{

  val pRunner: ProcessRunner = new ProcessRunner

  test("Should run without exceptions") {
    pRunner.main( List("emailer").toArray)
  }

}
