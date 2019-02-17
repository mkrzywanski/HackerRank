import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private Deque<Character> deque = new LinkedList<>();
    private Queue<Character> queue = new LinkedList<>();

    void pushCharacter(char ch) {
        deque.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    char popCharacter() {
        return deque.pop();
    }

    char dequeueCharacter() {
        return queue.remove();
    }

}

public class Day18QueuesAndStacks {
}
