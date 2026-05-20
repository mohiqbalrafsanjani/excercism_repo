public class GameMaster {

    public String describe(Character chtr){
        return "You're a level " + chtr.getLevel() + " " + chtr.getCharacterClass() + " with " + chtr.getHitPoints() + " hit points.";
    }

    public String describe(Destination dstn){
        return "You've arrived at " + dstn.getName() + ", which has " + dstn.getInhabitants() + " inhabitants.";
    }
    
    public String describe(TravelMethod trvl){
        String s = trvl.toString();
        String result = "";
        switch(s){
            case "WALKING":
                result = "You're traveling to your destination by " + s.toLowerCase() + ".";
                break;
            case "HORSEBACK":
                result = "You're traveling to your destination on " + s.toLowerCase() + ".";
                break;
        }
        return result;
    }
    
    public String describe(Character chtr, Destination dstn, TravelMethod trvl){
        return describe(chtr) + " " + describe(trvl) + " " + describe(dstn);
    }

    public String describe(Character chtr, Destination dstn){
        return describe(chtr) + " " + describe(TravelMethod.WALKING) + " " + describe(dstn);
    }
}
