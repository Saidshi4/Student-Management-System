package service.menu;
import bean.Config;
import bean.Student;
import service.inter.menu.MenuShowAllStudentServiceInter;

public class MenuShowAllStudentService implements MenuShowAllStudentServiceInter {
    @Override
    public void processLogic() {
        Student[] allStudent = Config.instance().getStudents();
        for(int i = 0; i < allStudent.length; i++){
            System.out.println(allStudent[i]);
        }
    }
}
