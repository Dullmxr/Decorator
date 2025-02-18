public class DesertLevel extends LevelGenerator
{
    protected static final String DESERT_DESCRIPTION = "You see a desert around you \n";

    public DesertLevel()
    {
    }

    public String generateLevel()
    {
        return DESERT_DESCRIPTION;
    }

    public int calculateChallenge()
    {
        return 30;
    }
}
