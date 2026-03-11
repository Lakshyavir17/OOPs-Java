class Practical21 {

    void calculateVolume(int side) {
        int volume = side * side * side;
        System.out.println("Volume of Cube: " + volume);
    }

    void calculateVolume(int length, int width, int height) {
        int volume = length * width * height;
        System.out.println("Volume of Rectangular Cube: " + volume);
    }

    void calculateVolume(double radius) {
        double volume = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere: " + volume);
    }

    public static void main(String[] args) {
       System.out.println("240390107019");

        VolumeCalculator v = new VolumeCalculator();
        v.calculateVolume(4);

        v.calculateVolume(5, 3, 2);

        v.calculateVolume(3.5);
    }
}