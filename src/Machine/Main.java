package Machine;

import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        Character[] overgangsTekens = {'A', 'B'};
        Node[][] overgang = {{s2, s1}, {s1, s2}, {null, s3}, {s3, s0}};
        Node[] nodes = {s0, s1, s2, s3};


        for (int i = 0; i < nodes.length; i++) {
            HashMap<Character, Node> overgangen = new HashMap<>();
            for (int j = 0; j < overgangsTekens.length; j++) {
                overgangen.put(overgangsTekens[j], overgang[i][j]);
            }
            nodes[i].setOvergangNodes(overgangen);
        }
        run(nodes[0]);
    }

    public static void run(Node start) {
        FSM fsm = new FSM("BAAABA", start);
        fsm.goThroughText();
    }
}
