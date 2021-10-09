package ru.mirea.ikbo1319.game_pattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.mirea.ikbo1319.game_pattern.entity.Game;
import ru.mirea.ikbo1319.game_pattern.repo.GameRepo;

@Controller
public class DefaultController {

    @Autowired
    GameRepo gameRepo;

    @GetMapping("/")
    public String index(Model model){
        Iterable<Game> games = gameRepo.findAll();
        model.addAttribute("games", games);
        return "index";
    }

}
