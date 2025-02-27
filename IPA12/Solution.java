// Create class Medicine with below attributes: 

// MedicineName - String 
// batch - String 
// disease - String 
// price - int

// Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
// This method will take array of Medicine objects and a disease String as parameters. 
// And will return another sorted array of Integer objects where the disease String matches with the 
// original array of Medicine object's disease attribute (case insensitive search).

// Write necessary getters and setters.

// Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
// referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
// method and print the result.

// Input
// -------------

// dolo650
// FAC124W
// fever
// 100
// paracetamol
// PAC545B
// bodypain
// 150
// almox
// ALM747S
// fever
// 200
// aspirin
// ASP849Q
// flu
// 250
// fever

// Output
// ---------
// 100
// 200

import java.util.*;
class Medicine {
    private String name;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String name,String batch,String disease,int price){
        this.name = name;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getBatch() {
        return batch;
    }
    public String getDisease() {
        return disease;
    }
    public int getPrice() {
        return price;
    }
}

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Medicine[] m = new Medicine[4];
        for(int i=0;i<m.length;i++){
            String n = sc.nextLine();
            String b = sc.nextLine();
            String d = sc.nextLine();
            int p = sc.nextInt();
            sc.nextLine();

            m[i] = new Medicine(n,b,d,p);
        }
        String tard = sc.nextLine();
        Integer[] arr = getPriceByDisease(m,tard);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static Integer[] getPriceByDisease(Medicine[] m,String tard){
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<m.length;i++){
            if(m[i].getDisease().equalsIgnoreCase(tard)){
                l.add(m[i].getPrice());
            }
        }
        Integer[] prices = l.toArray(new Integer[0]);
        Arrays.sort(prices);
        return prices;
    }
}