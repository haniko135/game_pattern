package ru.mirea.ikbo1319.game_pattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.mirea.ikbo1319.game_pattern.entity.Game;
import ru.mirea.ikbo1319.game_pattern.repo.GameRepo;

import java.util.ArrayList;
import java.util.Vector;

@Controller
public class DefaultController {

    @Autowired
    GameRepo gameRepo;

    int id = 0;

    @GetMapping("/")
    public String index(Model model){
        Iterable<Game> games = gameRepo.findAll();
        model.addAttribute("games", games);
        return "index";
    }

    @GetMapping("/onlyImages")
    public String onlyImages(Model model){
        ArrayList<Game> games = gameRepo.findAllByIsUmlIsTrue();
        Game that_game = games.get(id);
        model.addAttribute("that_game", that_game);
        return "onlyImages";
    }

    @PostMapping(value = "/answer_only_images")
    public String answerOnlyImages(Model iA, Boolean that_answer){
        iA.addAttribute("is_answer", that_answer);
        ArrayList<Game> games = gameRepo.findAllByIsUmlIsTrue();
        Game that_game = games.get(id);
        System.out.println(that_answer);
        //Vector<Boolean> answers = new Vector<Boolean>();
        //answers.add(0, false);
        //answers.add(1,that_game.getIsAnswer1Right());
        //answers.add(2,that_game.getIsAnswer2Right());
        //answers.add(3,that_game.getIsAnswer3Right());
        //answers.add(4,that_game.getIsAnswer4Right());
        //Boolean that_answer = answers.get(Math.toIntExact(i));

        //System.out.println(i);
        //System.out.println(that_answer);
        id++;
        return "redirect:/onlyImages";
    }

}
