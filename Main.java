// // planning for the 5 algorithms I want to ius e Filtered print.  Print all the Scooters in February
// Complex filtered Print.  Print all the Scooters that were borrowed and returned within the same area.
// Find the highest/lowest/average/ average if/Sumif/Countif
// Categorize all the data.  30% of all scooters were rented by under 18s.  60% by 20-35 year olds.  10% by 36+ year olds.
// Top marks: at least one search algorithm based on user input

// The ones I will be using is filitered print iwth differrenet methods ex. menu ---> fil- filtered print, print the highest population of each tree within each neighbourhood, make sure for filtered print it gpoes after going fil from the menu section which ill do two neighborhoods, 1 search algorithm, the search algorithm will consist of kinda the filterd print, like the user can put the neighboord hoods avaliable to them (given in the erm system.out.println) things for example if the user chooses the search option theyl be given a list of neighborhoods to choose from lemme actually just put it in simplier term ( search ----> list of neighborhoods "please choose which neighborhood you would like to choose" ---> ) after choosing the neighbourhood give user choice of either (search for the highest population of tree here) or let the user choose a type of tree and see the dates it was planted. 3/5 done complex filitered print. Print all of the trees in 1990, and or 2022 4/5 , tree quiz? search algrith,, make tree keyword such as fir, elm, spurce, and with unser input show all the avaliable ones in that area . Catagoize all data such as like 50 percent of elm trees were in this area, 20 percentn of the convieved edible fruit trees were in this neighbor hood
//

// really the main things are 

import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner; // Import the Scanner class
import java.io.*; //File  Classes for import (or export)
import java.util.Formatter;

class Main {

  // global variables
  private static ArrayList<String> bearsFruit = new ArrayList<String>();
  private static ArrayList<String> datePlanted = new ArrayList<String>();
  private static ArrayList<String> neighborhood = new ArrayList<String>();
  private static ArrayList<String> species = new ArrayList<String>();
  private static ArrayList<String> typeOfFruit = new ArrayList<String>();

  public static void main(String[] args) {
    bearsFruit = loadBearFruit("bearsFruit.txt");
    datePlanted = loadDatePlanted("datePlanted.txt");
    neighborhood = loadNeighbourhood("neighborhood.txt");
    species = loadSpecies("species.txt");
    typeOfFruit = loadTypeOfFruit("typeOfFruit.txt");
////// the for loop for importation// printing all of the data
    // for(int i = 0; i<datePlanted.size(); i++){
    // for(int i = 0; i<10; i++){

    // System.out.printf("%-16s%-24s\n", datePlanted.get(i), "\t"+
    // neighborhood.get(i), "\t\t"+ species.get(i), " \t\t\t\t"+
    // typeOfFruit.get(i)," "+bearsFruit.get(i)+" \n");

    // }

    System.out.println("\033[H\033[2J");
    Scanner scanner = new Scanner(System.in);
    String input = "";

    boolean checker = false;

    System.out.print("---------------- Menu ---------------");
    System.out.println(
        " \n\tfil - see your possible filter options\n\tsearch-find the trees within the neighboorhood\n\tcat- Catagory of the trees\n\tavg - see the avg amount of Edible fruit trees in each neighborhood\t\nexit - exit the program ");

    while (!checker) {

      // print out options - we want to let the user know at the beginning what they
      // can do

      // planning lel date- have menu stating the most commion dates found that the
      // trees were planted and let the user access which trees were planted that
      // yrar, make a seperate method for that. info- Why were you interested in this
      // result? wot??????)

      input = scanner.nextLine();

      if (input.equalsIgnoreCase("exit")) {
        System.out.println("Now exiting program.");
        System.out.println("\033[H\033[2J");
        break;
      }
      if (input.equalsIgnoreCase("fil")) {

        System.out.println(
            "Which thing would you like to filter? \n\tHPOP - see the highest amount of a specific species of tree in Edmonton\n\tEdifri - see the edible fruit trees present within edmonton (Please Type your response");
      }
      if (input.equalsIgnoreCase("hpop")) {
        filPrint();

      }
      if (input.equalsIgnoreCase("edifruit")) {
        ediFri();

      }

      // end of fil code
      if (input.equalsIgnoreCase("search")) {
        System.out.println("What would you like to search?");
        searchNeigh();

      }
      if (input.equalsIgnoreCase("cat")) {
        printTree();
      }

      if (input.equalsIgnoreCase("avg")) {
          lowTree();
        }

        if (checker) {
          System.out.println("Please enter a valid response");
        }
        // while

      

    }
    scanner.close();
  }

