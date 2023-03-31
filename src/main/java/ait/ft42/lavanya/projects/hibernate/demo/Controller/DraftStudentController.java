package ait.ft42.lavanya.projects.hibernate.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ait.ft42.lavanya.projects.hibernate.demo.Entity.DraftHosteller;
import ait.ft42.lavanya.projects.hibernate.demo.Entity.Hosteller;
import ait.ft42.lavanya.projects.hibernate.demo.Service.DraftStudentService;
import ait.ft42.lavanya.projects.hibernate.demo.Service.StudentService;

@RestController
@RequestMapping("drafthostellers")
public class DraftStudentController {
	@Autowired
    private DraftStudentService draftStudentService;
	
	@Autowired
	private StudentService studentService;

    @GetMapping
    public List<DraftHosteller> getAll() {
        return draftStudentService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<DraftHosteller> getById(@PathVariable long id) {
        return draftStudentService.getById(id);
    }

    @PostMapping
    public void save(@RequestBody DraftHosteller drafthosteller) {
        draftStudentService.save(drafthosteller);
    }
    
    @PostMapping("/merge")
    public void merge(@RequestBody long id) {
    	Optional<DraftHosteller> dh = draftStudentService.getById(id);
//    	if(dh == null)
//    	Throw an exception	
    	Hosteller h = new Hosteller();
    	h.setName(dh.get().getName());
    	h.setRoom(dh.get().getRoom());
    	studentService.save(h);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        draftStudentService.delete(id);
    }
}
