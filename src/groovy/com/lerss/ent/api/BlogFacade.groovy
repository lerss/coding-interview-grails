package com.lerss.ent.api

/**
 * 一个基本的blog业务
 */
public interface BlogFacade {
    /**
     * 获取最新的n条日志
     *
     * @param n n条
     * @return 日志列表
     */
    List<BlogEntryDTO> getRecentEntries(int n);

    /**
     * 发布一条日志
     *
     * @param entry 日志
     * @exception Exception 发布失败时候会抛出异常
     */
    void publish(BlogEntryDTO entry);
}

public class BlogEntryDTO {
    String title
    String content
    Date dateCreated
}
