public class SunnyWeatherDecorator extends WeatherDecorator {
    
    public SunnyWeatherDecorator(LevelGenerator level) {
        super(level);
    }

    public String generateLevel() {
        return level.generateLevel() + "Sunny weather \n";
    }

    public int calculateChallenge() {
        return level.calculateChallenge() + 5;
    }

}
