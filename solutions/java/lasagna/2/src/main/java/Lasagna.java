public class Lasagna {

    public int expectedMinutesInOven(){    
    return 40;
    }

    public int remainingMinutesInOven(int minutes){
    return expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int minutes_prep){
       return minutes_prep * 2;
    }

    public int totalTimeInMinutes(int numLayer, int minuteOven){
       return preparationTimeInMinutes(numLayer) + minuteOven;
    }
} 
