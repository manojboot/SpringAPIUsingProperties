package com.example.demo.common;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.common.api.DateRange;
import com.example.demo.common.api.GenericLookUp;

public interface CommonRepository extends JpaRepository<GenericLookUp, String>{

}
