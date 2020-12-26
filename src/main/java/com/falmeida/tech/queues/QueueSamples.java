package com.falmeida.tech.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSamples {

    public static void main(String[] args) {

        Queue<Customer> queue = new LinkedList<>();

        queue.add(new Customer("Jeff"));
        queue.add(new Customer("Joe"));
        queue.add(new Customer("Brian"));
        queue.add(new Customer("James"));
        queue.add(new Customer("Angie"));
        queue.add(new Customer("Anna"));
        queue.add(new Customer("Hillary"));
        queue.add(new Customer("John"));
        queue.add(new Customer("Ryan"));

        Customer customer = queue.poll();

        System.out.println(customer.getName());

    }

}
