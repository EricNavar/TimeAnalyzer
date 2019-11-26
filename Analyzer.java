public class Analyzer
{
    public static void main(String[] args)
    {
        String[] words = StringData.getData();
        //results array stores the results of each array
        int[] results = new int[6];
        //times stores the time in nanoseconds before and after the methods.
        long[] times = new long[7];
        //timesDifference will hold the time that each method takes.
        long[] timeDifferences = new long[6];


        times[0] = System.nanoTime();
        results[0] = linearSearch(words,"not_here");
        times[1] = System.nanoTime();
        results[1] = linearSearch(words,"mzz");
        times[2] = System.nanoTime();
        results[2] = linearSearch(words,"aaa");
        times[3] = System.nanoTime();
        results[3] = binarySearch(words,"not_here");
        times[4] = System.nanoTime();
        results[4] = binarySearch(words,"mzz");
        times[5] = System.nanoTime();
        results[5] = binarySearch(words,"aaa");
        times[6] = System.nanoTime();

        //Calculate time a method takes (in nanoseconds) by
        //subtracting two consecutive entries in the times array
        for (int i = 0; i < 6; i++)
        {
            timeDifferences[i] = times[i+1] - times[i];
        }

        System.out.println("linearSeach() results");
        System.out.println("not_here:\t" + results[0] +"\t\ttime: " + timeDifferences[0]);
        System.out.println("mzz:\t\t" + results[1] +"\ttime: " + timeDifferences[1]);
        System.out.println("aaa:\t\t" + results[2] +"\t\ttime: " + timeDifferences[2]);

        System.out.println("\nbinarySeach() results");
        System.out.println("not_here:\t" + results[3] +"\t\ttime: " + timeDifferences[3]);
        System.out.println("mzz:\t\t" + results[4] +"\ttime: " + timeDifferences[4]);
        System.out.println("aaa:\t\t" + results[5] +"\t\ttime: " + timeDifferences[5]);

    }

    //method copied from section 7.4 in Zybooks.
    //StringData.getData() returns an array already in alphabetical order,
    public static int binarySearch(String[] words, String key)
    {
        int numbersSize = words.length;
        int mid;
        int low = 0;
        int high numbersSize - 1;

        while (high >= low)
	{
            mid = (high + low) / 2;
            if (words[mid].compareTo(key) < 0)
                low = mid + 1;
            else if (words[mid].compareTo(key) > 0)
                high = mid - 1;
            else
                return mid;
        }

        return -1; // not found
    }

    public static int linearSearch(String[] words, String key)
    {
        for(int i = 0; i < words.length; i++)
            if (words[i].equals(key))
                return i;
        return -1;
    }

}