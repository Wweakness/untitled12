import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       StringBuilder k=null;

        while (in.hasNextLine()) {
            String f = in.nextLine();
            String g = in.nextLine();
            String h = in.nextLine();

            int a = Integer.valueOf(f);
            int c = Integer.valueOf(h);
            if(a==0){
                break;
            }
            String[] b=g.split(" ");
            int[] bb=new int[b.length];
           for(int i=0;i<b.length;i++){
               bb[i]=Integer.parseInt(b[i]);
           }
           int count=0;
           for(int j=0;j<bb.length;j++){
               if(bb[j]==c){
                   count++;
               }

           }
            System.out.println(count);




        }



    }
}