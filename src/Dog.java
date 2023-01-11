public class Dog extends Animal {
    private static int dogCounter;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    // counter for number of dogs
    public static void getCounter() {
        System.out.println(dogCounter + " Dogs are created.");
    }

    //run method for dogs
    @Override
    public void run(int lengthOfObstacle) {
        if (lengthOfObstacle < 0 || lengthOfObstacle > 500) {
            System.out.println("For dogs running distance limit is between 0 and 500!");
        } else {
            System.out.println(name + " ran " + lengthOfObstacle + " meters.");
        }
    }

    //swim method for dogs
    @Override
    public void swim(int lengthOfObstacle) {
        if (lengthOfObstacle < 0 || lengthOfObstacle > 10) {
            System.out.println("For dogs swimming distance limit is between 0 and 10!");
        } else {
            System.out.println(name + " swam " + lengthOfObstacle + " meters.");
        }
    }
}