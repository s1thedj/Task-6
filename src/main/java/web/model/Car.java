package web.model;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String model;

    private int year;

    private String color;

    @Override
    public String toString() {
        return "Car: "+ model + "| Year: " + year + "| Color: " + color;
    }
}
