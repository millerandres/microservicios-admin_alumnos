package com.digitalPlus.microservicios.app.usuarios.servicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.digitalPlus.microservicios.app.usuarios.models.entity.Alumno;
import com.digitalPlus.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.digitalPlus.microservicios.app.usuarios.services.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired 
	private AlumnoRepository alumnoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAll() {
		
		return alumnoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Alumno> findById() {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(null);
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(alumno);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {

		alumnoRepository.deleteById(id);

	}

}
