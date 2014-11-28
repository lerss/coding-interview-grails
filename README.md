题目要求：

1. 采用GORM作为底层，将题目中的集成测试全部跑通。
2. 不得使用原生SQL，必须确保在不同数据库间的兼容性
3. 不能改动测试代码，如果需要domain，自己新建一个，然后自己转换成DTO，不要改动现有的
4. clone本项目到本地（不得fork本项目），并且自己注册一个github账号，创建一个repo，将你自己的repo通过 `git remote set-url` 指令设置好，然后完成题目以后，将代码push到自己的仓库中，并将本账号（lerss）添加到你的git项目的成员中，用作评审的目的。

说明：

1. 如何将代码clone到本地？添加remot？将本地代码push到自己的远端仓库？

```
  git clone https://github.com/lerss/coding-interview-grails.git
  cd coding-interview-grails
  git remote set-url origin <你自己的repo地址>
  git push -f -u origin master
```

2. 题目中自带一个简单的例子，也就是HelloWorld的例子，可以参考。如何运行例子？需要JDK 1.8最新版，Grails 2.4.3，按照官方文档配置好环境以后，切换到项目目录中，运行：

```
  grails test-app integration: interview.HelloWorldFacadeSpec
```

3. 如何验证题目是否通过测试？需要JDK 1.8最新版，Grails 2.4.3，按照官方文档配置好环境以后，切换到项目目录中，运行：

```
  grails test-app integration: interview.BlogFacadeSpec
```
