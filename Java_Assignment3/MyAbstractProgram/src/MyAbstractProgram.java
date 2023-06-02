abstract class Department{
    abstract int getDepartmentSize();
}
class MyAbstractProgram extends Department
{
    int getDepartmentSize()
    {
        System.out.println("size=5");
        return 5;
    }
    public static void main(String args[]){
        MyAbstractProgram obj = new MyAbstractProgram();
        obj.getDepartmentSize();
    }
}