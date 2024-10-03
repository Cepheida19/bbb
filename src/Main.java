public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka", 3);
        cat1.setName("Tosya");
        cat1.setAge(-1);
        System.out.println(cat1.getAge());
        System.out.println(cat1.getName());
    }
}
class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        } else {
            System.out.println("ошибка, нельзя задать отрицательный возраст");
        }
    }
    void jump(){
        System.out.println("Cat is jumping");
    }
}