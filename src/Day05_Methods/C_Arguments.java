package Day05_Methods;

public class C_Arguments {
    public static void intro(String name, String course, int age, char grade){
        System.out.println("Hello "+name + "  Student of "+course + " Your current age is : "+age + "  & Grade is "+grade);

    }

    public static void main(String[] args) {
        intro("Chandan", "BCA", 23, 'A');
        intro("Deepak", "BA", 25, 'A');
        intro("Suraj   ", "B.Sc", 27, 'B');
    }
}
