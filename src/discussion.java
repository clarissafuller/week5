public class discussion {

    public static void main(String[] args) {

        int cupsOfCoffee = 0;

        // PRETEST LOOP: condition is checked BEFORE the loop runs
        // If cupsOfCoffee is already 3 or more, the loop will not run at all
        while (cupsOfCoffee < 3) {
            System.out.println("Pouring another cup of coffee...");
            cupsOfCoffee++;
        }

        System.out.println("Coffee count after while loop: " + cupsOfCoffee);

        int samplesTasted = 0;

        // POSTTEST LOOP: condition is checked AFTER the loop runs
        // This loop will always run at least once, even if the condition is false initially
        do {
            System.out.println("Tasting a soup sample...");
            samplesTasted++;
        } while (samplesTasted < 1);

        System.out.println("Samples tasted: " + samplesTasted);
    }
}

