//Вы получаете начальный номер и конечный номер и должны вернуть количество всех чисел, кроме номеров с 5 в нем.
class Kata
{
    public static int dontGiveMeFive(int start, int end)
    {
        int l = 0;
        for(int i=start; i< end+1;i++){
            int j=i;
            int k = 0;
            while(j!=0){
               int t = Math.abs(j%10);
               if(t==5){
                   k++;
               }
               j = j/10;
            }
            if(k==0){
                l++;
            }
        }
        return l;
    }
}

//На вход получаем n, необходимо вывести лесенку
class Kata1 {
    public static String pattern(int n){
        String a=new String();
        for(int i=1;i<=n;i++){
            a+="1";
            for(int j=1;j<i;j++){
               a+="*";
            }
            if(i!=1){
                a+=i;
            }
            if(i!=n){
                a+="\n";
            }
        }
        return a;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println(Kata.dontGiveMeFive(1,9));
        System.out.println(Kata.dontGiveMeFive(-17,-4));

        System.out.println(Kata1.pattern(3));

    }
}