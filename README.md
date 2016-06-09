# ChekCaseWords-Validator-Annotation
Annotation CheckCaseWords for validate upper and lower case and words pattern


If we want validate a field that must be Upper or Lower case and must be a word we can use this annotation, like this:

######this is upper case validation example
```java
@CheckCaseWords(CaseMode.UPPER)
private String name;
```

######this is lower case validation example
```java
@CheckCaseWords(CaseMode.LOWER)
private String name;
```
