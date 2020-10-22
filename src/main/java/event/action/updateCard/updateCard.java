package event.action.updateCard;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import event.Action;

public class updateCard extends Action {

    public String id;
    public String idMemberCreator;
    @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
    public Data data;
    public String type;
    public String date;
    public Limits limits;
    public Display display;
    public MemberCreator_ memberCreator;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public Object appCreator;

}
