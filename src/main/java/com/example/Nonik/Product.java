import jakarta.persistance.Entity;
import jakarta.persistance.Id;
import jakarta.persistance.Table;
import jakarata.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="products")

public class Product {
  @Id
  private int id;

  @Size(max= 65)
  private String name;

  private String description;

  private double price;

  private String img;

  private int stock;

  @CreatedDate
  private LocalDateTime created_at;

  @LastModifiedDate
  private LocalDateTime updated_at;
}
