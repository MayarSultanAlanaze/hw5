// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        {
            {
                {
                    {
                        {
                            {
                                {
                                    {
                                        {


    }/* 1 question
       public static void main(String[] args) {
       int[] num1={10,19,-2,1,32,10};
        if (num1.length>=2) {
            System.out.println(num1[0] == num1[5]);
        }else {
            System.out.println("array langths less then2");
        }
        } */

    }/* 2 question
        public static void main(String[] args) {
            int num[]=new int[]{15,20,30,70,99,3,100};
        int K=3;
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(num));
        System.out.println(K+" largeest elements of the said array are:");

        for (int i=0; i<K; i++){
            System.out.println(num[i]);
        }

        }
        }  */

                                }/* 3 question
          public static void main(String[] args) {
        int num[]={1,8,6,10,7,5,15};
        int sum=0;
        for (int i =0; i<num.length;i++){
            sum=sum+num[i];
        }
        double average = sum / num.length;
        System.out.println("The average of the said array is: "+average);
        System.out.println("numbers in the said array that are greater then the average are:");
        for (int i=0; i<num.length;i++){
            if (num[i]>average){
                System.out.println(num[i]);
        }
        }
        }
        } */

                            }/* 4 question
          public static void main(String[] args) {
       int num[]={20,45,70};
               int number=num[0];
               if (num[2]>=number)
                   number=num[2];
               System.out.println("Larger value between first and last element: "+ number);
        }
    } */

                        }/* 5 question
           public static void main(String[] args) {
        String txet[]={"mayar","sultan","alanaze"};
        String x=txet[0];
        txet[0]=txet[txet.length-1];
        txet[txet.length-1]=x;
        System.out.println("New arry after swapping the first and last elements: "+ Arrays.toString(txet));

         }
          }*/

                    }/* 6 question
          static ArrayList<String> longestWorrds(String[]dictionary) {
        ArrayList<String> list = new ArrayList<String>();
        int longest_length = 0;
        for (String str : dictionary) {
            int length = str.length();
            if (length > longest_length) {
                longest_length = length;
                list.clear();
            }
            if (length == longest_length) {
                list.add(str);

            }
           }
        return list;
        }
        // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
       // then press Enter. You can now see whitespace characters in your code.

      public static void main(String[] args) {
      String Name[]={"MAYAR", "RAWAN","ARWA","NOUT"};
      System.out.println(Arrays.toString(Name));
        System.out.println("Result"+longestWorrds(Name));

        }
       } */

                }/* 8 question
           static  int countOccurrences(ArrayList<Integer>clist,int x){
        return Collections.frequency(clist,x);

       }
       public static void main(String[] args) {
        int a[]={1,1,1,3,3,5};
        int x=3;
        int s=1;
        int n=9;
        ArrayList<Integer>clist=new ArrayList<>();

        for (int i:a)
            clist.add(i);
        System.out.println(x+"occurs"+countOccurrences(clist,x)+"times");
        System.out.println(s+"occurs"+countOccurrences(clist,s)+"times");
        System.out.println(n+"occurs"+countOccurrences(clist,n)+"times");

        }
        } */

            }/* 9  question
            static void rearrangeEvenAndOdd(int arr[],int n){
        int j=-1,temp;
        for (int i=0; i<n;i++){
            if (arr[i]%2!=0){
                j++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       }
        public static void main(String[] args) {
        int arr[]={2,3,40,1,5,9,4,10,7};
        int n=arr.length;
        rearrangeEvenAndOdd(arr,n);
        for (int i=0; i<n;i++){

            System.out.print(arr[i]+" ");

        }
        }
       }*/

        }/* 10 question
         public static boolean areEqual(int arr1[], int arr2[]) {

        int M = arr1.length;
        int N = arr2.length;
        if (M != N)
            return false;

        //Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //int count = 0;
        for (int i = 0; i < M; i++) {
            if (arr1[i]!=arr2[i])
             return false;
        }
        return true;
    }

       /* for (int i=0; i<M;i++);
        {
            if (!map.containsKey(arr2[i]))
                return false;
                if (map.get(arr2[i])==0)
                    return false;

            count=map.get(arr2[i]);
            --count;
           map.put(arr2[i],count);
        }
        return true;

        }*/
    }/*
        public static void main(String[] args) {

            int arr1[]={2,3,6,6,4};
            int arr2[]={2,3,6,6,4};
            if (areEqual(arr1,arr2))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

         */
    }