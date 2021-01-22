

public class ProjectTest {
    public static void main(String[] args) {

        Project proj1 =new Project();
        Project proj2 =new Project("Projectname1");
        Project proj3 =new Project("projectname2","Proj-description");
        
        System.out.println(proj3.elevatorPitch("projABC", "DescABC)")); 
    }

    
    
}
