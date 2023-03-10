package ait.ft42.lavanya.projects.hibernate.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ait.ft42.lavanya.projects.hibernate.demo.Entity.Hosteller;
import ait.ft42.lavanya.projects.hibernate.demo.Entity.Room;
import ait.ft42.lavanya.projects.hibernate.demo.Repository.RoomRepository;
@Service
@Transactional
public class RoomService {
	@Autowired
	private RoomRepository roomrepository;
	public List<Room> getAll() {
		return roomrepository.findAll();
	}

	public Optional<Room> getById(long id) {
		return roomrepository.findById(id);
	}

	public void save(Room room) {
		roomrepository.save(room);
	}

	public void delete(long id) {
		roomrepository.deleteById(id);
	}
}
