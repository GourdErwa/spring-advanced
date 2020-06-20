## Junit 5  说明
```
核心注解
@BeforeAll 类似于JUnit 4的@BeforeAll,表示使用了该注解的方法应该在当前类中所有使用了@Test、@RepeatedTest、@ParameterizedTest或者
@TestFactory注解的方法之前执行，必须为static。
@BeforeEach 类似于JUnit 4的@Before,表示使用了该注解的方法应该在当前类中每一个使用了@Test、@RepeatedTest、@ParameterizedTest或者@TestFactory注解的方法之前执行。
@Test 表示该方法是一个测试方法。
@DisplayName 为测试类或测试方法声明一个自定义的显示名称。
@AfterEach 类似于JUnit 4的@After,表示使用了该注解的方法应该在当前类中每一个使用了@Test、@RepeatedTest、@ParameterizedTest或者@TestFactory注解的方法之后执行。
@AfterAll 类似于JUnit 4的@AfterClass,表示使用了该注解的方法应该在当前类中所有使用了@Test、@RepeatedTest、@ParameterizedTest或者@TestFactory注解的方法之后执行,必须为static。
@Disable 用于禁用一个测试类或测试方法,类似于JUnit 4的@Ignore。
@ExtendWith 用于注册自定义扩展。
```