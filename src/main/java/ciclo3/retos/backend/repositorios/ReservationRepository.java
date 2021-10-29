package ciclo3.retos.backend.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ciclo3.retos.backend.crudrepositorio.ReservationCrudRepository;
import ciclo3.retos.backend.entidades.Reservation;


@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll(){return(List<Reservation>) reservationCrudRepository.findAll();}

    public Optional<Reservation> getReservation(int id){
        return  reservationCrudRepository.findById(id);
    } 

    public Reservation save(Reservation reservation){

        return reservationCrudRepository.save(reservation);
    } 

    public void delete (Reservation reservation){ reservationCrudRepository.delete(reservation);}
}
