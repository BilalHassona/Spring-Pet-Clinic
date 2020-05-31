package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Speciality;

/**
 * Created by jt on 8/5/18.
 */
public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
