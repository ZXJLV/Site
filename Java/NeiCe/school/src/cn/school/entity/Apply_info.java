package cn.school.entity;

public class Apply_info {

    int appluid;
    String name;
    int age;
    int class1;
    String game;

    public Apply_info(String game, String name, int class1, int age) {
        this.name = name;
        this.age = age;
        this.class1 = class1;
        this.game = game;
    }

    public Apply_info(int appluid, String name, int age, int class1, String game) {
        this.appluid = appluid;
        this.name = name;
        this.age = age;
        this.class1 = class1;
        this.game = game;
    }

    public Apply_info() {
    }

    @Override
    public String toString() {
        return "apply_info{" +
                "appluid=" + appluid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", class1='" + class1 + '\'' +
                ", game='" + game + '\'' +
                '}';
    }

    public int getAppluid() {
        return appluid;
    }

    public void setAppluid(int appluid) {
        this.appluid = appluid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClass1() {
        return class1;
    }

    public void setClass1(int class1) {
        this.class1 = class1;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }
}
