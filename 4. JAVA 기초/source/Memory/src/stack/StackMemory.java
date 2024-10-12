package stack;

public class StackMemory {
    int id; // 학번
    String name; // 이름
    String major; // 전공

    void study() {
        System.out.printf("%s 학생의 학번은 %d이고 %s를 공부한다.", name, id, major);
    }
}
