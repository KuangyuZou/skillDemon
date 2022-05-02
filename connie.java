public class connie{
//This is the new class.
    int[] array = {1,2,3,4,5};
    public int positiveNumber(){
        int count = 0;
        for(int i = 0; i<=array.length; i++){
            if (array[i] > 0){
                count++;
            }
        }
        return count;
    }
}
