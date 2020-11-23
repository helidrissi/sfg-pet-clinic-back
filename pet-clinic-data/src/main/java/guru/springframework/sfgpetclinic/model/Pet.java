package guru.springframework.sfgpetclinic.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Data@AllArgsConstructor@NoArgsConstructor
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType type;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "birthdate")
    private LocalDate birthDate;
}
