# TheSeven_Scores
---

### NnumberOfStatistical类是一个文件流
1. 数据类
```java
        final int SIZE=24;//
        private int numChar;
        private int numString;
        private int [] letter= new int[SIZE];
        BufferedReader io;
        String numberOfWord="numberOfWord:";
        String numberOfString="numberOfString:";
```
2. 方法
```java
public void printInFile(String Out) throws IOException//统计的文件的信息输出在文件中
public void printInScreen() throws IOException//将统计的信息输出在指定的文件中

```
### ContainStringFile类也是一个文件流，用于查找一个文件下的所有文件中是否含有一个指定的字符串
1. 数据类
```java
  public String fileList;//是包含指定字符串的所有文件的绝对路径
```
```java
 public void findString(File filename,String string) throws IOException//方法用来统计在文件夹File或者文件File下    
// 的包含string的文件的绝对路径
```
#### 测试文件 testSevenContainStringFile一并打包
## 测试说明
* 类NumberOfstatistical包含了现在在屏幕上和显式在将结果输出在当前目录中，文件名可以自己指定
* 类ContainStringFile:包含了测试文件夹testSevenContainStringFile，查询的字符串为“i love you”并且将结果输出到屏幕，结果是文件的绝对路径。
* 