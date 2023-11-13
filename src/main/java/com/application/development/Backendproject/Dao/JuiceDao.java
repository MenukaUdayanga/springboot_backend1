package com.application.development.Backendproject.Dao;

import com.application.development.Backendproject.model.Juice;
import com.application.development.Backendproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuiceDao extends JpaRepository<Juice,Integer> {

    Juice findByNumber(Integer number);

}
