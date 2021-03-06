package only.undrewyan.common.framework.utils;

import cn.hutool.core.lang.UUID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StringUtil {
    public static boolean hasText(String str) {
        return org.springframework.util.StringUtils.hasText(str);
    }

    public static String join(Collection<?> coll, String delim) {
        return org.springframework.util.StringUtils.collectionToDelimitedString(coll, delim);
    }

    public static List<String> split(String toSplit, String delim) {
        String[] stringArray = org.springframework.util.StringUtils.tokenizeToStringArray(toSplit, delim);
        return Arrays.asList(stringArray);
    }

    public static List<Integer> splitToInt(String toSplit, String delim) {
        String[] stringArray = org.springframework.util.StringUtils.tokenizeToStringArray(toSplit, delim);
        List<Integer> array = new ArrayList<>(stringArray.length);
        for (String string : stringArray) {
            array.add(Integer.valueOf(string));
        }
        return array;
    }

    public static String substring(String str, int start) {
        return org.apache.commons.lang3.StringUtils.substring(str, start);
    }

    public static String uuid(boolean isSimple) {
        return UUID.fastUUID().toString(isSimple);
    }
}