  // Data is read in one line at a time to as a STRING. To create a INT, Double,
  // or Boolean method, you need to parse the String:
  // Boolean.parseBoolean(loadBearFruit)
  private static ArrayList<String> loadBearFruit(String bearsFruit) {
    ArrayList<String> temp = new ArrayList<String>();
    int i = 1;

    try {
      BufferedReader file = new BufferedReader(new FileReader(bearsFruit));
      while (file.ready()) {
        temp.add(file.readLine());
        i = i + 1;
      } // end while
      file.close();
    } catch (IOException e) {
      System.out.println(e);
    }

    return temp;

    // For non-String ArrayLists you need to PARSE the data before adding it
    // You might also want to trim it.

  }// end loadStringArr from a text file
   // // Boolean.parseBoolean(someString)

  private static ArrayList<String> loadDatePlanted(String datePlanted) {
    ArrayList<String> temp = new ArrayList<String>();
    try {
      BufferedReader file = new BufferedReader(new FileReader(datePlanted));
      while (file.ready()) {
        temp.add(file.readLine());
      } // end while
      file.close();
    } catch (IOException e) {
      System.out.println(e);
    }

    return temp;

    // For non-String ArrayLists you need to PARSE the data before adding it
    // You might also want to trim it.

  }// end loadStringArr from a text file

  private static ArrayList<String> loadNeighbourhood(String neighborhood) {
    ArrayList<String> temp = new ArrayList<String>();
    try {
      BufferedReader file = new BufferedReader(new FileReader(neighborhood));
      while (file.ready()) {
        temp.add(file.readLine());
      } // end while
      file.close();
    } catch (IOException e) {
      System.out.println(e);
    }

    return temp;

    // For non-String ArrayLists you need to PARSE the data before adding it
    // You might also want to trim it.

  }// end loadStringArr from a text file

  private static ArrayList<String> loadSpecies(String species) {
    ArrayList<String> temp = new ArrayList<String>();
    try {
      BufferedReader file = new BufferedReader(new FileReader(species));
      while (file.ready()) {
        temp.add(file.readLine());
      } // end while
      file.close();
    } catch (IOException e) {
      System.out.println(e);
    }

    return temp;

    // For non-String ArrayLists you need to PARSE the data before adding it
    // You might also want to trim it.

  }// end loadStringArr from a taxt file

  private static ArrayList<String> loadTypeOfFruit(String typeOfFruit) {
    ArrayList<String> temp = new ArrayList<String>();
    try {
      BufferedReader file = new BufferedReader(new FileReader(typeOfFruit));
      while (file.ready()) {
        temp.add(file.readLine());
      } // end while
      file.close();
    } catch (IOException e) {
      System.out.println(e);
    }

    return temp;

    // For non-String ArrayLists you need to PARSE the data before adding it
    // You might also want to trim it.

  }// end loadStringArr from a text file

  // Data is read in one line at a time to as a Integer. To create a Double,
  // or Boolean method, you need to parse the String:
  // // Boolean.parseBoolean(someString)
  // private static ArrayList<Integer> loadIntegerList(String datePlanted) {
  // ArrayList<Integer> temp = new ArrayList<Integer>();
  // try {
  // BufferedReader file = new BufferedReader(new FileReader(filename));
  // while (file.ready()) {
  // String nextLineS = file.readLine();
  // try{
  // int nextLineI = Integer.parseInt(nextLineS);
  // temp.add(nextLineI);
  // }catch (NumberFormatException ex){
  // ex.printStackTrace();
  // }

  // } // end while
  // file.close();
  // } catch (IOException e) {
  // System.out.println(e);
  // }

  // return temp;

  // For non-String ArrayLists you need to PARSE the data before adding it
  // You might also want to trim it.

