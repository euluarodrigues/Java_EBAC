package Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ECommerceQueue {
    public static void main(String[] args) throws Exception {
        Queue<String> orderQueue = new PriorityQueue<>();

        // Adiciona pedidos à fila
        orderQueue.add("Pedido 2");
        orderQueue.add("Pedido 3");
        orderQueue.add("Pedido 1");

        // Processa pedidos na ordem FIFO
        while (!orderQueue.isEmpty()) {
            String order = orderQueue.poll();
            System.out.println("Processando: " + order);
        }

        List<String> orderList = new ArrayList<>();

        // Adiciona pedidos à lista
        orderList.add("Pedido A");
        orderList.add("Pedido B");
        orderList.add("Pedido C");

        // Processa pedidos (ordem não importa)
        for (String order : orderList) {
            System.out.println("Processando: " + order);
        }
    }
}