# MyBatis逆向工程
此工程可以为数据库单表生成对应的实体、实体对应的mapper和查询实体example。

只需简单三步：     
1. 在/resource/config.properties中。包括数据库的类型、地址、用户名、密码、生成mapper的包路径、model包路径、表名。  
2. 在/resource/generatorConfig.xml中。如需自定义字段类型，参考配置文件注释。  
3. 在idea的Plugins中执行mybatis-generator:generate

如果对您有用的话，请帮忙点个星，`Ｏ（∩＿∩）Ｏ谢谢！`
