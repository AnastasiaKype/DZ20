public class Players {
    public boolean isGreenLight;
    public int maxSpeed;
    public String[] players;

    public Players(boolean isGreenLight, int maxSpeed) {
        this.isGreenLight = isGreenLight;
        this.maxSpeed = maxSpeed;
    }

    public String[] winners(String[] players) {

        int x = 0;
        for (String name : players) {
            String[] parts = name.split(" ");
            int i = Integer.parseInt(parts[1]);
            if (this.isGreenLight == true) {
                x++;
            } else {
                if (i <= this.maxSpeed) {
                    x++;
                }
            }
        }
        String[] winners = new String[x];
        int cnt = 0;
        for (String name : players) {

            String[] parts = name.split(" ");
            int i = Integer.parseInt(parts[1]);
            if (this.isGreenLight == true) {
                winners[x] = parts[0];
            } else {
                if (i <= this.maxSpeed) {
                    winners[cnt] = parts[0];
                    cnt++;
                }

            }


        }
        return winners;

    }
}
