import event.Action;
import event.action.createList.Data;
import event.action.createList.Display;
import event.action.createList.Limits;
import event.action.createList.MemberCreator_;

public class createList extends Action {

    public String id;
    public String idMemberCreator;
    public Data data;
    public String type;
    public String date;
    public Limits limits;
    public Display display;
    public MemberCreator_ memberCreator;

}
