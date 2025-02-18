public class HyenaDecorator extends LevelDecorator{
    protected static final String HYENA_DESCRIPTION = "Beyond that you see hyena \n";

    public HyenaDecorator(LevelGenerator level) {
        this.level = level;
    }
    
    public String generateLevel() {
        return level.generateLevel() + HYENA_DESCRIPTION;    
    }

    public int calculateChallenge() {
        return level.calculateChallenge() - 10;
    }
}
