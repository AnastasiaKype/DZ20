public class SpeedGame1 {

    public static boolean isGreenLight = false;
    public static int MaxSpeed = 3;

    public SpeedGame1() {
    }

    public static String[] namesWinners(String[] speeds) {


        String[] namesWinner = new String[0];
        if (isGreenLight == false) {

            int x = 0;
            for (String name : speeds) {
                String[] parts = name.split(" ");
                x = 0;
                int i = Integer.parseInt(parts[1]);
                if (i <= MaxSpeed) {
                    x++;
                }
            }
            namesWinner = new String[x];
            for (String name : speeds) {

                String[] parts = name.split(" ");
                int i = Integer.parseInt(parts[1]);
                if (i <= MaxSpeed) {
                    namesWinner[x] = parts[0];
                    i++;
                }

            } return namesWinner;

        } return namesWinner;

    }
}

