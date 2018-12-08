package com.vodafone.queryservice.model;
import java.util.ArrayList

class ResponseDataBody[T] {

  var data: ArrayList[T] = new ArrayList()

  def getData(): ArrayList[T] = data

  def setData(data: ArrayList[T]): Unit = {
    this.data = data
  }

}
