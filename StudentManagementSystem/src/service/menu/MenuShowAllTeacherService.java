package service.menu;
import bean.Config;
import bean.Teacher;
import service.inter.menu.MenuShowAllTeacherServiceInter;

public class MenuShowAllTeacherService implements MenuShowAllTeacherServiceInter {
    public void processLogic() {
        Teacher[] allTeacher = Config.instance().getTeachers();
        for(int i = 0; i < allTeacher.length; i++){
            System.out.println(allTeacher[i]);
        }
    }
}
