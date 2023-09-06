package hillel.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Data {
    private String id;
    private String first_name;
    private String email;
    private String last_name;
    private String avatar;
}
