package com.github.dhslrl321.app.async.domain

import org.springframework.data.repository.CrudRepository

interface AsyncOperationRepository : CrudRepository<AsyncOperation, String> {

}
