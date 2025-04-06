package franchise.pgs.db.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("store")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StoreEntity {
    @Id
    @Column("id")
    private Long id;
    @Column("name")
    private String name;
    @Column("franchise_id")
    private Long franchiseId;
}
