package collection;

import java.util.*;

/**
 * Created by Habib on 8/16/2019.
 */
public class JavaCollectionImplementation {

    public void arrayListMethod() {
        System.out.println("************************ArrayList*************************************");
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(4);
        integerList.add(3);
        integerList.add(6);
        integerList.add(5);

        System.out.println("integerList size is =" + integerList.size());//integerList size is =6
        if (integerList.isEmpty()) {//false
            System.out.println("integerList size is empty");
        }
        if (integerList.contains(5)) {
            System.out.println("5 index is " + integerList.indexOf(5));//5 index is 5
        }
        Iterator iterator = integerList.iterator();
        /*
        iterator is 1
        iterator is 2
        iterator is 4
        iterator is 3
        iterator is 6
        iterator is 5
         */
        while (iterator.hasNext()) {
            System.out.println("iterator is " + iterator.next());
        }
        Object[] objects = integerList.toArray();
        System.out.println("Arrays list is " + Arrays.toString(objects));//Arrays list is [1, 2, 4, 3, 6, 5]

        if (integerList.indexOf(6) > 0) {
            integerList.remove(integerList.indexOf(6));
        }

        List<Integer> otherIntegerList = new ArrayList<Integer>();
        otherIntegerList.add(3);
        otherIntegerList.add(5);

        System.out.println("containsAll is " + integerList.containsAll(otherIntegerList));//containsAll is true
        integerList.addAll(otherIntegerList);
        System.out.println("addAll is " + Arrays.toString(integerList.toArray()));//addAll is [1, 2, 4, 3, 5, 3, 5]

        integerList.removeAll(otherIntegerList);
        System.out.println("removeAll is " + Arrays.toString(integerList.toArray()));//removeAll is [1, 2, 4]

        integerList.remove(2);
        System.out.println("remove is " + Arrays.toString(integerList.toArray()));//remove is [1, 2]

        integerList.retainAll(otherIntegerList);
        System.out.println("retainAll is " + Arrays.toString(otherIntegerList.toArray()));//retainAll is [3, 5]
        System.out.println("retainAll is " + Arrays.toString(integerList.toArray()));//retainAll is []


        integerList.clear();
        System.out.println("clear is " + Arrays.toString(otherIntegerList.toArray()));//clear is [3, 5]

        integerList.add(10);
        System.out.println("add is " + Arrays.toString(integerList.toArray()));//add is [10]
        integerList.set(0, 4);
        System.out.println("set is " + Arrays.toString(integerList.toArray()));//set is [4]

        System.out.println("get is " + integerList.get(0));//get is 4

        otherIntegerList.add(3);
        System.out.println("lastIndexOf is " + otherIntegerList.lastIndexOf(3));//lastIndexOf is 2

        ListIterator listIterator = otherIntegerList.listIterator();
        /*
        listIterator is 3
        listIterator is 5
        listIterator is 3
         */
        while (listIterator.hasNext()) {
            System.out.println("listIterator is " + listIterator.next());
        }

        System.out.println("subList is" + otherIntegerList.subList(0, 1));//subList is[3]


        Collections.sort(otherIntegerList);
        System.out.println("List sorted "+otherIntegerList);//List sorted [3, 3, 5]

        List<Integer> integerListCopy = List.copyOf(otherIntegerList);
        System.out.println("integerListCopy is "+integerListCopy);//integerListCopy is [3, 3, 5]

    }

