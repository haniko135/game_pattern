package ru.mirea.ikbo1319.game_pattern.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Game {

    private String urlImage;
    private boolean isUml;
    private boolean isCode;
    private String codeListing;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private boolean isAnswer1Right;
    private boolean isAnswer2Right;
    private boolean isAnswer3Right;
    private boolean isAnswer4Right;
    private Long ID;

    public Game() {
    }

    public void setID(Long id) {
        this.ID = id;
    }

    @Id
    public Long getID() {
        return ID;
    }

}
