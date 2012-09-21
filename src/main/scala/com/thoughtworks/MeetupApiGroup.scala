package com.thoughtworks

/**
 * User: Thoughtworks
 * Date: 9/20/12
 * Time: 12:15 PM
 */
case class MeetupApiGroup(
                           id: Int,
                           group_lat: Float,
                           name: String,
                           group_lon: Float,
                           join_mode: String,
                           urlname: String,
                           who: String)
{
  override def toString = urlname
}