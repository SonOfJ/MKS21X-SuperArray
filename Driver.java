

public class Driver {
      public static void main (String[]args) {
    	  SuperArray a=new SuperArray();
    	  for(int i=0;i<9;i++) {
    		  a.add("aba");
    	  }
    	  //first phase
    	 System.out.println("should print 9 abas");
    	 System.out.println(a);
    	 System.out.println("shoud also print 9 abas plus one null");
    	 System.out.println(a.toStringDebug());
    	 System.out.println("should print one aba");
    	 System.out.println(a.get(7));
    	 a.set(6,"suraj");
    	 System.out.println("should print suraj");
    	 System.out.println(a.get(6));

    	  //second phase
    	  a.add("new");
    	  System.out.println("checks to see if the resize method works, should add the element new and test to the list");
    	  a.add("test");
    	  System.out.println(a);
    	  System.out.println("should print the list as seen above plus nine nulls");
    	  System.out.println(a.toStringDebug());
    	  System.out.println("should print true");
    	  System.out.println(a.contains("new"));
    	  System.out.println("should print false");
    	  System.out.println(a.contains("kill"));
    	  //time to test the overloaded add method
    	  a.add(9,"goku");
    	  System.out.println("should make goku to be the 10th element and push others to the right");
    	  System.out.println(a);
    	  System.out.println("should return 9");
    	  System.out.println(a.indexOf("goku"));
    	  System.out.println("should return -1");
    	  System.out.println(a.indexOf("naruto"));
    	  a.add(2,"goku");
    	  System.out.println("should print 10");
    	  System.out.println(a.lastIndexOf("goku"));
    	  System.out.println("should print -1");
    	  System.out.println(a.lastIndexOf("gok"));
        System.out.println("should print [aba, aba, goku, aba, aba, aba, aba, suraj, aba, aba, goku, new, test]");
        System.out.println(a);
    	  System.out.println("should print goku");
    	  System.out.println(a.remove(10));
    	  System.out.println("should move other elements to the left");
    	  System.out.println(a);
    	  System.out.println("should return false");
    	  System.out.println(a.remove("gok"));
    	  a.add("goku");
    	  a.remove("goku");
    	  System.out.println("should remove the first instance of goku and shift all the elements to the left with goku at the end");
    	  System.out.println(a);
    try {
    System.out.print("\n\n\n\n");

    /**************************************************************************/

    SuperArray SA = new SuperArray(15);
    System.out.println("Created an empty SuperArray \"SA\" with capacity 15\n\n");

    /**************************************************************************/

    System.out.println("SA's status:                       " + SA.toStringDebug());
    System.out.println("SA is empty (should return true):  " + SA.isEmpty());
    System.out.println("SA's size:                         " + SA.size());

    /**************************************************************************/

    SA.add(0,"Muse");
    SA.add(1,"505");
    SA.add(2,"Radiohead");
    SA.add(3,"Haken");
    //SA.add(5, "Genesis");     //Comment in this line to check to see if it throws an error
    System.out.println("\nAdded \"Muse\", \"505\", \"Radiohead\", \"Haken\" to SA");
    System.out.println("SA's current value':               " + SA.toString());
    System.out.println("Value with nulls:                  " + SA.toStringDebug() + "\n\n");
    System.out.println("SA is empty (should return false): " + SA.isEmpty());

    /**************************************************************************/

    SA.set(1, "42");
    System.out.println("Setting SA[1] to \"42\"...");
    System.out.println("\n");
    System.out.println("Checking set value:                " + SA.get(1) + "\n\n");

    System.out.println("Trying to set a value an index that is out of bounds");
    //SA.set(4,"Celestial Elixir is the best song"); //Comment in this line to check to see if it throws an error

    /**************************************************************************/

    for (int i = SA.size(); i < 15; i++) {
      SA.add("" + i);
    }
    System.out.println("Filling empty slots of SA with integers...");
    System.out.println("Full status of SA:                 " + SA.toStringDebug() + "\n");
    System.out.println("Adding \"Dream Theater\" to SA to test resize...");
    SA.add("Dream Theater");
    System.out.println("SA (capacity should have doubled + 1): " + SA.toStringDebug() + "\n\n");

    /**************************************************************************/

    System.out.println("Checking SA for \"Muse\":      " + SA.contains("Muse"));
    System.out.println("This should return true!");
    System.out.println("Checking SA for \"Kendrick Lamar\"    " + SA.contains("Kendrick Lamar"));
    System.out.println("This should return false!\n\n");
    System.out.println("Trying to get a value at an index that is out of bounds");
    //SA.get(35);                       //Comment in this line to check to see if it throws an error

    /**************************************************************************/

    SA.add(5, "Thank You Scientist");
    System.out.println("Adding \"Thank You Scientist\" to index 5...");
    System.out.println("SA status:                         " + SA.toString());
    SA.remove(6);
    System.out.println("\nRemoving the number \"5\" from index 6...");
    System.out.println("SA status:                         " + SA.toString());
    SA.remove("42");
    System.out.println("\nRemoving the number \"42\" from SA...");
    System.out.println("SA status:                         " + SA.toString() + "\n\n");

    System.out.println("\nTrying to remove an index that is out of bounds");
    //SA.remove(35);  //Comment in this line to check to see if it throws an error

    SA.set(5,"MGMT");
    System.out.println("Setting \"MGMT\" to index 5...");
    System.out.println("SA status:                         " + SA.toString());
    SA.set(10,"MGMT");
    System.out.println("Setting \"MGMT\" to index 10...");
    System.out.println("SA status:                         " + SA.toString());
    System.out.println("Checking SA for first index of \"MGMT\":                       " + SA.indexOf("MGMT"));
    System.out.println("Checking SA for last index of \"MGMT\":                       " + SA.lastIndexOf("MGMT"));

    System.out.println("Clearing SA");
    SA.clear();
    System.out.println(SA.toString());

  }
  catch(IndexOutOfBoundsException e) {
    System.out.println("Caught a problem in the main");

  }

      }
}
