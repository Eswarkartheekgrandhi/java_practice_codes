// Create class Movie with below attributes: 

// movieName - String 
// company - String 
// genre - String 
// budget - int

// Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
// take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
// objects where the searchGenre String matches with the original array of Movie object's genre attribute 
// (case insensitive search).

// Write necessary getters and setters.

// Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
// attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
// logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
// print "Low Budget Movie".

// Input
// ---------
// aaa
// Marvel
// Action
// 250000000
// bbb
// Marvel
// Comedy
// 25000000
// ccc
// Marvel
// Comedy
// 2000000
// ddd
// Marvel
// Action
// 300000000
// Action

// Output
// -------------------
// High Budget Movie
// High Budget Movie

import java.util.*;
class Movie {
    private String name;
    private String company;
    private String genre;
    private int budget;

    public Movie(String name,String company,String genre,int budget){
        this.name = name;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public String getGenre() {
        return genre;
    }
    public int getBudget() {
        return budget;
    }
}

class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Movie[] m = new Movie[4];
        for(int i=0;i<m.length;i++){
            String n = sc.nextLine();
            String c = sc.nextLine();
            String g = sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();

            m[i] = new Movie(n,c,g,b); 
        }
        String targ = sc.nextLine();
        String[] ans1 = getMovieByGenre(m,targ);
        for(int i=0;i<ans1.length;i++){
            System.out.println(ans1[i]);
        }
    }
    public static String[] getMovieByGenre(Movie[] m, String s)
    {
        List<String> res = new ArrayList<>();
        for(int i=0;i<m.length;i++){
            if(m[i].getGenre().equalsIgnoreCase(s)){
                if(m[i].getBudget()>80000000){
                    res.add("High Budget Movie");
                }else{
                    res.add("Low Budget Movie");
                }
            }
        }
        return res.toArray(new String[0]);
    }
}