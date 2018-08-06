<img align="right" src="https://d2gatte9o95jao.cloudfront.net/assets/apple-touch-icon-1734beeaa059fbc5587bddb3001a0963670c6de8767afb6c67d88d856b0c0dad.png" height="100" width="100">

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
**Latest version**: [GitHub releases](https://github.com/Bumbleboss/urbanDictionary_api/releases) [![](https://jitpack.io/v/Bumbleboss/urbanDictionary_api.svg)](https://jitpack.io/#Bumbleboss/urbanDictionary_api)


## Dependencies
* [gson-2.8.5](https://github.com/google/gson)
* [okhttp-3.10.0](https://github.com/square/okhttp)
* [okio-1.14.1](https://github.com/square/okio/)
* [logback-classic](https://github.com/qos-ch/logback/tree/master/logback-classic)