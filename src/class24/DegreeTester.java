package class24;

public class DegreeTester {
    public static void main(String[] args) {
        Degree ungraduate= new Undergraduate();
        Postgraduate postgraduate=new Postgraduate();
        Degree degree=new Degree();

        degree.getDegree();
        ungraduate.getDegree();
        postgraduate.getDegree();
    }
}
