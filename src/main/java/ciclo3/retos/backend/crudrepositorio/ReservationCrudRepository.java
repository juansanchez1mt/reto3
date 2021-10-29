package ciclo3.retos.backend.crudrepositorio;

import org.springframework.data.repository.CrudRepository;

import ciclo3.retos.backend.entidades.Reservation;

public interface ReservationCrudRepository extends CrudRepository <Reservation,Integer>{
    
}
