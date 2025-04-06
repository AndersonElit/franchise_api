package franchise.pgs.db.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("franchise")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FranchiseEntity {
    @Id
    @Column("id")
    private Long id;
    @Column("name")
    private String name;
}
