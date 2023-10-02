package com.jonatan777.maruin.fc.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonatan777.maruin.fc.model.Image;


public interface ImageRepository extends JpaRepository<Image, Long> {
	Optional<Image> findByName(String name);
}


