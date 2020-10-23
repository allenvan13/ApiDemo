package com.example.DAO;

import com.example.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;


@Component
public interface PersonRepository extends JpaRepository<Person,Long> {

}
