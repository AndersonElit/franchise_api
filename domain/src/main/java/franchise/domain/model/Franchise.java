package franchise.domain.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Franchise {
    private Long id;
    private String name;
}
