package newSorting.Comparable;

public class Vehicle implements Comparable<Vehicle>{


    private int id;
    private String name;

    @Override
    public int compareTo(Vehicle v1) {
        return this.id - v1.id;
    }


    Vehicle(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
