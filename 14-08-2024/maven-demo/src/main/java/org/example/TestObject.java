package org.example;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class TestObject {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
}
