package com.cong.api.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "rounds")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Round implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date time;

    @Column(name = "choice")
    private String choice;

    @Column(name = "machine")
    private String machine;

    @Column(name = "result")
    private String result;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "gameId", nullable = false)
    @JsonIgnore
    private Game game;

    public Round() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}