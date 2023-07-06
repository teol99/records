package com.example.records.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "record", schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

    @Column(name = "timestamp")
    @Getter
    @Setter
    private Timestamp timestamp;

    @Column (name = "value")
    @Getter
    @Setter
    private int value;
}
