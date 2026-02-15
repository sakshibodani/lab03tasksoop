//25k-3044
public class Programmer {
    int ID;
    String name;
    String Language;
    int NoOfProblemsSolved;
    public Programmer(int ID, String name, String Language, int NoOfProblemsSolved)
    {
        this.ID=ID;
        this.name=name;
        this.Language=Language;
        this.NoOfProblemsSolved=NoOfProblemsSolved;
    }
    public void UpdateProblems(int NewSolved)
    {
       this.NoOfProblemsSolved +=NewSolved;
       System.out.println(name+ " just solved "+ NewSolved + " more Problems");

    }
    void display()
    {
        System.out.println("Programmer ID: "+ID+", Name: "+ name +", Language: "+Language+ ", Total solved qs: "+ NoOfProblemsSolved );
    }
}
class pro{
    public static void main(String[] args){
        Programmer p1= new Programmer(1, "Sakshi", "java", 20);
        Programmer p2= new Programmer(2, "celi", "C++", 30 );
        p1.display();
        p2.display();
        p1.UpdateProblems(22);
        p2.UpdateProblems(11);
        p1.display();
        p2.display();

    }
}
