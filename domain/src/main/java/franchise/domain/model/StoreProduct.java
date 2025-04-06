package franchise.domain.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StoreProduct {
    private Long storeId;
    private Long productId;
    private int stock;
}
