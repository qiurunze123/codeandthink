package com.code.delegate;

public class Dispatcher  implements IExector{

    IExector iExector ;

    public Dispatcher(IExector iExector) {
        this.iExector = iExector;
    }

    @Override
    /**
     * 项目经理也有执行方法但是工作不一样，他的工作就是分配任务
     */
    public void doing() {

        this.iExector.doing();
    }

}
