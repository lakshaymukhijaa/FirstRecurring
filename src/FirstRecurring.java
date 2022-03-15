import java.util.HashSet;

class FirstRecurring
{
    /**
     *This function prints the first repeating character in str[]
      */

    static char firstReccur(char str[])
    {
        // Creates an empty hashset
        HashSet<Character> h = new HashSet<>();
        // Traversing the input array from left to right
        for (int i=0; i<=str.length-1; i++)
        {
            char c = str[i];

            // If element is already in hash set, update x and then break
            if (h.contains(c))
                return c;

                // Else add element to hash set
            else
                h.add(c);

        }
       return '\0';
    }


    /**
     * main method to run the above code
      *
     */
    public static void main (String[] args)
    {
        String str = "abbac";
        String stri = "abcdef";
        char[] arr = str.toCharArray();
        char[] arra = stri.toCharArray();
        System.out.println(firstReccur(arr));
        System.out.println(firstReccur(arra));
    }
}