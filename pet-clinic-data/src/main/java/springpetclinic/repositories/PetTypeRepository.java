package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.PetType;

/**
 * Created by jt on 8/5/18.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
