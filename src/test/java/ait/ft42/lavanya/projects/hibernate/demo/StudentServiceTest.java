package ait.ft42.lavanya.projects.hibernate.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ait.ft42.lavanya.projects.hibernate.demo.Entity.Hosteller;
import ait.ft42.lavanya.projects.hibernate.demo.Entity.Room;
import ait.ft42.lavanya.projects.hibernate.demo.Service.RoomService;
import ait.ft42.lavanya.projects.hibernate.demo.Service.StudentService;

@SpringBootTest
public class StudentServiceTest {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private RoomService roomService;
	
	@Test
	public void testSaveStudent() {
        Hosteller hosteller = new Hosteller();
        Room room = new Room();
        room.setMax_limit(1);
        hosteller.setName("kumar");
        hosteller.setRoom(room);
        studentService.save(hosteller);
        assertNotNull(hosteller.getId());
    }
	
	@Test
	public void testGetById() {
		Hosteller hosteller = new Hosteller();
        Room room = new Room();
        room.setMax_limit(1);
        hosteller.setName("lalit");
        hosteller.setRoom(room);
        studentService.save(hosteller);
        Optional<Hosteller> foundHosteller = studentService.getById(hosteller.getId());
        assertEquals(foundHosteller.get().getName(),hosteller.getName());
	}
	
	@Test
	public void testDeleteStudent() {
		Hosteller hosteller = new Hosteller();
        Room room = new Room();
        room.setMax_limit(1);
        hosteller.setName("nithu");
        hosteller.setRoom(room);
        studentService.save(hosteller);
        long id = hosteller.getId();
		studentService.delete(id);
		assertEquals(studentService.getById(id),Optional.empty());
	}
	
	@Test
	public void testGetStudentsByRoom() {
		Hosteller hosteller = new Hosteller();
        Room room = new Room();
        room.setMax_limit(1);
        hosteller.setName("nithu");
        hosteller.setRoom(room);
        studentService.save(hosteller);
        assertNotNull(studentService.getStudents(room.getId()));
	}
}
