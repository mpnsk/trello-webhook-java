import event.Action;
import event.action.addLabelToCard.Data;
import event.action.addLabelToCard.Display;
import event.action.addLabelToCard.Limits;
import event.action.addLabelToCard.MemberCreator_;

public class addLabelToCard extends Action {

    public String id;
    public String idMemberCreator;
    public Data data;
    public String type;
    public String date;
    public Limits limits;
    public Display display;
    public MemberCreator_ memberCreator;

}
