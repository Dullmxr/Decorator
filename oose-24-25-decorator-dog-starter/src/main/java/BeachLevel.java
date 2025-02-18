public class BeachLevel extends LevelGenerator{

	protected static final String BEACH_DESCRIPTION = "You see a beach around you \n";
	private LevelGenerator decoratedWeather;

	public BeachLevel()
	{
		this.decoratedWeather = null;
	}
	
    public String generateLevel()
    {
        if (decoratedWeather != null)
        {
            return BEACH_DESCRIPTION + decoratedWeather.generateLevel();
        }
        return BEACH_DESCRIPTION;
	}

    public int calculateChallenge()
    {
        if (decoratedWeather != null)
        {
            return 10 + decoratedWeather.calculateChallenge();
        }
        return 10;
	}

	public BeachLevel(LevelGenerator weather) {
		this.decoratedWeather = weather;
	}
}
