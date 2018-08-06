<img align="right" src="https://d2gatte9o95jao.cloudfront.net/assets/logo-1b439b7fa6572b659fbef161d8946372f472ef8e7169db1e47d21c91b410b918.svg" height="100" width="100">

## Urban Dictionary API
A Java API wrapper for [Urban Dictionary](https://www.urbandictionary.com/)

## How to use
For setting the token
```Java
UrbanAPI api = new UrbanAPI("your_key");
```
Requesting definition
```Java
System.out.println(api.getUrbanInfo("urban").getInfo().get(0).definition);
```

## Download
In a min

## Dependencies
* [gson-2.8.5](https://github.com/google/gson)
* [okhttp-3.10.0](https://github.com/square/okhttp)
* [okio-1.14.1](https://github.com/square/okio/)
* [logback-classic](https://github.com/qos-ch/logback/tree/master/logback-classic)