import event.Action;
import event.action.updateCard.Data;
import event.action.updateCard.Display;
import event.action.updateCard.Limits;
import event.action.updateCard.MemberCreator_;

public class updateCard extends Action {

    public String id;
    public String idMemberCreator;
    public Data data;
    public String type;
    public String date;
    public Limits limits;
    public Display display;
    public MemberCreator_ memberCreator;

}
