package com.cong.api.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "games")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Game implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date timeStart;

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date timeEnd;


    @Column(name = "result")
    private String result;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "userId", nullable = false)
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Round> rounds;

    public Set<Round> getRounds() {
        return rounds;
    }

    public void setRounds(Set<Round> rounds) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game() {
    }

}