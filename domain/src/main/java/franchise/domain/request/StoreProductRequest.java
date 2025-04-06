package franchise.domain.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StoreProductRequest {
    private Long storeId;
    private Long productId;
}
