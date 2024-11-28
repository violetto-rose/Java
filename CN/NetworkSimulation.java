//Implement transmission of ping message/trace route over a network topology consisting of 6 nodes and find the number of packets dropped due to congestion.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class node {
    Queue<Integer> queue = new LinkedList<>();
    int queueSize, packetsDropped = 0;

    node(int size) {
        queueSize = size;
    }

    void sendPing(int packetId) {
        if (queue.size() < queueSize) {
            queue.add(packetId);
        } else {
            packetsDropped++;
        }
    }

    void receivePing() {
        if (!queue.isEmpty())
            queue.poll(); // Process one packet
    }
}

public class NetworkSimulation {
    public static void main(String[] args) {
        int numnodes = 6, queueSize = 2, pingsToSend = 300; // High load
        node[] nodes = new node[numnodes];
        Random rand = new Random();
        // Initialize nodes
        for (int i = 0; i < numnodes; i++)
            nodes[i] = new node(queueSize);
        // Simulate sending pings
        for (int i = 0; i < pingsToSend; i++) {
            int sender = rand.nextInt(numnodes); // Random sender
            nodes[sender].sendPing(i); // Send a ping
        }
        // Simulate processing pings (ensuring that not all are processed)
        for (node node : nodes) {
            for (int i = 0; i < 10; i++) { // Attempt to process packets multiple times
                node.receivePing();
            }
        }
        // Print results
        for (int i = 0; i < numnodes; i++)
            System.out.println("node " + i + " dropped packets: " + nodes[i].packetsDropped);
    }
}