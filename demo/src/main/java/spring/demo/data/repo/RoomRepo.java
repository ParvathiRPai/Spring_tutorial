package spring.demo.data.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.demo.data.entity.Room;

@Repository
public interface RoomRepo extends CrudRepository<Room, Long> {
}