  // }// end loadIntegerArr from a text file

  // Data is read in one line at a time to as a Double.
  // or Boolean method, you need to parse the String:
  // // Boolean.parseBoolean(someString)
  // private static ArrayList<Double> loadDoubleList(String filename) {
  // ArrayList<Double> temp = new ArrayList<Double>();
  // try {
 // this algorithm der file = new BufferedReader(new FileReader(filename));
  // while (file.ready()) {
  // String nextLineS = file.readLine();
  // try {
  // double nextLineD = Double.parseDouble(nextLineS);
  // temp.add(nextLineD);
  // } catch (NumberFormatException ex) {
  // ex.printStackTrace();
  // }

  // } // end while
  // file.close();
  // } catch (IOException e) {
  // System.out.println(e);
  // }

  // return temp;

  // }// end loadDoubleList from a text file

  // algorithm 1 filtered print (Highest pop of tree in Edmonton)
  private static void filPrint() {
    System.out.println(
        "Hello, welcome to HPOP((H)ighest (P)population of Trees In Edmonton) This quick message will be entailing what this algorithm will do and why I was interested in it. \n\t------- What does this algorithm do?-------\n\t -------> This algorithm will take the most common/most seen name within the text file (species.txt) and then take the results to translate it into an answer. \n\tWhy does this interest me?\n\t I find this interesting because there are so many trees across Edmonton that to see it just in one place would be phenomenal  ");
   
  }// end of the method

  // algorithm 2 filtered print (Only print edible fruit trees)
  private static void ediFri() {
    System.out.println(
        "Hello, welcome to EdiFri((E)dible (F)ruit population of Trees In Edmonton) This quick message will be entailing the whatalgorithmrithm will do and why I was algorithm it. \n\t------- What does this algorithm?-------\n\t -------> This algorithm will take the results of most likely bearsFruit and get rid of any FALSE values within the txt file associated with species.txt and turn it into an answer. \n\tWhy does this interest me?\n\t I find this interesting because I've always thought that edible fruit trees were a once-in-a-lifetime sight in Edmonton so seeing the data  ");

    for (int i = 0; i < datePlanted.size(); i++) {
    } // end of for loop

  }// end of the method

  // algorithm 3 search algorithm- user chooses a neighborhood to see the search for
  // the highest population of trees here) or let the user choose a type of tree
  // and see the dates it was planted.
  private static void searchNeigh() {
    System.out.println(
        "Hello, welcome to my search algorithm, this quick text bit will tell you what this algorithimalgorithm does and How could someone (perhaps in the business world) use this result to help make a decision? \n\t------- What does this algorithm do?-------\n\t------->This algorithm will take the user's inputs into account and let the user choose from the available ones in the text file and see the highest population of tree in that neighborhood and/or the user chooses a type of tree and sees the dates they were planted\n\tHow could someone (perhaps in the business world) use this result to help make a decision?\n\tI think that people from the business world could use the user's search results to find out the popularity of neighborhoods vs least popular and then decide which neighborhood could possibly need more ads  ");
    for (int i = 0; i < neighborhood.size(); i++) {

    } // end of for loop
  }// end of method

  // algorithim 4 complex filtered print (Print all trees and) percetenages ex 10%
  // of trees were planted in 1991 or smth
  private static void printTree() {
    System.out.println(
        "Hello, this text bit will be showing you the following questions below: \n\t------- What does this algorithim do?-------\n\t -------> This algorithim will be taking the account the datePlanted file and the species file, in order to find out the percentages each tree species were in during each year \n\t What conclusion can you infer from this result?\n\tI can derive the fact of which was the highest time when trees were planted within these paast years   ");

    for (int i = 0; i < datePlanted.size(); i++) {

    } // end of for loop
  }// end of method

  // algorithm 5 complex print lowest amount of trees in each neighborhood in each
  // year
  private static void lowTree() {
    System.out.println(
        " \n\t------- What does this algorithim do?-------\n\t -------> This algortihm will find lowest percentage of edible fruit trees in each neighborhood\n\tWhy does this interest me?\n\t   ");
    for (int i = 0; i < datePlanted.size(); i++) {

    }
  }
}// end of code
