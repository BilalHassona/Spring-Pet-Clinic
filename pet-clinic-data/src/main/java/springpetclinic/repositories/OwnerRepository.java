package springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springpetclinic.model.Owner;

import java.util.List;

/**
 * Created by jt on 8/5/18.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
