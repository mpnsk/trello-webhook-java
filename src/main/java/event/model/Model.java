package event.model;


import java.util.Date;
import java.util.List;

public class Model {

    public String id;
    public String desc;
    public DescData descData;
    public Boolean closed;
    public Object idOrganization;
    public Object idEnterprise;
    public Boolean pinned;
    public String url;
    public String shortUrl;
    public Prefs prefs;
    public LabelNames labelNames;
    public List<Object> checkItemStates;
    public Date dateLastActivity;
    public Date dueReminder;
    public String idBoard;
    public String idList;
    public List<Object> idMembersVoted;
    public int idShort;
    public String idAttachmentCover;
    public List<String> idLabels;
    public Boolean manualCoverAttachment;
    public String name;
    public Integer pos;
    public String shortLink;
    public Boolean isTemplate;
    public Boolean dueComplete;
    public Object due;
    public Object start;
    public Cover cover;
    public List<Object> idMembers;
    public Object email;
    public Badges badges;
    public Boolean subscribed;
    public List<Object> idChecklists;
    public List<Label> labels;

}
