package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Pet;

/**
 * Created by jt on 8/5/18.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
