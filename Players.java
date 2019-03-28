public class Players {
    String name;
    String position;
    String nationality;
    int age;
    double salary;
    
   

    public static void main (String args[]) {
        Players p1 = new Players();
        p1.name = "Batman";
        p1.position = "Dark Knight";
        p1.nationality = "Gotham";
        p1.age = 39;
        p1.salary = 7000000000.00;
        
        
    
        System.out.println("Player 1: "  +p1.name);
        System.out.println("Position: " +p1.position);
        System.out.println("Nationality: " +p1.nationality);
        System.out.println("Age: " +p1.age);
        System.out.println("Salary: " +p1.salary);
    
        Players p2 = new Players();
        p2.name = "Superman";
        p2.position = "Last Hope";
        p2.nationality = "Krypton";
        p2.age = 30;
        p2.salary = 143657.00;
        
        
    
        System.out.println("Player 2: "  +p2.name);
        System.out.println("Position: " +p2.position);
        System.out.println("Nationality: " +p2.nationality);
        System.out.println("Age: " +p2.age);
        System.out.println("Salary: " +p2.salary);} 
    
}