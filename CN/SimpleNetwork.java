// Implement three nodes point-to-point network with duplex links between them. Set the queue size, vary the bandwidth, and find the number of packets dropped.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Nodes {
    Queue<Integer> queue = new LinkedList<>();
    int queueSize, packetsDropped = 0;

    Nodes(int size) {
        this.queueSize = size;
    }

    void sendPacket(int packetId) {
        if (queue.size() < queueSize) {
            queue.add(packetId);
        } else {
            packetsDropped++;
        }
    }

    void receivePacket() {
        if (!queue.isEmpty())
            queue.poll();
    }
}

public class SimpleNetwork {
    public static void main(String[] args) {
        int numNodes = 3, queueSize = 2, packetsToSend = 100;
        Nodes[] nodes = new Nodes[numNodes];
        Random rand = new Random();
        for (int i = 0; i < numNodes; i++)
            nodes[i] = new Nodes(queueSize);

        for (int i = 0; i < packetsToSend; i++) {
            nodes[rand.nextInt(numNodes)].sendPacket(i);
            // Simulating random delay in processing
            for (Nodes node : nodes) {
                if (rand.nextBoolean())
                    node.receivePacket();
            }
        }
        for (int i = 0; i < numNodes; i++)
            System.out.println("Node " + i + " dropped packets: " + nodes[i].packetsDropped);
    }
}