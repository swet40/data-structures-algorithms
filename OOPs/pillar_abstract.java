// abstract class Animals {
//     abstract void walk();
//     Animals(){
//         System.out.println("created a new animal");
//     }
//     public void eats(){
//         System.out.println("Animal eats");
//     }
// }

// class Cockroach extends Animals{
//     Cockroach(){
//         System.out.println("created a cockroach");
//     }
//     public void walk(){
//         System.out.println("walks on 16 legs");
//     }
// }

// class Horse extends Animals{
//     Horse(){
//         System.out.println("created a horse");
//     }
//     public void walk(){
//         System.out.println("runs on 4 legs");
//     }
// }

interface Animals{
    public void walk();
}

interface Herbivore{

    }

class horse implements Animals, Herbivore{
    public void walk(){
        System.out.println("walks on legs");
    }
}

public class pillar_abstract{
    public static void main(String[] args) {
        // Cockroach cock = new Cockroach();
        // cock.walk();
        // cock.eats();

        Horse hos = new Horse();
        hos.walk();

        // Animals ani = new Animals(); because animals class is abstract which can only be assumed cant be used - it inhertits
        // ani.walk();
    }
}