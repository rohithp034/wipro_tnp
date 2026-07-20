import java.util.*;

class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Box))
            return false;

        Box b = (Box) obj;
        return Double.compare(getVolume(), b.getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(getVolume()).hashCode();
    }

    @Override
    public String toString() {
        return "Length =" + length +
               " Width =" + width +
               " Height =" + height +
               " Volume =" + getVolume();
    }
}

public class BoxSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Box> set = new HashSet<>();

        System.out.print("Enter the number of Box: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.print("Enter Length: ");
            double length = sc.nextDouble();

            System.out.print("Enter Width: ");
            double width = sc.nextDouble();

            System.out.print("Enter Height: ");
            double height = sc.nextDouble();

            set.add(new Box(length, width, height));
        }

        System.out.println("Unique Boxes in the Set are");

        for (Box box : set) {
            System.out.println(box);
        }

        sc.close();
    }
}