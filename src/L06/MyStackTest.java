package L06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    MyStack s = new MyStack();

    @Test
    void push() {
        s.push(1);
        s.push(1);
        s.push(1);
        while (s.empty()){
            assertEquals(s.pop(),1);
        }
    }

    @org.junit.jupiter.api.Test
    void pop() {
    }

    @org.junit.jupiter.api.Test
    void peek() {
    }

    @org.junit.jupiter.api.Test
    void empty() {
    }

    @org.junit.jupiter.api.Test
    void search() {
    }
}