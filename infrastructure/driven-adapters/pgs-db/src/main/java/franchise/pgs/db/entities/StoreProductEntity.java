package franchise.pgs.db.entities;

import lombok.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("store_product")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StoreProductEntity {
    @Column("store_id")
    private Long storeId;
    @Column("product_id")
    private Long productId;
    @Column("stock")
    private int stock;
}
