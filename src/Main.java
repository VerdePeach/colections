import java.util.*;

public class Main {

    public static void main(String[] args) {
        int koll = 100000;
        long t1;
        long t2;
        int stap = 0;
        long startTimeAdd[] = new long[6];
        long endTimeAdd[] = new long[6];
        long startTimeGet[] = new long[6];
        long endTimeGet[] = new long[6];
        long startTimeDel[] = new long[6];
        long endTimeDel[] = new long[6];
        Main main = new Main();
        String []strMass;
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        strMass =  main.generateObjects(koll);
        //Array
        startTimeAdd[stap] = System.currentTimeMillis();
        main.addElementsToList(arrayList, strMass);
        endTimeAdd[stap] = System.currentTimeMillis();

        startTimeGet[stap] = System.currentTimeMillis();
        main.getElementsFromList(arrayList);
        endTimeGet[stap] = System.currentTimeMillis();

        startTimeDel[stap] = System.currentTimeMillis();
        main.removeElementsFromList(arrayList);
        endTimeDel[stap] = System.currentTimeMillis();

        stap++;
        //Linked
        startTimeAdd[stap] = System.currentTimeMillis();
        main.addElementsToList(linkedList, strMass);
        endTimeAdd[stap] = System.currentTimeMillis();

        startTimeGet[stap] = System.currentTimeMillis();
        main.getElementsFromList(linkedList);
        endTimeGet[stap] = System.currentTimeMillis();

        startTimeDel[stap] = System.currentTimeMillis();
        main.removeElementsFromList(linkedList);
        endTimeDel[stap] = System.currentTimeMillis();

        stap++;
        //HashSet
        startTimeAdd[stap] = System.currentTimeMillis();
        main.addElementsToList(hashSet, strMass);
        endTimeAdd[stap] = System.currentTimeMillis();

        startTimeGet[stap] = System.currentTimeMillis();
        main.getElementsFromList(hashSet);
        endTimeGet[stap] = System.currentTimeMillis();

        startTimeDel[stap] = System.currentTimeMillis();
        main.removeElementsFromList(hashSet, strMass);
        endTimeDel[stap] = System.currentTimeMillis();

        stap++;
        //TreeSet
        startTimeAdd[stap] = System.currentTimeMillis();
        main.addElementsToList(treeSet, strMass);
        endTimeAdd[stap] = System.currentTimeMillis();

        startTimeGet[stap] = System.currentTimeMillis();
        main.getElementsFromList(treeSet);
        endTimeGet[stap] = System.currentTimeMillis();

        startTimeDel[stap] = System.currentTimeMillis();
        main.removeElementsFromList(treeSet, strMass);
        endTimeDel[stap] = System.currentTimeMillis();

        stap++;
        //HashMap
        startTimeAdd[stap] = System.currentTimeMillis();
        main.addElementsToList(hashMap, strMass);
        endTimeAdd[stap] = System.currentTimeMillis();

        startTimeGet[stap] = System.currentTimeMillis();
        main.getElementsFromList(hashMap);
        endTimeGet[stap] = System.currentTimeMillis();

        startTimeDel[stap] = System.currentTimeMillis();
        main.removeElementsFromList(hashMap, strMass);
        endTimeDel[stap] = System.currentTimeMillis();

        stap++;
        //TreeMap
        startTimeAdd[stap] = System.currentTimeMillis();
        main.addElementsToList(treeMap, strMass);
        endTimeAdd[stap] = System.currentTimeMillis();

        startTimeGet[stap] = System.currentTimeMillis();
        main.getElementsFromList(treeMap);
        endTimeGet[stap] = System.currentTimeMillis();

        startTimeDel[stap] = System.currentTimeMillis();
        main.removeElementsFromList(treeMap, strMass);
        endTimeDel[stap] = System.currentTimeMillis();

        //Print
        main.printTable(startTimeAdd,endTimeAdd,startTimeGet,endTimeGet,startTimeDel,endTimeDel);
    }

   public String []generateObjects(int count){
        String []string = new String[count];
        for (int i = 0; i < string.length; i++){
                string[i] = "How to do that nobody can not to do" + (i+50);
        }
        return string;
    }

   public void addElementsToList(List<String> list, String[] strMass ){
        for(int i = 0; i < strMass.length; i++){
            list.add(strMass[i]);
        }
   }

    public void removeElementsFromList(List<String> list){
        for(int i = 0; i < list.size(); i++){
            list.remove(i);
        }
    }
    public void getElementsFromList(List<String> list){
        for(int i = 0; i < list.size(); i++){
            list.get(i);
        }
    }


    public void addElementsToList(Set<String> set, String[] strMass){
        for(int i = 0; i < strMass.length; i++){
            set.add(strMass[i]);
        }
    }

    public void removeElementsFromList(Set<String> set, String[] strMass){
        for(int i = 0; i < set.size(); i++){
            set.remove(strMass[i]);
        }
    }
    public void getElementsFromList(Set<String> set){
        for (String str: set) {
            str.toString();
        }
    }

    public void addElementsToList(Map<Integer, String> map, String[] strMass){
        for(int i = 0; i < strMass.length; i++){
            map.put(i,strMass[i]);
        }
    }

    public void removeElementsFromList(Map<Integer, String> map, String[] strMass){
        for(int i = 0; i < map.size(); i++){
            map.remove(i);
        }
    }
    public void getElementsFromList(Map<Integer, String> map){
        for(int i = 0; i<map.size(); i++)
            map.get(i);
    }


    public void printTable(long[] startTimeAdd, long[] endTimeAdd, long[] startTimeGet, long[] endTimeGet, long[] startTimeDel, long[] endTimeDel){
        int stap = 0;
        System.out.print("             add      remove      getElement\n");
        System.out.print("ArrayList     " + (endTimeAdd[stap]-startTimeAdd[stap]) + "         " + (endTimeGet[stap]-startTimeGet[stap]) + "            " + (endTimeDel[stap]-startTimeDel[stap]));
        stap++;
        System.out.print("\nLinkedList    " + (endTimeAdd[stap]-startTimeAdd[stap]) + "         " + (endTimeGet[stap]-startTimeGet[stap]) + "         " + (endTimeDel[stap]-startTimeDel[stap]));
        stap++;
        System.out.print("\nHashSet      " + (endTimeAdd[stap]-startTimeAdd[stap]) + "         " + (endTimeGet[stap]-startTimeGet[stap]) + "            " + (endTimeDel[stap]-startTimeDel[stap]));
        stap++;
        System.out.print("\nTreeSet      " + (endTimeAdd[stap]-startTimeAdd[stap]) + "         " + (endTimeGet[stap]-startTimeGet[stap]) + "            " + (endTimeDel[stap]-startTimeDel[stap]));
        stap++;
        System.out.print("\nHashMap      " + (endTimeAdd[stap]-startTimeAdd[stap]) + "         " + (endTimeGet[stap]-startTimeGet[stap]) + "            " + (endTimeDel[stap]-startTimeDel[stap]));
        stap++;
        System.out.print("\nTreeMap      " + (endTimeAdd[stap]-startTimeAdd[stap]) + "         " + (endTimeGet[stap]-startTimeGet[stap]) + "           " + (endTimeDel[stap]-startTimeDel[stap]));

    }
}

