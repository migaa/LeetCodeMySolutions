import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nums={12,12};
        int target = 24;
        TwoSum twoSum = new TwoSum();
        int[] retNum = twoSum.twoSum(nums,target);
        
        System.out.println("Hello, World! "+retNum[0]);

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.getFirst());

        // Creating object of the 
        // class linked list 
        LinkedList<String> ll = new LinkedList<String>(); 
  
        // Adding elements to the linked list 
        ll.add("A"); 
        ll.add("B"); 
        ll.addLast("C"); 
        ll.addFirst("D"); 
        ll.add(2, "E"); 
  
        System.out.println(ll); 
  
        ll.remove("B"); 
        ll.remove(3); 
        ll.removeFirst(); 
        ll.removeLast(); 
  
        System.out.println(ll); 

    }

    
}
