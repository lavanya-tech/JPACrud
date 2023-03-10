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
import ait.ft42.lavanya.projects.hibernate.demo.Entity.Room;
import ait.ft42.lavanya.projects.hibernate.demo.Service.RoomService;


@RestController
@RequestMapping("/rooms")
public class RoomController {
	@Autowired
    private RoomService roomService;

    @GetMapping
    public List<Room> getAll() {
        return roomService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Room> getById(@PathVariable long id) {
        return roomService.getById(id);
    }
       
    @PostMapping
    public void save(@RequestBody Room room) {
        roomService.save(room);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        roomService.delete(id);
    }
}
