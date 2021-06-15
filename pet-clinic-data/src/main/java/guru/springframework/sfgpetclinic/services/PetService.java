package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by rishi on 15/06/2021
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
