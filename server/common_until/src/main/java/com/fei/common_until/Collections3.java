package com.fei.common_until;

import java.util.Collection;
import java.util.Collections;

public class Collections3 {
    public static boolean isNotEmpty(Collection res) {
        if (res == null || res.size() == 0) {
            return false;
        }
        return true;
    }

    public static boolean isEmpty(Collection res) {
        if (res == null || res.size() == 0) {
            return true;
        }
        return false;
    }
}
