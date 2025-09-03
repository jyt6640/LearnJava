package ch15.myQuestion;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    static void main() {
        List<Board> arrayList = new ArrayList<>();
        arrayList.add(new Board("title1", "content1", "writer1"));
        arrayList.add(new Board("title2", "content2", "writer2"));
        arrayList.add(new Board("title3", "content3", "writer3"));
        arrayList.add(new Board("title4", "content4", "writer4"));

        int size = arrayList.size();
        System.out.println(size);

        System.out.println(arrayList.get(2).getTitle());

        for(Board board : arrayList) {
            System.out.println(board.getTitle() + " : " + board.getContent() + " : " + board.getWriter());
        }

    }
}
