import event.Action;
import event.action.removeLabelFromCard.Data;
import event.action.removeLabelFromCard.Display;
import event.action.removeLabelFromCard.Limits;
import event.action.removeLabelFromCard.MemberCreator_;

public class removeLabelFromCard extends Action {

    public String id;
    public String idMemberCreator;
    public Data data;
    public String type;
    public String date;
    public Limits limits;
    public Display display;
    public MemberCreator_ memberCreator;

}