    public void setCollection(){
        System.out.println("************************setList*************************************");
        Set<Integer> integerSet = new HashSet<Integer>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(4);
        integerSet.add(3);
        integerSet.add(6);
        integerSet.add(5);

        System.out.println("integerSet size is =" + integerSet.size());//integerSet size is =6
        if (integerSet.isEmpty()) {//false
            System.out.println("integerSet size is empty");
        }
        if (integerSet.contains(5)) {
            System.out.println("5 there is " );//5 there is
        }
        Iterator iterator = integerSet.iterator();
        /*
        iterator is 1
        iterator is 2
        iterator is 3
        iterator is 4
        iterator is 5
        iterator is 6
         */
        while (iterator.hasNext()) {
            System.out.println("iterator is " + iterator.next());
        }
        Object[] objects = integerSet.toArray();
        System.out.println("Arrays list is " + Arrays.toString(objects));//Arrays list is [1, 2, 3, 4, 5, 6]

        Set<Integer> otherIntegerSet = new HashSet<Integer>();
        otherIntegerSet.add(3);
        otherIntegerSet.add(5);

        System.out.println("containsAll is " + integerSet.containsAll(otherIntegerSet));//containsAll is true
        integerSet.addAll(otherIntegerSet);
        System.out.println("addAll is " + Arrays.toString(integerSet.toArray()));//addAll is [1, 2, 3, 4, 5, 6]

        integerSet.removeAll(otherIntegerSet);
        System.out.println("removeAll is " + Arrays.toString(integerSet.toArray()));//removeAll is [1, 2, 4, 6]

        integerSet.remove(2);
        System.out.println("remove is " + Arrays.toString(integerSet.toArray()));//remove is [1, 4, 6]

        integerSet.retainAll(otherIntegerSet);
        System.out.println("retainAll is " + Arrays.toString(otherIntegerSet.toArray()));//retainAll is [3, 5]
        System.out.println("retainAll is " + Arrays.toString(integerSet.toArray()));//retainAll is []


        integerSet.clear();
        System.out.println("clear is " + Arrays.toString(otherIntegerSet.toArray()));//clear is [3, 5]

        integerSet.add(10);
        System.out.println("add is " + Arrays.toString(integerSet.toArray()));//add is [10]

        SortedSet<Integer> integerSortedSet=new TreeSet<Integer>();
        integerSortedSet.add(5);
        integerSortedSet.add(4);
        integerSortedSet.add(8);
        integerSortedSet.add(1);
        System.out.println("SortedSet = "+ integerSortedSet);//[1, 4, 5, 8]
        System.out.println("SortedSet headSet is "+integerSortedSet.headSet(5));//[1, 4]
        System.out.println("SortedSet tailSet is "+integerSortedSet.tailSet(5));//[5, 8]

        NavigableSet<Integer> navigableSet= new TreeSet<>();
        navigableSet.addAll(integerSortedSet);
        System.out.println("navigableSet is "+navigableSet);//navigableSet is [1, 4, 5, 8]
        System.out.println("navigableSet higher is "+navigableSet.higher(6));//navigableSet higher is 8
        System.out.println("navigableSet lower is "+navigableSet.lower(1));//navigableSet lower is null
        System.out.println("navigableSet floor is "+navigableSet.floor(2));//navigableSet floor is 1
        System.out.println("navigableSet ceiling is "+navigableSet.ceiling(3));//navigableSet ceiling is 4
        System.out.println("navigableSet pollFirst is "+navigableSet.pollFirst());//navigableSet pollFirst is 1
        System.out.println("navigableSet pollLast is "+navigableSet.pollLast());//navigableSet pollLast is 8
        System.out.println("navigableSet is after poll is "+navigableSet);//navigableSet is after poll is [4, 5]

    }

    public void queueCollection(){
        System.out.println("************************Queue*************************************");
        Queue<Integer> integerQueue=new LinkedList<>();
        for (int i=0; i<5; i++)
            integerQueue.add(i);

        System.out.println("integerQueue is "+integerQueue);//integerQueue is [0, 1, 2, 3, 4]

       integerQueue.remove(2);
        System.out.println("integerQueue after  remove " + integerQueue);//integerQueue after  remove [0, 1, 3, 4]

        int size = integerQueue.size();
        System.out.println("Size of integerQueue is " + size);//Size of integerQueue is 4

        System.out.println("element , head of integerQueue is"+integerQueue.element());//element , head of integerQueue is 0

        System.out.println("peek of integerQueue is "+integerQueue.peek());//peek of integerQueue is 0
        System.out.println("integerQueue after  peek " + integerQueue);//integerQueue after  peek [0, 1, 3, 4]
        System.out.println("poll integerQueue is "+integerQueue.poll());//poll integerQueue is 0
        System.out.println("integerQueue after  poll " + integerQueue);//integerQueue after  poll [1, 3, 4]
        ((LinkedList<Integer>) integerQueue).push(8);
        System.out.println("integerQueue after  push " + integerQueue);//integerQueue after  push [8, 1, 3, 4]

        System.out.println("pop of integerQueue is"+((LinkedList<Integer>) integerQueue).pop());//pop of integerQueue is 8
        System.out.println("integerQueue after  pop " + integerQueue);//integerQueue after  pop [1, 3, 4]
    }

