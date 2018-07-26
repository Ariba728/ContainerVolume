package com.NIIT.container;

public class Container {
    private int length, breadth, height;

    public Container() {
        this.length = 0;
        this.breadth = 0;
        this.height = 0;
    }

    public Container(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
    public int getHeight() {
        return height;
    }    
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getVolume() {
        return length * breadth * height;
    }
    public int compare(Container container) throws ContainerVolumeException {

        int volume1 = this.getVolume();
        int volume2 = container.getVolume();
        int result = 0;

        if (volume1 >= volume2) {
            result = volume1 - volume2;
        } else {
            throw new ContainerVolumeException("Container cannot fit in");
        }
        return result;
    }

    @Override
    public String toString() {
        return "Length: " + length + ", Breadth: " + breadth + ", Height: " + height;
    }
}
