package Machine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {
    @Test
    void makeNodes() {
        FSM fsm = new FSM(4, Main.makeNodes(10));

        // check of het aantal Nodes dat aangemaakt zijn gelijk is aan hoeveel er gevraagt worden
        assertEquals(10, fsm.getNodes().length);
        // check of het aantal overgangen voor de eerste node gelijk is aan hoeveel er gevraagt worden
        assertEquals(fsm.getNodes()[0].getOvergangen().size(), fsm.getNodes().length/2);
    }
    @Test
    void getAantalStappen() {
        FSM fsm = new FSM(4, Main.makeNodes(10));
        // check of aantalStappen gelijk is aan hoeveel er gevraagt worden
        assertEquals(4, fsm.getAantalStappen());
    }

    @Test
    void goThroughNodes() {
        FSM fsm = new FSM(6, Main.makeNodes(10));

        // check of het aantal stappen dat gezet wordt niet hoger is aan hoeveel er gevraagt worden
        assertTrue(fsm.goThroughNodes().size() <= 6);
        // check of de Arraylist 'path' niet leeg is
        assertTrue(fsm.goThroughNodes().size() > 0);

    }
}