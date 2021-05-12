package Machine;

import java.util.ArrayList;

public class FSM {
    final private String tekst;
    final private Node start;

    public FSM(String text, Node start) {
        this.tekst = text;
        this.start = start;
    }

    public String getText() {
        return tekst;
    }

    public Node getStart() {
        return start;
    }

    public void goThroughText() {
        Node currentNode = getStart();
        ArrayList<Node> path= new ArrayList<>();
        path.add(currentNode);

        for (int i = 0; i < getText().length(); i++) {
            if (currentNode.getNextNode(getText().charAt(i)) == null) {
                System.out.println("Error! Node " + currentNode + " heeft geen overgang met het volgende teken: " +
                        getText().charAt(i));
                break;
            } else {
                currentNode = currentNode.getNextNode(getText().charAt(i));
            }
            path.add(currentNode);
        }
        System.out.println(path);
    }
}
