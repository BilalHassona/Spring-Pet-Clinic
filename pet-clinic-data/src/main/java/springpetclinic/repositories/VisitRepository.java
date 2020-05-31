package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Visit;

/**
 * Created by jt on 8/5/18.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
