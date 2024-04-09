package practice;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class practice_set {

    public static void main(String[] args) {
         PrintStream out = System.out;
        // LinkedHashSet
        Set<String> linkedHash = new LinkedHashSet<>();
        linkedHash.add("A");
        linkedHash.add("B");
        linkedHash.add("C");
 
        // HashSet
        Set<String> hash = new HashSet<>();
        hash.add("A");
        hash.add("B");
        hash.add("C");
 
        // ArrayList
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
 
        // HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put( 1, "あ");
        map.put(2, "い");
        map.put(3,"う");
 
        // Collectionの追加
        linkedHash.addAll(list);
        linkedHash.addAll(map.values());
        hash.addAll(list);
        hash.addAll(map.values());
 
        // 表示
        out.println("LinkedHashSet");
        out.println(linkedHash);
        out.println();
 
        out.println("HashSet");
        out.println(hash);
        out.println();
        
        
        
        
        var treeSet = new TreeSet<Integer>(new ArrayList<>(Arrays.asList(1,20,30,10,50,15)));
        
        var hashSet = new HashSet<Integer>(Arrays.asList(1,29,4,60,34,70));
        
        
        out.println(treeSet);
        out.println(hashSet);
        
        List arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        
        out.println(arrayList);
        
        out.println(arrayList instanceof ArrayList);
        
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
      
        
//        var hashMap((HashMap<String, String>(Map.of("Rose", "Rose1", "Sunflower", "Sunflower1", "Morning Glory", "Morning Glory1"))); 
        
        
//       var map = new HashMap<String, String>(Map.of("rose", "rose1", "sunflower", "sunflower1", "morning glory", "morning glory1"));
       
       
//        var hashMap = new HashMap<String, String>
//        (Map.of("1", "rose", "2", "sunflower", "3", "morning glory"));
//        
//        for(var value: hashMap.values()){
//           System.out.println(value);
//           }
//    
        
       
        var arrayData = new ArrayList<String>(Arrays.asList("rose", "sunflower", "tulip", "cherry blossoms"));
        arrayData.sort((x,y) -> x.length() - y.length());
        
       System.out.println( arrayData);
       
       
       var map3 = new HashMap<String, String>() {
           {
               put("cucumger", "きゅうり");
               put("lettuce", "レタス");
               put("spinach", "ほうれんそう");
               
           }
       };
       
       map3.put("carrot", "にんじん");
       
       map3.remove("cucumger");
       
       
        map3.replace("cucumber", "胡瓜");
        
        for(var entry: map3.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
            
        }
        
        var list1 = new ArrayList<Integer>(Arrays.asList(1,2,4,5)); 
        list1.add(100);
        list1.set(2, 30);
        list1.remove(4);
        for(int i : list1) {
            System.out.println(i);
            
            
        }
        
        
//        
//       for(var key : map.keySet()) {
//    	   System.out.println(key);
//       }
//        
       
       
       
 
    }



    }

