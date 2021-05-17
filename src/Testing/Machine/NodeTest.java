package Machine;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void getNextNode() {
        Node t0 = new Node("t0");
        Node t1 = new Node("t1");

        HashMap<Integer, Node> overgang1 = new HashMap<>();
        overgang1.put(0, t0);
        overgang1.put(1, t1);
        t0.setOvergangNodes(overgang1);

        // check of de overgangen goed aangemaakt zijn
        assertEquals(t0, t0.getNextNode(0));
        assertEquals(t1, t0.getNextNode(1));
    }
}