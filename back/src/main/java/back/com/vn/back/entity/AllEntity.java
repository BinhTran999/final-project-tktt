package back.com.vn.back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class AllEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "uuid")
    protected UUID id;
}
