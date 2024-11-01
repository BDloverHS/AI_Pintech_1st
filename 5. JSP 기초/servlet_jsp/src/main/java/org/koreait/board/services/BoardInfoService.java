package org.koreait.board.services;

import org.koreait.board.entities.Board;

import java.util.ArrayList;
import java.util.List;

public class BoardInfoService {
    public List<Board> getList() {
        ArrayList<Board> items = new ArrayList<>();
        for (int i = 0; i < 10L; i++) {
            Board item = new Board();
            item.setSeq(i+1);
            item.setPoster("작성자" + i+1);
            item.setSubject(i+1 + "번째 제목");
            item.setContent(i+1 + "번째 내용");
            items.add(item);
        }
        return items;
    }
}
