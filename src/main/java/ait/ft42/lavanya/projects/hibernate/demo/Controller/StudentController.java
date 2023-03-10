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

import ait.ft42.lavanya.projects.hibernate.demo.Entity.Hosteller;
import ait.ft42.lavanya.projects.hibernate.demo.Service.StudentService;

@RestController
@RequestMapping("hostellers")
public class StudentController {
	    @Autowired
	    private StudentService studentService;

	    @GetMapping
	    public List<Hosteller> getAll() {
	    	System.out.println("request recieved");
	        return studentService.getAll();
	    }

	    @GetMapping("/{id}")
	    public Optional<Hosteller> getById(@PathVariable long id) {
	        return studentService.getById(id);
	    }
	    
	    @GetMapping("/room/{room_id}")
	    public List<Hosteller> getStudents(@PathVariable long room_id){
	    	return studentService.getStudents(room_id);
	    }

	    @PostMapping
	    public void save(@RequestBody Hosteller hosteller) {
	        studentService.save(hosteller);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable long id) {
	        studentService.delete(id);
	    }
	}