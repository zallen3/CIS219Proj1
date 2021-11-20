//Zachery Allen
//CIS219
//Tues & Thurs, 3:30pm-5:20pm


public class Main {

    public static int[] randomNum(){
        int[] setNums = new int[30];  //Holds numbers 1-30
        int[] randoms= new int[30];  //Randomized numbers 1-30
        
        for (int i = 0; i < setNums.length; i++){  //put 1-30 into setNums array
            setNums[i] = i;
        }
        
        int rand;  //Used to generate a single random 1-30 number
        for (int i = 0; i <setNums.length; i++){  
            rand = (int)(Math.random()*30);
            
            while(setNums[rand] == -1){  //if the number in setNum[rand] is -1 reroll 1-30
                rand = (int)(Math.random()*30);
            }
            if(setNums[rand]!= -1){  //if the number in senNums[rand] isn't -1, put number into randoms[]
                randoms[i] = setNums[rand];
            }
            setNums[rand] = -1;  //that setNums[rand] is now -1 and will be rerolled
        }
        
        for (int i = 0; i < setNums.length-10; i++){ //Prints length of the set randomized                                                     
            randoms[i]= randoms[i]+1;                //numbers-10 for 20 randomized numbers           
            System.out.println(randoms[i]);
        }
        return randoms;
    }
    public static void main(String args[]) {    
        randomNum(); //Runs the method for 20 random numbers
    }
}
