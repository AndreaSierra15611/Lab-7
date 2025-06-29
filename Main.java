public class Main 
{
    public static void main(String[] args) 
    {
        HeroManager manager = new HeroManager();

        // this will add the heroes
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 75, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));

        // this will display original list
        System.out.println("Original List:");
        manager.displayHeroes();

        // this will bubble sort the heroes
        manager.bubbleSortByPower();
        System.out.println("\nAfter Bubble Sort by Power:");
        manager.displayHeroes();

        
        manager.addHero(new Hero("Iron Man", 88, Affiliation.AVENGERS)); // Add to unsort
        System.out.println("\nAfter Adding Iron Man:");
        manager.displayHeroes();

        manager.insertionSortByPower();
        System.out.println("\nAfter Insertion Sort by Power:");
        manager.displayHeroes();

        // this removes a hero
        System.out.println("\nRemoving Batman...");
        manager.removeHero("Batman");
        manager.displayHeroes();

        // this adds a hero
        System.out.println("\nAdding Thor...");
        manager.addHero(new Hero("Thor", 99, Affiliation.AVENGERS));
        manager.displayHeroes();

        // this will display the heroes in a 2D array
        System.out.println("\nHeroes in 2D Array Format:");
        manager.displayHeroesAs2DArray();
    }
}