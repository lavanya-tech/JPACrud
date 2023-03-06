package ait.ft42.lavanya.projects.hibernate.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ait.ft42.lavanya.projects.hibernate.demo.Entity.Hosteller;
import ait.ft42.lavanya.projects.hibernate.demo.Repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	@Autowired
	private StudentRepository studentrepository;

	public List<Hosteller> getAll() {
		return studentrepository.findAll();
	}

	public Optional<Hosteller> getById(long id) {
		return studentrepository.findById(id);
	}

	public void save(Hosteller hosteller) {
		studentrepository.save(hosteller);
	}

	public void delete(long id) {
		studentrepository.deleteById(id);
	}

}