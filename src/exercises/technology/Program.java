package exercises.technology;


public class Program {

    public static void main(String[] args) {

        Computer compy = new Computer("Gateway 2000", 17, 1000, "Windows");
        System.out.println(compy.getUniqueID());
        System.out.println(AbstractEntity.getLastID());

        Laptop oldLappy = new Laptop("HP Pavilion", 14.7, 260, "Windows");
        System.out.println(oldLappy.getUniqueID());
        System.out.println(AbstractEntity.getLastID());

        SmartPhone pixel = new SmartPhone("LG Vue 8", 8.5, 220, "Android");
        System.out.println(pixel.getUniqueID());
        System.out.println(AbstractEntity.getLastID());

    }
}
