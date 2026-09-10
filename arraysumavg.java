public class arraysumavg {
    public static void main(String[]args){
        int[] arr={1,2,3,4,5,7,10};
        int sum=0;
        int average=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            average=sum/arr.length;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
    }
}
