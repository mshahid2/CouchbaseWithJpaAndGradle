package com.xav;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
@N1qlPrimaryIndexed
@ViewIndexed(designDoc="Student",viewName="all")
public interface StudentRepository extends CouchbaseRepository<Student, Integer>{

}
