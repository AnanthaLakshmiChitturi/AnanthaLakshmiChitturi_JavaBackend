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
        obj.setName("ChitturiLakshmi");
        System.out.println(obj.getName());
    }
}