    public void linkedListMethod() {
        System.out.println("************************LinkedList*************************************");
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);
        integerLinkedList.add(4);
        integerLinkedList.add(4);
        integerLinkedList.add(3);

        System.out.println("integerLinkedList size "+integerLinkedList.size());//integerLinkedList size 6
        integerLinkedList.addFirst(5);
        System.out.println("addFirst is "+integerLinkedList);//addFirst is [5, 1, 2, 3, 4, 4, 3]
        integerLinkedList.addLast(10);
        System.out.println("addLast is"+integerLinkedList);//addLast is[5, 1, 2, 3, 4, 4, 3, 10]
        integerLinkedList.poll();
        System.out.println("poll is"+integerLinkedList);//poll is[1, 2, 3, 4, 4, 3, 10]
        integerLinkedList.peek();
        System.out.println("peek is"+integerLinkedList);//peek is[1, 2, 3, 4, 4, 3, 10]

    }

    public void mapCollection(){
        System.out.println("************************mapCollection*************************************");
        Map<Integer,String> stringMap=new HashMap<Integer, String>();
        stringMap.put(1,"a");
        stringMap.put(2,"b");
        stringMap.put(3,"c");
        stringMap.put(5,"e");
        stringMap.put(4,"d");
        stringMap.put(9,"i");
        stringMap.put(7,"g");

        System.out.println("size is "+stringMap.size());//size is 7
        if(stringMap.isEmpty()){
            System.out.println("is emplty");
        }

        System.out.println("get is "+stringMap.get(4));//get is d
        stringMap.remove(3);
        System.out.println("remove is "+stringMap);//remove is {1=a, 2=b, 4=d, 5=e, 7=g, 9=i}
        if(stringMap.containsKey(2)){
            System.out.println("containsKey is "+stringMap.get(2));//containsKey is b
        }
        if(stringMap.containsValue("i")){
            System.out.println("containsValue i is true");//containsValue i is true
        }
        HashMap<Integer, String> integerStringHashMap = new HashMap<Integer, String>();
        integerStringHashMap.put(6,"f");
        stringMap.putAll(integerStringHashMap);
        System.out.println("putAll are "+stringMap);//putAll is {1=a, 2=b, 4=d, 5=e, 6=f, 7=g, 9=i}

        System.out.println("keySet are "+stringMap.keySet());//keySet is [1, 2, 4, 5, 6, 7, 9]

        System.out.println("values are"+stringMap.values());//values are[a, b, d, e, f, g, i]

        stringMap=new TreeMap<Integer, String>(new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                return (x>y)?-1:((x.equals(y))?0:1);
            }

        });
        stringMap.put(1,"a");
        stringMap.put(5,"e");
        stringMap.put(4,"d");
        stringMap.put(7,"g");
        System.out.println("TreeMap is "+stringMap);//stringMap sorted by TreeMap is {7=g, 5=e, 4=d, 1=a}

    }

    public void stackMethod() {
        System.out.println("************************stack*************************************");
        Stack<Integer> integerStack=new Stack<Integer>();
        //by push you can insert item in stack
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        integerStack.push(7);
        integerStack.push(6);
        System.out.println("stack list "+integerStack);//stack list [1, 2, 3, 4, 5, 7, 6]
        // by pop you can get last item that insert in stack and delete of it
        System.out.println("stack pop "+integerStack.pop());//stack pop 6
        System.out.println("stack list after pop "+integerStack);//stack list after pop [1, 2, 3, 4, 5, 7]
        // by pop you can get last item that insert in stack and don't delete of it
        System.out.println("stack list  peek "+integerStack.peek());//stack list  peek 7
        System.out.println("stack list after peek "+integerStack);//stack list after peek [1, 2, 3, 4, 5, 7]
        System.out.println("stack list search "+integerStack.search(7));//stack list search 1

    }

    public void spliteratorCollection(){
        System.out.println("************************spliterator*************************************");
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(3);
        integerArrayList.add(5);
        integerArrayList.add(2);
        integerArrayList.add(1);
        integerArrayList.add(6);
        integerArrayList.add(4);
        integerArrayList.add(9);

        System.out.println(integerArrayList);//[3, 5, 2, 1, 6, 4, 9]
        Spliterator<Integer> spliterator = integerArrayList.spliterator();
        while (spliterator.tryAdvance((n)-> System.out.print(n+" ")));//3 5 2 1 6 4 9
    }
}
