class Monkey implements Animal1, Animal2
{

    public void animalColor()
    {
        System.out.println("blue");
    }

    public void animalWeight()
    {
        System.out.println("50kgs");
    }

    public static void main (String[] args)
    {

        Monkey M=new Monkey();
        M.animalColor();
        M.animalWeight();
    }
}