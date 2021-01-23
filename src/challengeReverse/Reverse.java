package challengeReverse;

public class Reverse {


    public static void main(String[] args) {

        //Scanner sc=new Scanner(System.in);
        String A="madam";
        /* Enter your code here. Print output to STDOUT. */
        String cadenaInvertida="";
        if(A.length()<=50){
            for(int j=A.length()-1;j>=0;j--){
                cadenaInvertida=cadenaInvertida + A.charAt(j);
            }
        }

        if(A.equals(cadenaInvertida)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}


