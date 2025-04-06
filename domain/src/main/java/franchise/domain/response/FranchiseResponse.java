package franchise.domain.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FranchiseResponse {
    private Long id;
    private String name;
}
