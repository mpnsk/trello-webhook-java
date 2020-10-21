
package event;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import event.model.Model;

public class Event {

    public Model model;
//    @JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, include = JsonTypeInfo.As.PROPERTY, property = "type")
    public Action action;

}
