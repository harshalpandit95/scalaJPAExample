package com.vodafone.queryservice.model

import scala.beans.{ BeanProperty, BooleanBeanProperty }

class TestModel(
  @BeanProperty var username: String,
  @BeanProperty var password: String)
