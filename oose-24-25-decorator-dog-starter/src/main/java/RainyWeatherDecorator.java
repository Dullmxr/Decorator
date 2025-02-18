public class RainyWeatherDecorator extends WeatherDecorator {
    
    public RainyWeatherDecorator(LevelGenerator level) {
        super(level);
    }

    public String generateLevel() {
        return level.generateLevel() + "Rainy weather \n";
    }

    public int calculateChallenge() {
        return level.calculateChallenge() + 20;
    }

}