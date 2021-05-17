package Machine;

import java.util.HashMap;

public class Node {
    final private String name;
    private HashMap<Integer, Node> overgangen;

    public Node(String name) {
        this.name = name;
    }

    public void setOvergangNodes(HashMap<Integer, Node> overgangen) {
        this.overgangen = overgangen;
    }

    public String getName() {
        return name;
    }

    public HashMap<Integer, Node> getOvergangen() {
        return overgangen;
    }

    public Node getNextNode(Integer overgang) {
        return getOvergangen().get(overgang);
    }

    @Override
    public String toString() {
        return getName();
    }
}
