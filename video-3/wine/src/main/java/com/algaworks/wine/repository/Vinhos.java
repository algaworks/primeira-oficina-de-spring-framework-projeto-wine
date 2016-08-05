package com.algaworks.wine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.wine.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long> {

}
