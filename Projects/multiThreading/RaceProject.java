class RaceRunner implements Runnable {
    private static boolean raceOver = false;
    private final String runnerName;
    private final boolean isHareWithSleep;

    public RaceRunner(String runnerName, boolean isHareWithSleep) {
        this.runnerName = runnerName;
        this.isHareWithSleep = isHareWithSleep;
    }

    @Override
    public void run() {
        for (int distance = 1; distance <= 100; distance++) {
            synchronized (RaceRunner.class) {
                if (raceOver) {
                    System.out.println(runnerName + " stopped at " + distance + "m because the race is over.");
                    return;
                }
            }

            System.out.println(runnerName + " ran " + distance + " meters.");

            if (isHareWithSleep && runnerName.equalsIgnoreCase("Hare") && distance == 60) {
                try {
                    System.out.println("Hare is taking a nap at 60 meters...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Hare was interrupted.");
                }
            }

            if (distance == 100) {
                synchronized (RaceRunner.class) {
                    if (!raceOver) {
                        raceOver = true;
                        System.out.println("\n==========================================");
                        System.out.println(" winner: " + runnerName + " wins the race!");
                        System.out.println("==========================================\n");
                    }
                }
            }
        }
    }
}

public class RaceProject {
    public static void main(String[] args) {
        System.out.println("--- Starting Race ---");

        boolean enableSleepForHare = true; 

        Thread hareThread = new Thread(new RaceRunner("Hare", enableSleepForHare));
        Thread tortoiseThread = new Thread(new RaceRunner("Tortoise", enableSleepForHare));

        hareThread.setPriority(Thread.MAX_PRIORITY);      
        tortoiseThread.setPriority(Thread.MIN_PRIORITY);

        hareThread.start();
        tortoiseThread.start();
    }
}