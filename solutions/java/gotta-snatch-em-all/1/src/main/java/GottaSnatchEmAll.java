import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < cards.size(); i++){
            set.add(cards.get(i));
        }
        return set;
    }

    static boolean addCard(String card, Set<String> collection) {
        if(!collection.contains(card)){
            collection.add(card);
            return true;
        }
        return false;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if(myCollection.size() > 0 && theirCollection.size() > 0 && myCollection.size() == theirCollection.size()){
            int card = 0;
            int size = myCollection.size();            
            List<String> lst = new ArrayList<>(myCollection);
            for(int i = 0; i < size; i++){
                if(theirCollection.contains(lst.get(i))){
                    card += 1;
                }
            }
            if(card < size){
                return true;
            }
            return false;
        }
        return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> set = new HashSet<>();
        int size = collections.size();
        List<String> lst = new ArrayList<>();
            if(size == 1){
                set.addAll(collections.get(0));
            }else{
                set.addAll(collections.get(0));
                for(int i = 1; i < size; i ++){
                    set.retainAll(collections.get(i));
                }
            }
        return set;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> set = new HashSet<>();
        int size = collections.size();
        List<String> lst = new ArrayList<>();
            if(size == 1){
                set.addAll(collections.get(0));
            }else{
                set.addAll(collections.get(0));
                for(int i = 1; i < size; i ++){
                    set.addAll(collections.get(i));
                }
            }
        return set;
    }
}
