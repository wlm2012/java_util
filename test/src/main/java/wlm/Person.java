package wlm;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public class Person {

	@Getter
    private String name;
    @Getter
    private int old;

}