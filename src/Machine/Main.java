package Machine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String [] args) {
        // aantal nodes dat gebruikt zal worden, de rest van het programma past zich hierop aan
        int aantalNodes = 10;

        Random rand = new Random();

        // aantalStappen random bepaald (tussen 2 en aantalNodes * 2)
        int aantalStappen = rand.nextInt(aantalNodes*2)+2;
        run(aantalStappen, makeNodes(aantalNodes));
    }

    public static Node[] makeNodes(Integer aantalNodes) {
        Random rand = new Random();

        // aanmaken van de Nodes
        Node[] nodes = new Node[aantalNodes];
        for (int i = 0; i < aantalNodes; i++) {
            nodes[i] = new Node("s" + i);
        }
        // zetten van overgangen per Node
        for (int node = 0; node < aantalNodes; node++) {
            HashMap<Integer, Node> overgangen = new HashMap<>();
            // aanmaken van random overgangen
            for (int j = 0; j < aantalNodes/2; j++) {
                // 5% kans dat een overgang niet bestaat
                if (rand.nextInt(20) == 0) {
                    overgangen.put(j, null);
                } else {
                overgangen.put(j, nodes[rand.nextInt(aantalNodes)]);
                }
            }
            nodes[node].setOvergangNodes(overgangen);
        }
        return nodes;
    }

    public static void run(Integer aantalStappen, Node[] nodes) {
        FSM fsm = new FSM(aantalStappen, nodes);
        ArrayList<Node> path = fsm.goThroughNodes();
        System.out.println("path: " + path);
    }
}
