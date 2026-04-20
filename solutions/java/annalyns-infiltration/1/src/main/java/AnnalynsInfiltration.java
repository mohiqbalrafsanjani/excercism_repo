class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean result = true;
        if(knightIsAwake == true){
            result = false;
        }
        return result;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean result = false;
        if(prisonerIsAwake == true || archerIsAwake == true || knightIsAwake == true ){
            result = true;
        }
        return result;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean result = false;
        if(prisonerIsAwake == true && archerIsAwake == false){
            result = true;
        }
        return result;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean result = false;
        if(petDogIsPresent == true && archerIsAwake == false){
                result = true;
        }else if(petDogIsPresent == false && knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true){
                result = true;
        }
        return result;
    }
}
