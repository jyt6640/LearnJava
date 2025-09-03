package ch15.Q7;

import java.util.List;

public class ListExample {
    static void main() {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();
        for (Board board : list) {
            System.out.println(board.getTitle() + " : " + board.getContent());
        }
     }
}
