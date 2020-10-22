package event;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import event.action.CommandTypeIdResolver;

@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM,  property = "type", visible = true)
@JsonTypeIdResolver(CommandTypeIdResolver.class)
public abstract class Action {
}
