package com.vodafone.queryservice.repo

import org.springframework.data.repository.CrudRepository

import org.springframework.stereotype.Repository

import com.vodafone.queryservice.domain.Test

@Repository
trait TestRepository extends CrudRepository[Test, String]
