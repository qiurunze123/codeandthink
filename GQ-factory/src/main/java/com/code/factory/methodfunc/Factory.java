package com.code.factory.methodfunc;

import com.code.factory.Car;

/**
 * 工厂接口定义了所有的执行标准
 */
public interface Factory {
    /**
     * 符合汽车标准
     *
     * 什么规则标准 驾驶标准 各种指标
     * @return
     */
    Car getCar();
}
