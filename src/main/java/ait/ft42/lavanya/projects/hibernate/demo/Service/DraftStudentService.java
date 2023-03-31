package ait.ft42.lavanya.projects.hibernate.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ait.ft42.lavanya.projects.hibernate.demo.Entity.DraftHosteller;
import ait.ft42.lavanya.projects.hibernate.demo.Repository.DraftStudentRepository;
@Service
@Transactional
public class DraftStudentService {
	@Autowired
	private DraftStudentRepository draftStudentrepository;

	public List<DraftHosteller> getAll() {
		return draftStudentrepository.findAll();
	}

	public Optional<DraftHosteller> getById(long id) {
		return draftStudentrepository.findById(id);
	}

	public void save(DraftHosteller drafthosteller) {
		draftStudentrepository.save(drafthosteller);
	}

	public void delete(long id) {
		draftStudentrepository.deleteById(id);
	}
}
