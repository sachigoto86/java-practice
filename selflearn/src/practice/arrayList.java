package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class arrayList {

    public static void main(String[] args) {
        
        field_local_method test = new field_local_method();
        
        
        System.out.println(test.show());
        System.out.println(test.data);
        
        
        
//        System.out.println(test.field);

           var arrListData = new ArrayList<String>(Arrays.asList("rose", "sunflower", "morning glory"));
           
          
           
           
           arrListData.add("daisy");
           
           var linkedListData = new LinkedList<String>(Arrays.asList("rose", "sunflower", "morning glory"));
           linkedListData.add(0,"daisy");
           
           System.out.println(arrListData);
           System.out.println(linkedListData);
           
           
           
           
           
           
//           Object[] array = data.toArray();
//           
//           System.out.println(Arrays.toString(array));
//           
//           data.set(0,  "tulip");
//           
//           System.out.println(Arrays.toString(array));
//           System.out.println(data);
//           
//           
//           var readOnlyData = List.of(data);
//           
////           readOnlyData.set(0,  "add");
//           if(1==1) {
//               var block = "block scope";
//           }
//           
//           
//           data.set(0, "added");
//           
//           var block = "local scope";
//           
//         
//           System.out.println(block);
           
           
//           var strs = new String[data.size()];
           
//           System.out.println(Arrays.toString(data));
//           Array strs = data.toArray(strs);
//           data.set(0,  "tulip");
//		   System.out.println(Arrays.toString(strs));
  

    }

}
