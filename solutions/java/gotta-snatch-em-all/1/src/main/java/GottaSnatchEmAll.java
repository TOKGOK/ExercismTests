import java.util.List;
import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> ret = new HashSet();
        for(String str : cards){
            ret.add(str);
        }
        return ret;
    }

    static boolean addCard(String card, Set<String> collection) {
        boolean flag = !collection.contains(card);
        collection.add(card);
        return flag;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean flag1 = false;
        boolean flag2 = false;
        for(String str : myCollection){
            if(theirCollection.contains(str)){
                theirCollection.remove(str);
            }else{
                flag1 = true;
                break;
            }
        }
        for(String str : theirCollection){
            if(myCollection.contains(str)){
                myCollection.remove(str);
            }else{
                flag2 = true;
                break;
            }
        }
        return flag1 && flag2;
        
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> ret = new HashSet<>(collections.get(0));
        Set<String> remove = new HashSet();
        for(Set<String> set : collections){
            for(String str : ret){
                if(!set.contains(str)){
                    remove.add(str);
                }
            }
            if(!remove.isEmpty()){
                ret.removeAll(remove);
            remove.clear();
            }
            
        }
        return ret;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> ret = new HashSet<>(collections.get(0));
        for(Set<String> set : collections){
            ret.addAll(set);
        }
        return ret;
    }
}
