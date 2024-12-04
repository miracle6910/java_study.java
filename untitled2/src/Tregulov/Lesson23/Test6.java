package Tregulov.Lesson23;

public class Test6 {
}

class Animal {
     String showName() {
        return "someAnimal";
    }


    void showAboutAnimal() {
        System.out.println("name of animal: " + showName());
    }
}

class Mouse extends Animal {
     String showName() {
        return "Jerry";
    }
    void showAboutMouse() {
        System.out.println("name of mouse: " + showName());
    }

    public static void main(String[] args) {
        Mouse a = new Mouse();
        a.showAboutAnimal();
        a.showAboutMouse();
    }
}