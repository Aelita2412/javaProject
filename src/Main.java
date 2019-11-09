public class Main {
    public static void main(String[] args) {
        Hamster shu = new Hamster();
        shu.allData("Пышка",1,1);
        System.out.println("имя хомяка-" + shu.getName() + "\n вес хомяка-" + shu.getWeight() + "\n возраст хомяка-" + shu.getAge());

        fox fr = new fox() ;
        fr.allData("Алиса",4,2);
        System.out.println("имя лисы-"+ fr.getName() + "\n вес лисы-" + fr.getWeight() + "\n возраст лисы-" + fr.getAge());
    }
}
