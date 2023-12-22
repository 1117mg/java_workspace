package model.domain;

import java.util.function.Supplier;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import step02.DevType;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Developer implements Supplier<Developer> {
	private String name;
	private int career;
	private DevType devType;
}
