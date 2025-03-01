public class OOP {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "Sweta";
        myAcc.setPassword("abc123");

    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

}

class Pen{
    String color;
    int tip;

    String getColor(){
        return color;
    }

    int getTip(){
        return tip;
    }
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

