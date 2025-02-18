
public class ForestLevel extends LevelGenerator
{
	protected static final String FOREST_DESCRIPTION = "You see a forest around you \n";
	public ForestLevel()
	{
		
	}
	

	public String generateLevel()
	{
		return FOREST_DESCRIPTION;
	}

	public int calculateChallenge() {
		return 20;
	}
}
