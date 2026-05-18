import java.util.List;
import java.util.Map;
import java.util.*;

class RelativeDistance {
    
    public Map<String, List<String>> map = new HashMap<>();
    
    RelativeDistance(Map<String, List<String>>  familyTree) {
        this.map = familyTree;
    }

    int degreeOfSeparation(String personA, String personB) {
        int result = 0;
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        List<String> listAB = new ArrayList<>();
        String strA = personA;
        String strB = personB;
        int mlength = map.size();
        for(int i=0;i<mlength;i++){
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                List<String> listValue = new ArrayList<>();    
                listValue.addAll(entry.getValue());
                    int klength = listValue.size();
                        for(int k=0;k<klength;k++){
                                if(strA == strB){
                                    break;
                                }
                                if(listValue.get(k) == strA){
                                    listA.add(listValue.get(k));
                                    strA = entry.getKey();
                                }
                                if(listValue.get(k) == strB){
                                    listB.add(listValue.get(k));
                                    strB = entry.getKey();
                                } 
                        }                    
            }
        }
            int alength = listA.size();
            int blength = listB.size();
            for(int h=1;h<alength;h++){
                    listAB.add(listA.get(h));              
            }
            for(int g=1;g<blength;g++){
                    listAB.add(listB.get(g));              
            }
            if(strA == strB){
                    listAB.add(strA);
            }
            if(listAB.size() <= 0){
                result = -1;
            }else{
                result = listAB.size();
            }
        return result;
    }
}
