public class Expedition {
    private char[][] map;
    private int row;
    private int column;
    private int energy;
    private int maxEnergy;
    private int relicGathered;
    private int relicNeeded;
    private int moveCount;
    private String status;

    public Expedition() {
        this.map = new char[0][0];
        this.row = -1;
        this.column = -1;
        this.energy = 0;
        this.maxEnergy = 0;
        this.relicGathered = 0;
        this.relicNeeded = 0;
        this.moveCount = 0;
        this.status = "NOT_STARTED";
    }
}
