public class Test {

    public static void main(String[] args) {
            String[] arr = new String[5];
            arr[0] = "apple";
            arr[1] = "banana";
            arr[2] = "cream";
            arr[3] = "doufenschmirtz";
            arr[4] = "apple";


            for(int i = 0; i < arr.length; i++){
                int counter = 0;
                for(int k = i+1; k < arr.length; k++) {
                    if(arr[i].equals(arr[k])){
                        counter++;
                    }
                }

                if (counter > 0){
                    System.out.println(arr[i] + " matches in list: " + counter);
                }
                else {
                    System.out.println(arr[i]);
                }
            }

        }
}



/* public class Test {

    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "a";
        arr[1] = "b";
        arr[2] = "c";
        arr[3] = "d";
        arr[4] = "a";

        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            for(int k = i+1; k < arr.length; k++) {
                if(arr[i].equals(arr[k])){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
*/