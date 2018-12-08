package com.vodafone.queryservice

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

import com.vodafone.queryservice.repo.TestRepository

@EnableAutoConfiguration
class QueryServiceApplication extends CommandLineRunner {

  @Autowired
  private var testRepo: TestRepository = _

  override def run(args: String*): Unit = {
    // TODO Auto-generated method stub
    println(testRepo.count())
  }

}

object TestApplication extends App {
  SpringApplication.run(classOf[QueryServiceApplication]);
}