package com.vodafone.queryservice.domain

import java.io.Serializable

import javax.persistence.Column

import javax.persistence.Entity

import javax.persistence.Id

import javax.persistence.Table

import scala.beans.{ BeanProperty, BooleanBeanProperty }
import scala.annotation.meta.field
import javax.persistence.GeneratedValue

@SerialVersionUID(4913353181739724604L)
@Entity
@Table(name = "Test")
class Test(
  @(Id @field)@Column(name = "username")@BeanProperty var username:String,
  @Column(name = "password")@BeanProperty var password:          String) {
  def this() = this(null, null)
}
 

