
public class WolfDecorator extends LevelDecorator
{

	protected static final String WOLF_DESCRIPTION = "Beyond that you see wolves \n";
	
	public WolfDecorator(LevelGenerator level)
	{
		this.level=level;
	}
	
	public String generateLevel()
	{
		return level.generateLevel() +  WOLF_DESCRIPTION;  //put wolf descreption at the end
	}

	public int calculateChallenge() {
		return level.calculateChallenge() + 20;
	}


}
