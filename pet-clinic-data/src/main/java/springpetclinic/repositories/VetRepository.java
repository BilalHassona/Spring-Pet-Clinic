package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Vet;

/**
 * Created by jt on 8/5/18.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
