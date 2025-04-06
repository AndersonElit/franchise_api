package franchise.domain.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StockRequest {
    private Long storeId;
    private Long productId;
    private int stock;
}
