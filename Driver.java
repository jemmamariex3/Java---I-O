/*
Jemma Tiongson
Section #16031
App: IO.java
Purpose: Demonstrate ability to program and use io.read and bubble sort a dictionary file.
-------------------------------------------------------------------------

Terminal:
   Compile: javac IO.java
   Run: java IO
_________________________________________________________________________
*/

class Driver{
   public static void main (String [] args){
      IO io = new IO();
      io.read();
      io.sort();
      io.write();
   }
}