# TheSeven_Scores
---

### NnumberOfStatistical����һ���ļ���
1. ������
```java
        final int SIZE=24;//
        private int numChar;
        private int numString;
        private int [] letter= new int[SIZE];
        BufferedReader io;
        String numberOfWord="numberOfWord:";
        String numberOfString="numberOfString:";
```
2. ����
```java
public void printInFile(String Out) throws IOException//ͳ�Ƶ��ļ�����Ϣ������ļ���
public void printInScreen() throws IOException//��ͳ�Ƶ���Ϣ�����ָ�����ļ���

```
### ContainStringFile��Ҳ��һ���ļ��������ڲ���һ���ļ��µ������ļ����Ƿ���һ��ָ�����ַ���
1. ������
```java
  public String fileList;//�ǰ���ָ���ַ����������ļ��ľ���·��
```
```java
 public void findString(File filename,String string) throws IOException//��������ͳ�����ļ���File�����ļ�File��    
// �İ���string���ļ��ľ���·��
```
#### �����ļ� testSevenContainStringFileһ�����
## ����˵��
* ��NumberOfstatistical��������������Ļ�Ϻ���ʽ�ڽ��������ڵ�ǰĿ¼�У��ļ��������Լ�ָ��
* ��ContainStringFile:�����˲����ļ���testSevenContainStringFile����ѯ���ַ���Ϊ��i love you�����ҽ�����������Ļ��������ļ��ľ���·����
* 