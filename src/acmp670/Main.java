package acmp670;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    boolean hasDuplicate(int j) {
        Set<Integer> set = new HashSet<>();
        int k;
        while (j != 0) {
            k = j % 10;
            j = j / 10;
            if (set.contains(k)) {
                return true;
            } else {
                set.add(k);
            }
        }
        return false;
    }

    int[] createArray(int n) {
        int[] array = new int[n];
        int i = 0;
        int j = 1;
        while (i < n) {
            if (hasDuplicate(j)) {
                j++;
            } else {
                array[i] = j;
                i++;
                j++;
            }
        }
        return array;
    }

    int getNumber(int n) {
        int[] array = createArray(n);
        return array[n-1];
    }

    void solve(Scanner in, PrintWriter out) {
        int n = Integer.parseInt(in.next());
        out.println(getNumber(n));
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)) {

            solve(in, out);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
/**
 function OstChs(a:integer):boolean;{функция определяет, какие числа остаются}
 var m:set of byte;
 k:byte;
 b:integer;
 begin
 b:=a;
 m:=[];
 OstChs:=true;
 while b<>0 do{пока число не ноль}
 begin
 k:=b mod 10;{отделяем цифру}
 if k in m then{если она уже есть в множестве}
 begin
 OstChs:=false;{это число вычеркиваем}
 break;{выходим из цикла}
 end
 else include(m,k);{если еще нет этой цифры, включаем в множество}
 b:=b div 10;{берем следующее число без этой цифры}
 end;
 end;
 var i,n,k:integer;
 begin
 clrscr;
 repeat
 write('Введите число от 1 до 10000 n=');
 readln(n);
 until(n>0)and(n<=10000);
 i:=1;k:=0;
 while k<n do{пока не дошли до заданного номера}
 begin
 if OstChs(i) then{если в числе нет одинаковых цифр}
 begin
 inc(k);{увеличиваем искомое число}
 inc(i);{переходим к следующему по порядку}
 end
 else inc(i);{если удаляем, то просто переходим к следующему}
 end;
 write('Число N=',i-1);{результат=предпоследнее число}
 readln
 end.
 */