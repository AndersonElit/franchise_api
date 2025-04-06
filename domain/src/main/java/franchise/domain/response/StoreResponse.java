package franchise.domain.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StoreResponse {
    private Long id;
    private String name;
    private Long franchiseId;
}
