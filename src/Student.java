class Student {
    String name;
    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.setName("Anantha Lakshmi Chitturi");
        System.out.println(obj.getName());
    }
}