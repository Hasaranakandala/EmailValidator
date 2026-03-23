public class Employee {
    private int id;
    private String name;
    private String email;

    public Employee(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    void displayDetails(){
        System.out.println("Employee Details ");
        System.out.println("__________________");
        System.out.println();
        System.out.println("ID : "+id+"\n"+
                "NAME : "+name+"\n"+
                "EMAIL : "+email);

    }

}
