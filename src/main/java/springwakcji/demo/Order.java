package springwakcji.demo;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Order {
    @NotBlank(message = "Wpisz swoje imię")
    private String name;
    @NotBlank(message = "Wpisz ulicę")
    private String street;
    @NotBlank(message = "Wpisz miejscowość")
    private String city;
    @NotBlank(message = "Wpisz województwo")
    private String state;
    @NotBlank(message = "Wpisz kod pocztowy")
    private String zip;
    @CreditCardNumber(message = "Wpisz prawidłowy numer karty")
    private String ccNumber;
    @Pattern( regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message = "Data musi być w formacie MM/RR")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Nieprawidłowy kod CVV")
    private String ccCVV;
}
