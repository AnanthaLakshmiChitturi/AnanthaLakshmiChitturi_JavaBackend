
public class MyChild extends MyParent {
    String child_var;

    MyChild() {
        this.child_var = "This is Child class var";
        this.parent_var = "This is Parent class var";
        System.out.println(child_var+"\n"+super.parent_var);
    }

    MyChild (String s) {
        this.child_var=s;
        System.out.println(child_var);
    }

    public static void main(String args[])
    {
        MyChild mch= new MyChild();
        MyChild mch1= new MyChild("Lakshmi");
    }

}