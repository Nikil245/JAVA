public class sort_array{

    public static void printarray(int[] array){
        System.out.println("The elements of array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }


    public static void sort(int[] array){
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Elementa after sorting:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }

    public static void main(String[] args) {
        int[] array ={1,45,78,43,12,4,98,33,54,32,56,23};
        printarray(array);
        sort(array);
    }
}