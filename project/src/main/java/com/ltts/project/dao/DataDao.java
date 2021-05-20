package com.ltts.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.project.model.Data;

@Repository
public interface DataDao extends JpaRepository<Data, Integer>
{

}
