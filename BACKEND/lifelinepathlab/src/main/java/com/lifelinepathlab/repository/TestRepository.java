package com.lifelinepathlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lifelinepathlab.model.Test;

@Repository
public interface TestRepository  extends JpaRepository<Test, Integer>{

}
