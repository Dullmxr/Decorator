public class main {

    public static void main (String[] args){
        //WolfDecorator wolf = new WolfDecorator(new ForestLevel());
        //System.out.println(wolf.generateLevel());

        LevelGenerator level = new SunnyWeatherDecorator(new WolfDecorator(new BeachLevel()));
        System.out.println(level.generateLevel());
        System.out.println("Challenge Rating: " + level.calculateChallenge());
    }
    
}