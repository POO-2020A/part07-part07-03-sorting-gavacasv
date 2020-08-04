
public class MainProgram {


    public static void main(String[] args) {
        // write your test code here
        int[] array = {6, 3, 0, -1, 4};
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n"+smallest(array)+" "+indexOfSmallest(array)+" "+indexOfSmallestFrom(array,2)+" \n");

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

        sort(array);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int smallest(int[] array){

        int aux=array[0];
        for(int i=1; i<array.length; i++){
            
            if( array[i]<aux){
                aux=array[i];
            }
        }
        return aux;
    }
    public static int indexOfSmallest(int[] array){
        int index=0; 
        int aux=array[index];

        for(int i=1; i<array.length; i++){
            
            if( array[i]<aux){
                aux=array[i];
                index=i;
            }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int index=startIndex;
        int aux=array[index];
        for(int i=startIndex; i<array.length; i++){
            
            if( aux>array[i]){
                aux=array[i];
                index=i;
            }
        }

        
        return index;
    }
    public static void swap(int array[], int index1, int index2){
        int auxiliar = array[index1];
        array[index1]=array[index2];
        array[index2]=auxiliar;
    }
    public static void sort(int array[]){
        int i=0;
        while (i<array.length-1){
            int auxIndex=indexOfSmallestFrom(array,i);
            swap(array,i,auxIndex);
            i++;
        }
    }

}
