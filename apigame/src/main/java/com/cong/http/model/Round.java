package com.cong.http.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rounds")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Getter
@Setter
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

    public Round(Date time, String choice, String machine, String result) {
        this.time = time;
        this.choice = choice;
        this.machine = machine;
        this.result = result;
    }

    public Round(Long id, Date time, String choice, String machine, String result, Game game) {
        this.id = id;
        this.time = time;
        this.choice = choice;
        this.machine = machine;
        this.result = result;
        this.game = game;
    }

}