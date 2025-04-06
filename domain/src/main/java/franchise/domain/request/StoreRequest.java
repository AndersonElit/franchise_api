package franchise.domain.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StoreRequest {
    private String name;
    private Long franchiseId;
}
