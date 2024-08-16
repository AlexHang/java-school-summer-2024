package org.example;
import lombok.*;

import java.beans.Transient;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@RequiredArgsConstructor
public class DemoExampleLombok {
    private int field1;
    private String field2;
    @NonNull
    private String field3;

}
