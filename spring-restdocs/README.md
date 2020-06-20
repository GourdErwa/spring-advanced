# spring-restdocs

## 步骤
- 执行测试用例在 `target/generated-snippets 下生成对应的 adoc` 文件
- 最终 `src/main/asciidoc/index.adoc` 会集成 adoc 文件。

spring-restdocs 是通过单元测试生成 snippets 文件，然后 snippets 根据插件生成 html 文档的。

## 参考
- [Spring REST Docs](https://docs.spring.io/spring-restdocs/docs/2.0.4.RELEASE/reference/html5/)
- [使用 Spring REST Docs 创建 REST 服务文档](https://www.ibm.com/developerworks/cn/java/j-use-spring-rest-docs-to-creat-rest/index.html)