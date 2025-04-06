package franchise.domain.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    private Long id;
    private String name;
    private Long franchiseId;
}
