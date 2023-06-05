package com.digitalPlus.microservicios.app.alumnos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalPlus.microservicios.app.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long>{

}
