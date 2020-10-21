import com.fasterxml.jackson.annotation.JsonTypeInfo;
import event.Action;
import event.action.createCard.Data;
import event.action.createCard.Display;
import event.action.createCard.Limits;
import event.action.createCard.MemberCreator_;

public class createCard extends Action {

    public String id;
    public String idMemberCreator;
    public Data data;
    public String type;
    public String date;
    public Limits limits;
    public Display display;
    public MemberCreator_ memberCreator;

}
