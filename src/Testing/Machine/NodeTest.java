package Machine;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void getNextNode() {
        Node t0 = new Node("t0");
        Node t1 = new Node("t1");

        HashMap<Character, Node> overgang1 = new HashMap<>();
        overgang1.put('A', t0);
        overgang1.put('B', t1);
        t0.setOvergangNodes(overgang1);

        assertEquals(t0, t0.getOvergangen().get('A'));
        assertEquals(t1, t0.getOvergangen().get('B'));
    }
}