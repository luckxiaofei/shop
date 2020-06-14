package com.fei.entities.enums;

import lombok.Getter;

/**
 * 运行环境组枚举
 *
 * @author dazzlzy
 * @date 2018/5/26
 */
@Getter
public enum EnvironmentGroupEnum {

    /**
     * RUNTIME运行环境组：
     * 1. DEV(开发环境)
     * 2. PROD(生产环境)
     */
    RUNTIME(new com.fei.entities.enums.EnvironmentEnum[]{com.fei.entities.enums.EnvironmentEnum.DEV, com.fei.entities.enums.EnvironmentEnum.PROD}),;

    /**
     * 运行环境
     */
    private com.fei.entities.enums.EnvironmentEnum[] environments;

    EnvironmentGroupEnum(com.fei.entities.enums.EnvironmentEnum[] environments) {
        this.environments = environments;
    }

    /**
     * 是否是runtime运行环境组
     *
     * @param s 环境名
     * @return boolean
     */
    public static boolean isRuntime(String s) {
        com.fei.entities.enums.EnvironmentEnum[] environmentEnums = RUNTIME.getEnvironments();
        for (com.fei.entities.enums.EnvironmentEnum environmentEnum : environmentEnums) {
            if (environmentEnum.getName().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
