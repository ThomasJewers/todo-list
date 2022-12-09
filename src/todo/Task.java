package todo;
import java.util.Date;

public class Task {
    public String Title;
    public String Date;
    public String Status;
    public String Desc;
    public Task(String Title, String Date, String Status, String Desc){
        this.Title = Title;
        this.Date = Date;
        this.Status = Status;
        this.Desc = Desc;
    }

}
