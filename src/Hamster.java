public class Hamster {
    private String name;
    private int age;
    private int weight;
    private String color;

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String setColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void allData(String name, int weight, int age){
        setName(name);
        setAge(age);
        setWeight(weight);
    }
}

