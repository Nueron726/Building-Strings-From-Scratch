
public class Driver extends StringArray {
    
    
        
    public static void main(String[] args) {
       
        
        
        char[] inArray = new char[6];
        inArray[0] = 'l';
        inArray[1] = 'o';
        inArray[2] = 'v';
        inArray[3] = 'e';
        inArray[4] = 'e';

        StringArray love = new StringArray(inArray);
        System.out.println("This is the length of our love\n" + love.length() + "\n");

        System.out.println("This is our indexOf method we're testing");

        System.out.println("We'd like to return the index 2 of our string \"love\"\n" + love.indexOf(love, 1));

        System.out.println("Now we're testing our contains method");
        StringArray hey = new StringArray();
        String st = "is";
        boolean retval = hey.contains("this", st);
        System.out.println("Method returns\n" + retval + "\n\n");
        System.out.println("We're testing our Endswith Method");

        String str2 = "This is really not immutable!!";
        String s = "immutable!!";
        boolean ret = hey.endsWith(str2, s);
        System.out.println("Method returns\n" + ret + "\n");
        char[] Array = {'H', 'E','k'};
        char[] rray = {'H', 'E','L'};
        StringArray one = new StringArray(Array);
        StringArray two = new StringArray(rray);
        System.out.println("We're testing our equals method");

        System.out.println("Method returns\n" + one.equals(two) + "\t");

        System.out.println("We're testing our lastIndexOf method");

        String h = "resource";

        int x = hey.lastIndexOf('e', h);
        System.out.println("e index position in h from last position\n" + x + "\n");
        System.out.println("This is our toString test\n");
        System.out.println(one.toooString()+"\n");

        System.out.println("Now we are testing our startsWith method");

        String l = "This is the name of our string";
        String e = "Hello";

         System.out.println("Does this string start with \"hello\"?\n" + one.startsWith(two)+"\n");
         System.out.println("We are testing our compmare to method");
         System.out.println(two.compareTo(one)+"\n");
         System.out.println("We're testing our substring method (int beginIndex)");
         System.out.println("Method returns\n" + one.substring(9)+'\n');
         System.out.println("We're testing our substring(int beginIndex, int endIndex)");
         System.out.println("Method returns\n" + one.substring(1, 2)+"\n");
         System.out.println("We're testing our concat");
         System.out.println("Method returns\n" + one.concat(two));
         
         System.out.println("We're going to test the equals ignore case");
         System.out.println("Method returns\n" + one.equalsIgnoreCase(two));
         
         
                 

       
    }

}
