package dcmax.repositories;

import dcmax.models.Event;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
//    @Query("SELECT e FROM Event e LEFT JOIN FETCH e.organizer ORDER BY e.lastUpdatedTime DESC")
    @Query("SELECT e FROM Event e ORDER BY e.lastUpdatedTime DESC")
    List<Event> findLatest5Events(Pageable pageable);
}
