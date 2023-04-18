package class22;

public class MthodOverLoadingdemo2 {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int... arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        MthodOverLoadingdemo2 obj = new MthodOverLoadingdemo2();

         obj.add(10,12,5,6);
    }
}