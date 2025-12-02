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
  public static void main(String[] args){
    try {
      String[] series = {"Star Wars", "Terminator", "Aliens", "Maze Runnner", "Superman"};
      DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
      for(int i=0; i<series.length; i++){
        output.writeUTF(series[i]);
      }

      output.close();

      DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
      for (int i = 0; i<series.length; i++){
        System.out.print(input.readUTF()+" ");
      }

      input.close();
    } catch (IOException e){
      System.out.println("IO Exception: " + e.getMessage());
    }
  }
}
