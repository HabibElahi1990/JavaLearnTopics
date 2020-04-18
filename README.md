# JavaLearnTopics

This repository is include the base of java

* ``Data Types`(byte, short, int, long, float, double, boolean and char)`

* operators

    * Arithmetic (++,--,+,-,*,/,%,...)
    * Logical (&,|,&&,||,?:,!,...)
    * Relational (==,>,<,...)
    
* `if` , `if-else`
    * command (if , else , more than a if-else , nested if-else)
    * examples (getMaxNumber,getMinNumber)
* `switch-case` 
    * command 
    * examples (getSeasonBySwitch , mathGame)  use `Random` class
* `while` 
    * command
    * examples (specifyCountTypeCharacterOfString)
* `do-while`
    * command
    * examples (getFirstNumber,getAvgFromNumbers)
* `for`
    * command
    * examples (perfectNumber,printStars,makeSquare,squareAndCubeNumber,useLabel)
* `string` 
    * StringManipulation(subSequence,substring,getChars,compareTo,toCharArray,split,Arrays.toString,toCharArray,StringBuffer,StringBuilder,String.join()) 
    * examples (getWordsOfString,compareTimeBetweenStringAndStringBuffer)
    
* `lambda expression`
    * FunctionalInterface , lambda example , Method References (constructor ,static, non-static) ,
    Function interface , BiFunction interface ,Comparator interface , Predicate interface ,BiPredicate interface
    * example(LambdaExercise)
    
* `Stream`
    * count,filter ,sorted ,limit , skip , map,  forEach,reduce,collect ,max
    * Optional class (ifPresent,get)

* `Generics`
    * property generic
    * Class generic 
    * Constructor Generic
    * method generic
    * Type Bounded Generics
    * Interface generic
    * row type  

* `Thread`
    * thread base 
       * extends Thread class
       * implement Runnable interface
       * Thread.currentThread().isInterrupted()
       * Thread.sleep
       * Thread.currentThread().isAlive()
       * Thread.currentThread().getName()
       * setPriority
       * setDaemon
       * interrupt()
       * join()
       * Thread.currentThread().getState()
       * use synchronized in threadBase.PrimaryKey class
       * volatile , wait(),notify() (threadBase.MyClass , threadBase.Consumer, threadBase.Producer)
       * TimerTask ,Timer
    * thread advance
       * Semaphore (acquire,release)  
       * CountDownLatch(await,countDown)
       * ExecutorService ( Executors.newFixedThreadPool,execute,shutdown , 
            Callable ,Future,submit,get)
 * `JDBC`
     * for use JAVA JDBC need 3 part below :
         1) Class.forName("oracle.jdbc.driver.OracleDriver")
         2) create connection 
         like DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr")
         3) create statment or prepareStatment from connection
         statment(insert,update,select)(excuteUpdate,excute,ResultSet)
         PreparedStatement(select,delete)(excuteUpdate,ResultSet)               
 
 * `Collection`
    * Collections.sort ,
    * List(add,isEmpty,contains,toArray,indexOf,remove,containsAll,addAll,removeAll,
               retainAll,clear,set,get,listIterator,subList,copyOf)
    * Iterator(iterator,hasNext,next)
    * Set like List Collection and SortedSet(headSet,tailSet) , NavigableSet(higher,lower,floor,ceiling,pollFirst,pollLast)
    * Queue (add,remove,pop,push,peek,poll,element)
    * Deque is like Queue but reverse for (pop,push,peek,poll,element)
    * LinkedList like Queue (add,size,addFirst,addLast,poll,peek,...)
    * Spliterator(tryAdvance) is like  Iterator 
    * Map (put,isEmpty,size,get,remove,containsKey,containsValue,putAll,keySet,values)
           and Map like Set has SortedMap,NavigableMap
    * Stack (push,pop,peek,search,...) like Queue 
    
* javaIO
    * File (createNewFile,exists,isDirectory,list,listFiles)
    * FileInputStream
    * InputStreamReader
    * BufferedInputStream
    * BufferedReader
    * ObjectOutputStream
    * ObjectInputStream
    * FileWriter
    * FileReader
    * FilenameFilter
    
 *  `Annotation`
    * Documented
    * Target
    * Inherited
    * Retention
    * Repeatable
    * use Annotations inside each other
    * demonstrate need-Members 
    * AnnotationMarker define an annotation as marker 
    * ue AnnotationDemo class example for use of `AnnotationDemo`

 * array
    * learn
        * initialize one dimensional Array
        * initialize multidimensional Array
        * System.arraycopy
        * java.util.Arrays and methods  
        * Arrays.asList
        * Arrays.sort
        * Arrays.compare
    * example
        * SumTwoMatrices
        * ReversingString  (find reversing as two ways first: for and array second:recursive method)
            * use `for loop`
            * use `Array`
            * use `var`
            * use `StringBuilder` class
            * use `RecursiveMethod`
            * use `subString`
            * use `charAt`
        * SumNumber
            * use `Array`
            * use `for-each` style for loop 
        * ReversingItemsOfArray
            * use `Array`
            * use `for`
            * use `Arrays.toString`
        * ProgressBarByArray
        * SumInMultidimensionalArray
 * javaEnum
    * learn 
        * EnumDemo
    * example 
        * calc salary for person by her/him education
        * EducationInfo illustrate `enum` information (HIGH_SCHOOL,DIPLOMA,BACHELOR,DOCTORATE,PROFESSOR)
        * by EmployeeSalaryByEducation class calc salary in `switch case`       
    
 * javaExceptionHandling
    * first learn
        * try
        * catch
        * finally
        * nested try-catch
        * throw
        * throws
        * Multiple catch Clauses 
        * Creating Your Own Exception Subclasses
         
    * example
        * the example for validate info for person and return a appropriate message to user
               
 * javaObjectOriented
    *  learn
        * class
        * abstract
        * interface
        * extend
        * implement
        * composition
        * constructor
        * method
        * overriding
        * overloading
        * inner class
        * nested class
        * Polymorphism
        * Encapsulation
        * static
        * super
        * toString Method
        * default method in interface
    * second example
        * is about register Reference with Person (legal/individual) with zone in PersonMain class
        * use interface , abstract , class inheritance, abstract inheritance, OOP concepts            