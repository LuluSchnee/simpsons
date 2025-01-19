import java.util.ArrayList;

public interface BaseSimpsonPerson extends SimpsonPerson {
    public String getName();
    public void setChild(BaseSimpsonPerson child);
    public ArrayList<BaseSimpsonPerson> getChild();
    public void setFather(BaseSimpsonPerson father);
    public BaseSimpsonPerson getFather();
    public void setMother(BaseSimpsonPerson mother);
    public BaseSimpsonPerson getMother();
    public Gender getGender();
    public void removeChild(BaseSimpsonPerson child);
}
