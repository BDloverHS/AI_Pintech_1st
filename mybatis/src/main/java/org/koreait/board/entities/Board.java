package org.koreait.board.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {
    private long seq;
    private String poster;
    private String string;
    private String subject;
    private String content;
    private LocalDateTime created_at;
}
