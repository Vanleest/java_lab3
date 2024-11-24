import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "producer")
public class Car {
    private String model;
    private String producer;
    private String color;
    private int year, quantity;
    private double price;
}
