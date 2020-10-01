package data;

import springwakcji.demo.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findById(String id);
    Ingredient save(Ingredient ingredient);

}
