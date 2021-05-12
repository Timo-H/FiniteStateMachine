package Machine;

import java.util.HashMap;

public class Node {
    final private String name;
    private HashMap<Character, Node> overgangen;

    public Node(String name) {
        this.name = name;
    }

    public void setOvergangNodes(HashMap<Character, Node> overgangen) {
        this.overgangen = overgangen;
    }

    public String getName() {
        return name;
    }

    public HashMap<Character, Node> getOvergangen() {
        return overgangen;
    }

    public Node getNextNode(Character overgang) {
        return getOvergangen().get(overgang);
    }

    @Override
    public String toString() {
        return getName();
    }
}
