package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by rishi on 15/06/2021
 */
public interface OwnerService {

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
