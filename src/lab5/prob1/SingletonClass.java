package lab5.prob1;

public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass(){}

    public static SingletonClass getSingletonObject() {
        if (instance == null) {
            instance = new SingletonClass();
            int randomKey = (int)((Math.random() * 9000000) + 1000000);
            System.out.println("Key generated Successfully");
            System.out.println("Your key to activate Avast anti virus is:" + randomKey);
        } else {
            System.out.println("Unsuccessful to produce the key....");
        }

        return instance;
    }
}
