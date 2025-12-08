class Solution {
    public boolean lemonadeChange(int[] bills) {
    int five=0;
    int ten=0;
    for(int i=0;i<bills.length;i++){
        int val=bills[i];
        if(val==5){
            five++;
        }else if(val==10 && five>0){
            five--;
            ten++;
        }else{
            if(ten>0 && five>0){
                ten--;
                five--;
            }else if(five>=3){
                five-=3;
            }else{
                return false;
            }
        }
    }
    return true;
        //HashMAp
// import java.util.*;

// public class LemonadeChangeHM {
// public static void main(String[] args) {

// int[] arr = {5, 5, 5, 10, 20};
// HashMap<Integer, Integer> hm = new HashMap<>();

// boolean possible = true;

// for (int i = 0; i < arr.length; i++) {
// int val = arr[i];

// if (val == 5) {
// hm.put(5, hm.getOrDefault(5, 0) + 1);
// }

// else if (val == 10) {
// if (hm.getOrDefault(5, 0) > 0) {
// hm.put(5, hm.get(5) - 1);   // give one 5
// hm.put(10, hm.getOrDefault(10, 0) + 1);
// } else {
// possible = false;
// break;
// }
// }

// else if (val == 20) {
// // First try: give 1 ten and 1 five
// if (hm.getOrDefault(10, 0) > 0 && hm.getOrDefault(5, 0) > 0) {
// hm.put(10, hm.get(10) - 1);
// hm.put(5, hm.get(5) - 1);
// }
// // Else try: give 3 fives
// else if (hm.getOrDefault(5, 0) >= 3) {
// hm.put(5, hm.get(5) - 3);
// }
// else {
// possible = false;
// break;
// }
// }
// }

// System.out.println(possible);   // true for {5,5,5,10,20}
// }
// }
// import java.util.*;

// public class LemonadeChangeHM {
// public static void main(String[] args) {

// int[] arr = {5, 5, 5, 10, 20};
// HashMap<Integer, Integer> hm = new HashMap<>();

// boolean possible = true;

// for (int i = 0; i < arr.length; i++) {
// int val = arr[i];

// if (val == 5) {
// hm.put(5, hm.getOrDefault(5, 0) + 1);
// }

// else if (val == 10) {
// if (hm.getOrDefault(5, 0) > 0) {
// hm.put(5, hm.get(5) - 1);   // give one 5
// hm.put(10, hm.getOrDefault(10, 0) + 1);
// } else {
// possible = false;
// break;
// }
// }

// else if (val == 20) {
// // First try: give 1 ten and 1 five
// if (hm.getOrDefault(10, 0) > 0 && hm.getOrDefault(5, 0) > 0) {
// hm.put(10, hm.get(10) - 1);
// hm.put(5, hm.get(5) - 1);
// }
// // Else try: give 3 fives
// else if (hm.getOrDefault(5, 0) >= 3) {
// hm.put(5, hm.get(5) - 3);
// }
// else {
// possible = false;
// break;
// }
// }
// }

// System.out.println(possible);   // true for {5,5,5,10,20}
// }
// }
// import java.util.*;

// public class LemonadeChangeHM {
// public static void main(String[] args) {

// int[] arr = {5, 5, 5, 10, 20};
// HashMap<Integer, Integer> hm = new HashMap<>();

// boolean possible = true;

// for (int i = 0; i < arr.length; i++) {
// int val = arr[i];

// if (val == 5) {
// hm.put(5, hm.getOrDefault(5, 0) + 1);
// }

// else if (val == 10) {
// if (hm.getOrDefault(5, 0) > 0) {
// hm.put(5, hm.get(5) - 1);   // give one 5
// hm.put(10, hm.getOrDefault(10, 0) + 1);
// } else {
// possible = false;
// break;
// }
// }

// else if (val == 20) {
// // First try: give 1 ten and 1 five
// if (hm.getOrDefault(10, 0) > 0 && hm.getOrDefault(5, 0) > 0) {
// hm.put(10, hm.get(10) - 1);
// hm.put(5, hm.get(5) - 1);
// }
// // Else try: give 3 fives
// else if (hm.getOrDefault(5, 0) >= 3) {
// hm.put(5, hm.get(5) - 3);
// }
// else {
// possible = false;
// break;
// }
// }
// }

// System.out.println(possible);   // true for {5,5,5,10,20}
// }
// }



    }
}
