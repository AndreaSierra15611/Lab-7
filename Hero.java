public class Hero 
{
    // these are my private varibles 
    private String name;
    private int powerLevel;
    private Affiliation affiliation;

    // this is the constructor i will use 
    public Hero(String name, int powerLevel, Affiliation affiliation) 
    {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;
    }

    // this is the getter method i will use get the hero's name
    public String getName() 
    {
        return name;
    }

    // this is the gette method i will use to get the power level of the hero's
    public int getPowerLevel() 
    {
        return powerLevel;
    }

    // this is the getter method i will use to get the hero's affiliation 
    public Affiliation getAffiliation() 
    {
        return affiliation;
    }

    @Override
    public String toString() 
    {
        return "Hero{name='" + name + "', powerLevel=" + powerLevel + ", affiliation=" + affiliation + '}';
    }
}