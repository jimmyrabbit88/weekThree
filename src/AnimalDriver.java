import javax.swing.*;

public class AnimalDriver {
    public static void main(String[] args) {
        String type = "cow";
        float weight = 407.5f;
        int age = 4;
        String[] continents = new String[]{"Africa", "Aisa", "Europe", "Antartic"};

        Animal animal1 = new Animal();
        JOptionPane.showMessageDialog(null, animal1.toString());

        Animal animal2 = new Animal(type, continents, weight, age);
        JOptionPane.showMessageDialog(null, animal2.toString());

        animal1.setType("dog");
        animal1.setContinents(continents);
        animal1.setWeight(234.77f);
        animal1.setAge(2);

        System.out.println(animal1.getType());

        String[] cons;
        cons = animal1.getContinents();

        System.out.println(cons[0] + " " + cons[1]);
        System.out.println(animal1.getWeight());
        System.out.println(animal1.getAge());







    }
}
