package ku.cs.restaurant.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


import java.util.UUID;

// ทิเบต เจริญศรีไพบูลย์ 6510450399
// tibet charoensripaiboon 6510450399
@Data
@Entity
public class Restaurant {


    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private double rating;
    private String location;
}
