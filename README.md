
Execute this project with

```shell
$ JASYPT_PASSWORD=password mvn spring-boot:run
```

To encrypt properties use the following command (thanks to )

```shell
encrypted-pwd$ java -cp ~/.m2/repository/org/jasypt/jasypt/1.9.2/jasypt-1.9.2.jar  org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input="contactspassword" password=supersecretz algorithm=PBEWithMD5AndDES
```