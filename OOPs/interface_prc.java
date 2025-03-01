public class interface_prc {

    
    public static void main(String[] args) {
        
    student s1 = new student();
    s1.collegeName = "AMCEC";

    student s2 = new student();
    System.out.println(s2.collegeName);
        // Queen q = new Queen();
        // q.moves();
    }
}

interface chessPlayer{

    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("right, left, up, down, diagonal");
    }
}

class Horse implements chessPlayer{
    public void moves(){
        System.out.println("forward 1/2 step");
    }
}

class student{
    String name;
    int roll;

    static String collegeName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}