package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by rishi on 15/06/2021
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
