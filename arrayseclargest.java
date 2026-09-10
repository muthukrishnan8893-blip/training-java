public class arrayseclargest {
    public static void main(String[]args){
        int [] arr={10,5,20,20,20,15,8,15};
        int largest=0;
        int secondLargest=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            else if (arr[i]>=secondLargest &&  arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+secondLargest);
    }
}
