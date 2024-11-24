import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Car {
    private String model, producer, color;
    private int year, quantity;
    private double price;
}
