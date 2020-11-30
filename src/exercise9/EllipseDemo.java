package exercise9;

public class EllipseDemo {
    public static void main(String[] args) {
      Ellipse e1 = new Ellipse();
      Point p2 = new Point(2, 3);
      Ellipse e2 = new Ellipse(p2, 5, 6);
      Ellipse e3 = new Ellipse(e2);
      Ellipse e4 = new Ellipse();;
      e4.initialize();

      System.out.println("Ellipse 1: " + e1);
      System.out.println("Ellipse 2: " + e2);
      System.out.println("Ellipse 3: " + e3);
      System.out.println("Ellipse 4: " + e4);

      System.out.println("Ellipse 2 equals Ellipse 1: " + e2.equal(e1));
      System.out.println("Ellipse 2 equals Ellipse 3: " + e2.equal(e3));
    }
}