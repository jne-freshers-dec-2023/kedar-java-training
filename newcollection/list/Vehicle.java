package newcollection.list;

public class Vehicle {

    private int id;
    private String name;
    private String color;

    Vehicle(int id,String name,String color){
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public int getId(){
        return id;
    }
    public String getname(){
        return getname();
    }

    public String getColor(){
        return  getColor();
    }

    public void setId(int id){
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
