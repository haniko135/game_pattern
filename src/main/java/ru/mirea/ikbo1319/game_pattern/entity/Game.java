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
    private Boolean isUml;
    private Boolean isCode;
    private String codeListing;
    private String question;
    private String answer1;
    private Boolean isAnswer1Right;
    private String answer2;
    private Boolean isAnswer2Right;
    private String answer3;
    private Boolean isAnswer3Right;
    private String answer4;
    private Boolean isAnswer4Right;
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
