package Machine;

import java.util.Random;
import java.util.ArrayList;

public class FSM {
    final private int aantalStappen;
    final private Node[] nodes;

    public FSM(Integer aantalStappen, Node[] nodes) {
        this.aantalStappen = aantalStappen;
        this.nodes = nodes;
    }

    public int getAantalStappen() {
        return aantalStappen;
    }

    public Node[] getNodes() { return nodes; }

    public ArrayList<Node> goThroughNodes() {
        // aanmaken van startNode en Arraylist voor het belopen pad
        Node currentNode = getNodes()[0];
        ArrayList<Node> path= new ArrayList<>();
        path.add(currentNode);

        Random rand = new Random();

        // doorlopen van de nodes, waarbij er random overgangen gepakt worden
        for (int i = 0; i < getAantalStappen()-1; i++) {
            int overgang = rand.nextInt(getNodes().length/2);
            // als de gevraagde overgang 'null' geeft, dan wordt er een error geprint
            if (currentNode.getNextNode(overgang) == null) {
                System.out.println("Error! Node " + currentNode + " heeft geen overgang met het volgende teken: " +
                        overgang);
                break;
            } else {
                // currentNode gaat over op de volgende Node
                currentNode = currentNode.getNextNode(overgang);
            }
            // Node wordt toegevoegt aan het path Arraylist
            path.add(currentNode);
        }
        if (path.size() < aantalStappen) {
            System.out.println("Volledige pad niet kunnen belopen!\n"+ path.size() + " stap(pen) gezet in plaats van " +
                    aantalStappen);
        }
        return path;
    }
}
