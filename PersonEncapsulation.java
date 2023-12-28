public class PersonEncapsulation {

    private String name;
    private int age;

    public PersonEncapsulation(String name, int age) {
        this.name = name;
        if(age >= 0){
            this.age=age;
        }
        else {
            System.out.println("Invalid Age");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age >= 0){
            this.age=age;
        }
        else {
            System.out.println("Invalid Age");
        }
    }

    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }

    public static void main(String[] args) {
        PersonEncapsulation details = new PersonEncapsulation("Kedar",23);

        System.out.println("Name :"+details.getName());
        System.out.println("Age :"+details.getAge());

        details.setName("John");
        details.setAge(30);

        details.display();
    }
}
