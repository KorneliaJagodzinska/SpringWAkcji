package springwakcji.demo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private Long id;
    private Date createdAt;
    @NotNull
    @Size(min=5, message = "Nazwa musi składać się z minimum 5 znaków.")
    private String name;
    @Size(min=1, message = "Musisz wybrać przynajmniej jeden składnik.")
    private List<String> ingredients;
}
