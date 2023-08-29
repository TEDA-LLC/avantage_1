package com.example.demo.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PhotoDTO {

    private String name;

    private String originalFilename;

    private String contentType;

    private boolean empty;

    private long size;

    private byte[] bytes;

    private String img;

}
