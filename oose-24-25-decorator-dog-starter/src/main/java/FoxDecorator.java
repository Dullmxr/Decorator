public class FoxDecorator extends LevelDecorator {

    protected static final String FOX_DESCRIPTION = "Beyond that you see a fox \n";

    public FoxDecorator(LevelGenerator level) {
        this.level = level;
    }

    public String generateLevel() {
        return level.generateLevel() + FOX_DESCRIPTION;
    }

    public int calculateChallenge() {
        int challenge = level.calculateChallenge();
        if (level instanceof BeachLevel) {
            challenge += 20;
        }
        else if (level instanceof ForestLevel) {
            challenge += 40;
        }
        return challenge;
    }
}