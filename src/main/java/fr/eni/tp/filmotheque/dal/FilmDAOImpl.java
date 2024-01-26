package fr.eni.tp.filmotheque.dal;

import fr.eni.tp.filmotheque.bo.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmDAOImpl implements FilmDAO{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public FilmDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Film film) {

    }

    @Override
    public Film read(long id) {
        String sql = "SELECT * FROM [FILM] where id = ?";
        return jdbcTemplate.queryForObject(sql,new FilmRowMapper(), id);
    }

    @Override
    public List<Film> findAll() {
        return null;
    }

    @Override
    public String findTitre(long id) {
        return null;
    }
}
