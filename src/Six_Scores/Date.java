package Six_Scores;
import Six_Scores.DateException;

import java.util.LinkedList;
import java.util.Scanner;

public class Date {

	LinkedList <Integer> longIntegers=new LinkedList<Integer>();
	Scanner inScanner=new Scanner(System .in);
	int flag=1;//����λ
	public int length;//�洢���ֵĳ���
	private Date (String lString ) throws DateException{
		length=longIntegers .size();
	}

	//��дtoString����
	@Override
	public String toString() {
		String  c = "";
		String b="";
		for(int i=longIntegers .size() -1;i>=0;i--) {
			c = b+longIntegers .get(i);
			b=c;
		}
		if(this.flag ==-1)
			return "-"+c ;
		return c;
	}
	//�ж��Ƿ�Ϊһ������
	static Date getInstance(String lString ) throws DateException {
		final Date num=new Date(lString);
		//�洢��ʱ�䵹�Ŵ洢���������
		for(int i=lString .length()-1,k=0;i>=0;i--) {
			//�ж��Ƿ�Ϊ����
			int temp=0;//����¼���������ֵĴ���
			char ch=lString .charAt(i);
			if(Character .isDigit(ch)||ch==','||ch=='-'){//һ����������Щ�������
				if(ch==',') {
					temp++;
					if((temp+k)%3!=1)
						throw new DateException("ǧ�ֺŸ�ʽ�������");
				}
				if(ch=='-') {
					if(i!=0)
						throw new DateException("�����ʽ����");
				}
			}
			else { throw new DateException("�����ʽ����");}
			if(ch!=',')k++;//���ԡ�������Ӱ��
		}
		if(lString .charAt(0)=='-')
			num.flag=-1;//����������λ����
		//��������
		for(int i=lString .length()-1,k=0;i>=0;i--) {
			char ch=lString .charAt(i);
			if((Character .isDigit(ch))) {
				num	.longIntegers .add(k,0);
				num.longIntegers .set(k,  ch-'0');
				k++;//�ǵã�������
			}
		}
		return num;
	}


}
