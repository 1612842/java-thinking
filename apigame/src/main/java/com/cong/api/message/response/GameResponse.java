package com.cong.api.message.response;

import com.cong.api.model.Game;
import com.cong.api.model.Round;

import java.util.Date;
import java.util.List;

public class GameResponse {
    private Long id;
    private Date timeStart;
    private Date timeEnd;
    private String result;
    private List<Round> rounds;

    public GameResponse(Game game, List<Round> rounds) {
        this.id = game.getId();
        this.timeStart=game.getTimeStart();
        this.timeEnd=game.getTimeEnd();
        this.result=game.getResult();
        this.rounds = rounds;
    }


    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
