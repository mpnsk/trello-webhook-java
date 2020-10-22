
package event.action.updateCard;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(event.action.updateCard.simple.Data.class),
        @JsonSubTypes.Type(event.action.updateCard.move_card_from_list_to_list.Data.class)
})
public abstract class Data {

}
