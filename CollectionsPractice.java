import java.util.*;

public class CollectionsPractice{
    public static void main(String[] args){
        
        //ArrayList and Linked List
        List<String> arrlst = new ArrayList<>();
        arrlst.add("First");
        arrlst.add("Second");
        //arrlst.addLast("Test");
        arrlst.add("Third");
        arrlst.add("Fourth");
        arrlst.add("Fifth");
        //arrlst.addFirst("Testfirst");
        
        for (String i : arrlst){
            System.out.print(i+ " ");
        }
        System.out.println("    ");



        List<String> lnkdlst = new LinkedList<>();
        lnkdlst.add("First");
        lnkdlst.add("Second");
        //lnkdlst.addLast("Test");
        lnkdlst.add("JOE");
        lnkdlst.add("Third");
        lnkdlst.add("Fourth");
        lnkdlst.add("Fifth");
        //lnkdlst.addFirst("Testfirst");
        
        for (String j : lnkdlst){
            System.out.print(j+ " ");
        }
        System.out.println("    ");


        for (int x=0; x < lnkdlst.size(); x++){
            if (lnkdlst.get(x) == arrlst.get(x)){
                System.out.println("Yes");
            }
            else{
                lnkdlst.remove(x);
                x--;
                System.out.println("No");
            }
        }
        System.out.println("    ");


        for (String j : lnkdlst){
            System.out.print(j+ " ");
        }
        System.out.println("    ");

        
        
        //Hashmap or Dictionary

        Map<String, Integer> hshmp = new HashMap<>();
        hshmp.put("Dharmesh", 1);
        hshmp.put("Azi", 2);
        hshmp.put("Rando", 8);
        System.out.println(hshmp.toString());
        System.out.println(hshmp.keySet());
        System.out.println(hshmp.get("Azi"));
        System.out.println(hshmp.entrySet());

            //manual printing
        System.out.println("======");

        for( String name : hshmp.keySet()){
            System.out.printf("%s:::%d ",name, hshmp.get(name));
        }





    }
}