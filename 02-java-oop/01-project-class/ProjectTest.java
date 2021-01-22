import java.util.Arrays;

public class ProjectTest {
    public static void main(String[] args) {

        Project proj3 = new Project("server upgrade", "This is 2 weeks project to upgrade all servers");
        System.out.println(proj3.elevatorPitch());

        Project proj2 = new Project("project 2 name");
        // proj2.setName("project 2 name");
        System.out.println(proj2.elevatorPitch());

        Project proj1 = new Project();
        System.out.println(proj1.elevatorPitch());

    }

}
