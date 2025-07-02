package unit6.unit6_2;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

/**
 * Класс для сериализации Java-объектов в JSON
 */
public class JsonSerializer {

    /**
     * Основной метод
     * @param object - объект для сериализации
     */
    public String serialize(Object object) throws JsonSerializationException {
        try {
            return serialObj(object);
        }
        catch (Exception e) {
            throw new JsonSerializationException(e.getMessage());
        }
    }

    private String serialObj(Object object) throws IllegalAccessException, JsonSerializationException {
        Class<?> clazz = object.getClass();

        if (clazz.isPrimitive() ||
                clazz.equals(String.class) ||
                clazz.equals(Integer.class) ||
                clazz.equals(Boolean.class) ||
                clazz.equals(Character.class) ||
                clazz.equals(Byte.class) ||
                clazz.equals(Short.class) ||
                clazz.equals(Long.class) ||
                clazz.equals(Float.class) ||
                clazz.equals(Double.class)
        ){
            if(object instanceof String){
               return  "\"" + object + "\"";
            }
            else
            {
                return  object.toString();
            }
        }

        if (Collection.class.isAssignableFrom(clazz)) {
            return serialCollect((Collection<?>) object);
        }

        if (Map.class.isAssignableFrom(clazz)) {
            return serialMap((Map<?, ?>) object);
        }

        String str = "{";
        Field[] fields = clazz.getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                Object ob = field.get(object);

                if (ob != null) {
                    if (!firstField) {
                        str += ", ";
                    }
                    JsonField an = field.getAnnotation(JsonField.class);
                    String fieldName;
                    if(an.name().isEmpty()){
                        fieldName = field.getName();
                    }
                    else {
                        fieldName = an.name();
                    }
                    str += "\"" +  fieldName + "\": " + serialObj(ob);

                    firstField = false;
                }
            }
        }
        str += "}";
        return str;
    }

    private String serialCollect(Collection<?> collection) throws IllegalAccessException, JsonSerializationException {
        String str = "[";
        boolean firstElement = true;

        for (Object element : collection) {
            if (!firstElement) {
                str += ", ";
            }
            str += serialObj(element);
            firstElement = false;
        }
        str += "]";
        return str;
    }

    private String serialMap(Map<?, ?> map) throws JsonSerializationException, IllegalAccessException {
        String str = "{";
        boolean firstEntry = true;

        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!firstEntry) {
                str += ", ";
            }
            String key = entry.getKey().toString();
            str += "\"" + key + "\": ";
            str += serialObj(entry.getValue());
            firstEntry = false;
        }
        str += "}";
        return str;
    }
}
