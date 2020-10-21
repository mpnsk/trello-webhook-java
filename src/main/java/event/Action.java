package event;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.MINIMAL_CLASS, property = "type", visible = true)
//@JsonSubTypes({@JsonSubTypes.Type(Action.class)})
public abstract class Action {
}
