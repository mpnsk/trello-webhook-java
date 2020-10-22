package event.action.updateCard.simple;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public  class Card {
    public String name;
    public String id;
    public Integer idShort;
    public String shortLink;
    public String description;
}
