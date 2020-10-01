package data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import springwakcji.demo.Ingredient;

@Repository
public class JdbcIngredientRepository implements IngredientRepository {
    private JdbcTemplate jdbc;

    public JdbcIngredientRepository(JdbcTemplate jdbc) {
        this.jdbc=jdbc;
    }

    @Override
    public Iterable<Ingredient> findAll() {
        return null;
    }

    @Override
    public Ingredient findById(String id) {
        return null;
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        return null;
    }
}
