package lesson3.Program.Classes;

import java.util.ArrayList;

import lesson3.Program.Classes.Aftercareable;
import lesson3.Program.Classes.JuniorSchoolKid;
import lesson3.Program.Classes.Loveable;
import lesson3.Program.Classes.MiddleSchoolKid;
import lesson3.Program.Classes.Playable;
import lesson3.Program.Classes.SchoolKid;
import lesson3.Program.Classes.SeniorSchoolKid;
import lesson3.Program.Classes.Smoker;

public class Program {
    public static void doAll(SchoolKid schoolKid) {
        System.out.println(schoolKid.getClass().getSimpleName());
        schoolKid.study();
        if (schoolKid instanceof Aftercareable) {
            ((Aftercareable) schoolKid).goToAftercare();
        }
        if (schoolKid instanceof Playable) {
            ((Playable) schoolKid).play();
        }
        if (schoolKid instanceof Smoker) {
            ((Smoker) schoolKid).smoke();
        }
        if (schoolKid instanceof Loveable) {
            ((Loveable) schoolKid).love();
        }
    }

    public static void main(String[] args) {
        ArrayList<SchoolKid> students = new ArrayList<>();
        students.add(new JuniorSchoolKid());
        students.add(new MiddleSchoolKid());
        students.add(new SeniorSchoolKid());

        for (SchoolKid schoolKid : students) {
            doAll(schoolKid);
        }
    }
}
