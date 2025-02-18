public abstract class WeatherDecorator extends LevelDecorator{
    
    public WeatherDecorator(LevelGenerator level) {
        this.level = level;
    }

    public String generateLevel() {
        return level.generateLevel();
    }

    public int calculateChallenge() {
        return level.calculateChallenge();
    }
}
