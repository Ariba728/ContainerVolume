package com.NIIT.container;

public class ContainerDriver {
    public static void main(String[] args) {
        try {
            Container container1 = new Container(40, 40, 40);
            Container container2 = new Container(40,40,40);

            System.out.println("Container 1: " + container1.toString());
            System.out.println("Container 2: " + container2.toString());

            int result = container1.compare(container2);
            System.out.println("Container's remaining volume: " + result);
        } catch (ContainerVolumeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
