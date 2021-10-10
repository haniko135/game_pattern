package ru.mirea.ikbo1319.game_pattern.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.ikbo1319.game_pattern.entity.Game;

import java.util.ArrayList;

@Repository
public interface GameRepo extends CrudRepository<Game, Long> {

    ArrayList<Game> findAllByIsUmlIsTrue();

}
