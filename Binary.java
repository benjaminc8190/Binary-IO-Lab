// * CSCI 185 M02
// * Fall 2025
// * M10: Binary I/O Lab
// * Author: Benjamin Chau
// * Date: 12/02/2025
// */

import java.io.*;

// First, please generate an array of at least 5 human names (such as those plots from your favorite TV series or movies), and then write them to a binary file using Binary I/O classes in Java. 
// Finally, please read from the binary file and print those names to the DOS console or via the pop-up window.

class Binary {
  public static void main(Stirng[] args){
    String[] series = {"Star Wars", "Terminator", "Aliens", "Maze Runnner", "Superman"};
    BufferedOutputStream output = new BufferedOutputStream(new BufferedOutputStream("temp.txt"));
    for(int i=0; i<series.length; i++){
      output.write(series[i]);
    }

    output.close();

    FileInputStream input = new FileInputStream(new FileInputStream("temp.txt"));
    for (int i = 0; i<series.length; i++){
      System.out.print(input.read()+" ");
    }

    input.close();
    
  }  
}
