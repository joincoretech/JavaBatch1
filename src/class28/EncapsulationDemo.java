package class28;

public class EncapsulationDemo {

    private int field;
    private int field1;
    private int field2;
    private int field3;

    void getField(){
        System.out.println(this.field);
    }

    public  void setField(int field){
        this.field=field;
    }

    public int getField1(){
        return field1;
    }
    public void setField1(int field1){
        this.field1=field1;
    }

    public int getField2(){
        return field2;
    }
    public void setField2(int field2){
        this.field2=field2;
    }


}
