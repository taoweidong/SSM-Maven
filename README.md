# SSM-Maven
SSM框架Maven基础项目，环境已经配置完毕，已经进行测试


2018年8月12日
- 问题1：在上传项目到github时,忘记忽略了某个文件夹target,就直接push上去了, 最后意识到了此问题,决定删除掉远程仓库中的target文件夹

#### **解决方案：**

命令：
首先进入你的master文件夹下, Git Bash Here ,打开命令窗口

- $ dir                               # 查看有哪些文件夹
- $ git rm -r --cached target         # 删除target文件夹
- $ git commit -m '删除了target'      # 提交,添加操作说明
- $ git push -u origin master         # 将本次更改更新到github项目上去
操作完成.

注:本地项目中的target文件夹不收操作影响,删除的只是远程仓库中的target, 可放心删除

每次增加文件或删除文件，都要commit 然后直接 git push -u origin master，就可以同步到github上了



#### 项目运行

- 开发IDE

Spring Tool Suite 
Version: 3.9.6.RELEASE
Build Id: 201809180727
OS: Windows 8, v.6.2, x86_64 / win32
Java version: 1.8.0

- tomcat中运行



### 2018年12月24日中文乱码问题解决

问题：调用/getUserList接口返回前台数据中包含中文时出现乱码问题

解决方式：在SpringMVC配置文件spring-mvc.xml添加配置信息

```xml
<!-- 处理请求返回json字符串的中文乱码问题 -->
<mvc:annotation-driven>
    <!-- 消息转换器,解决responseBody返回中外乱码问题 -->
    <mvc:message-converters>
        <bean
              class="org.springframework.http.converter.StringHttpMessageConverter">
            <property name="supportedMediaTypes">
                <list>
                    <!--注意：此处为核心配置 -->
                    <value>application/json;charset=UTF-8</value>
                </list>
            </property>
        </bean>
    </mvc:message-converters>
</mvc:annotation-driven>

```

