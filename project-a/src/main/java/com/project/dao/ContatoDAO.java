package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.model.Contato;

@Repository
@Transactional
public interface ContatoDAO extends JpaRepository<Contato, Integer>{

}
