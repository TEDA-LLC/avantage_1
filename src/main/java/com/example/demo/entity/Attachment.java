package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

/**
 * @author Mansurov Abdusamad
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    private Timestamp timestamp;
    @Column(nullable = false)
    @JsonIgnore
    private byte[] bytes;
    @Column(nullable = false)
    private String originalName, contentType;
    private Long size;

    @Column(length = 6541100)
    private String img;
}
