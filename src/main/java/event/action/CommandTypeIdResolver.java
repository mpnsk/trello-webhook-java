package event.action;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import event.Action;

import java.util.function.Function;
import java.util.function.Supplier;

public class CommandTypeIdResolver implements TypeIdResolver {
    private static final String COMMAND_PACKAGE =
            Action.class.getPackage().getName()
//                    + ".command"
            ;
    private JavaType mBaseType;

    @Override
    public void init(JavaType baseType) {
        mBaseType = baseType;
    }

    @Override
    public JsonTypeInfo.Id getMechanism() {
        return JsonTypeInfo.Id.CUSTOM;
    }

    @Override
    public String idFromValue(Object obj) {
        return idFromValueAndType(obj, obj.getClass());
    }

    @Override
    public String idFromBaseType() {
        return idFromValueAndType(null, mBaseType.getRawClass());
    }


    @Override
    public String getDescForKnownTypeIds() {
        return null;
    }

    @Override
    public String idFromValueAndType(Object obj, Class<?> clazz) {
        String name = clazz.getName();
        if (name.startsWith(COMMAND_PACKAGE)) {
//            return name.substring(COMMAND_PACKAGE.length() + 1);
            return clazz.getSimpleName();
        }
        throw new IllegalStateException("class " + clazz + " is not in the package " + COMMAND_PACKAGE);
    }

    @Override
    public JavaType typeFromId(DatabindContext context, String id) {
        Class<?> clazz;
        String clazzName = COMMAND_PACKAGE
                + "." + "action"
                + "." + id
                + "." + id
                ;
        try {
            clazz = Class.forName(clazzName);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("cannot find class '" + clazzName + "'");
        }
        return TypeFactory.defaultInstance().constructSpecializedType(mBaseType, clazz);
    }
}