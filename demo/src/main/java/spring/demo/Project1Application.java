package spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.demo.data.entity.Room;
import spring.demo.data.repo.RoomRepo;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}
	@RestController
	@RequestMapping("/rooms")
	public class RoomController{
		@Autowired
		private RoomRepo roomRepo;
		@GetMapping
		public Iterable<Room> getRooms() {
			return this.roomRepo.findAll();
		}

	}

}
