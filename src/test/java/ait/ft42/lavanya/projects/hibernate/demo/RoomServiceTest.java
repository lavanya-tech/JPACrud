package ait.ft42.lavanya.projects.hibernate.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ait.ft42.lavanya.projects.hibernate.demo.Entity.Room;
import ait.ft42.lavanya.projects.hibernate.demo.Service.RoomService;

@SpringBootTest
public class RoomServiceTest {

	@Autowired
	private RoomService roomService;
	
	@Test
	public void testSaveRoom() {
        Room room = new Room();
        room.setMax_limit(1);
        roomService.save(room);
        assertNotNull(room.getId());
    }
	
	@Test
	public void testGetById() {
		Room room = new Room();
        room.setMax_limit(2);
        roomService.save(room);
        Optional<Room> foundRoom = roomService.getById(room.getId());
        assertEquals(foundRoom.get().getMax_limit(),room.getMax_limit());
	}
	
	@Test
	public void testDeleteRoom() {
		Room room = new Room();
        room.setMax_limit(11);
        roomService.save(room);
        long id = room.getId();
		roomService.delete(room.getId());
		assertEquals(roomService.getById(id),Optional.empty());
	}
}
