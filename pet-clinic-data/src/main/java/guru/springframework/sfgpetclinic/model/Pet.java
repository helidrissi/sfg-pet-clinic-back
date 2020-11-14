package guru.springframework.sfgpetclinic.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data@AllArgsConstructor@NoArgsConstructor
public class Pet extends BaseEntity {

    private PetType pettype;
    private Owner owner;
    private LocalDate birthDate;
}
