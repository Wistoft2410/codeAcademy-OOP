import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {

        //Creating a new ArrayList with datatype String and initializing it.
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();


        desertIslandPlaylist.add("September");
        desertIslandPlaylist.add("Boogie Wonderland");
        desertIslandPlaylist.add("Blåhimmel");
        desertIslandPlaylist.add("Ksamil");
        desertIslandPlaylist.add("Right Down the Line");
        desertIslandPlaylist.add("Make It Right");

        //Checking the size of the ArrayList
        System.out.println("\n"+"Antal sange i playlist: " + "\n" + desertIslandPlaylist.size() + "\n");

        //Printing the ArrayList
        System.out.println("Sange i playlist: " + "\n" + desertIslandPlaylist+ "\n");

        //Removing "Boogie Wonderland" song
        desertIslandPlaylist.remove("Boogie Wonderland");

        //Printing out the size of the playlist
        System.out.println("Antal sange i playlist efter reducering: "+ "\n" +  desertIslandPlaylist.size()+ "\n");

        //You’ve grown a little bored of the playlist order. Fortunately, you can change up the ArrayList.
        //Pick out two songs whose order you’d like to swap.
        //This part is a bit trickier, so start by reading the steps you’ll take to make the switch:
        //Get the indices of the songs you want to swap.
        //Create a temporary variable to store the value of song a. (We’ll call the songs a and b here.)
        //Rewrite the value at the index of a to the value of b.
        //Rewrite the value at the index of b to the value of the temporary variable.
        System.out.println("Nuværende Blåhimmel placering: " + desertIslandPlaylist.indexOf("Blåhimmel"));

        System.out.println("Nuværende September placering: " + desertIslandPlaylist.indexOf("September")+ "\n");

        int a = desertIslandPlaylist.indexOf("Blåhimmel");
        int b = desertIslandPlaylist.indexOf("September");

        a = desertIslandPlaylist.indexOf("September");
        b = desertIslandPlaylist.indexOf("Blåhimmel");

        System.out.println("Ny Blåhimmel placering: " + desertIslandPlaylist.indexOf("Blåhimmel"));

        System.out.println("Ny September placering: " + desertIslandPlaylist.indexOf("September")+ "\n");

    }
}