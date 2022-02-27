public class Players {
    public boolean isGreenLight;
    public int maxSpeed;



    public String[] players(String[] speeds) {

        if (isGreenLight = false) {

            int x = 0;
            for (String name : speeds) {
                String[] parts = name.split(" ");
                x = 0;
                int i = Integer.parseInt(parts[1]);
                if (i <= maxSpeed) {
                    x++;
                }
            }
            String[] players = new String[x];
            for (String name : speeds) {

                String[] parts = name.split(" ");
                int i = Integer.parseInt(parts[1]);
                if (i <= maxSpeed) {
                    players[x] = parts[0];
                    i++;
                }

            }
            return players;

        }
        return speeds;
    }
}
