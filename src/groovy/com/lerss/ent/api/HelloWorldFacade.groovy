package com.lerss.ent.api

/**
 * Facade模式，是N层架构中的表现层调用应用层所采用的模式。
 * 一般来说，Facade的接口表示的是一个业务场景，而接口中的方法，则表示的是某一个业务操作。
 * 举例来讲，一个博客业务，Facade接口可能是 `interface BlogFacade` ，而获取最新的10条blog这个操作，就是方法
 * `List<BlogEntry> getLatestBlogEntries(int n)`
 *
 * 下面，是一个Facade的基本例子，用于展示基于单元测试驱动的开发
 */
public interface HelloWorldFacade {

    /**
     * 给某人打招呼
     *
     * @param name 人名
     * @return 打招呼的话语
     */
    String greet(String name);
}
