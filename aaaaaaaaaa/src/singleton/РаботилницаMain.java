package singleton;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.������;
import abstractfactory.�����;
import abstractfactory.������������������;
import abstractfactory.����������������;
import command.Command;
import command.�������;
import command.�����������������;
import command.��������������;
import command.�������������;
import observer.������;
import observer.��������������;


public class �����������Main 
{
	public static void main(String[] args) 
	{
		���������� connection = ����������.getInstance();
		connection.postMessage(" ������� �� �����! ");
		connection.postMessage(" ������� �� ��������! ");
		
		������� ������� = new �������();
		Command ����������������� = new �����������������(�������);
		Command �������������� = new ��������������(�������);

		������������� ������������� = new �������������();

		�������������.setCommand(�����������������);
		�������������.����������������();

		�������������.setCommand(��������������);
		�������������.����������������();
		
		AbstractFactory ���������������� = FactoryProducer.getFactory("����������������");
		������������������ ������ = ����������������.toyType("������");
		������.produce();
		������������������ ����� = ����������������.toyType("�����");
		�����.produce();
		
		�������������� �������������� = new ��������������();
		������ ������1 = new ������( "������ 1");
		������ ������2 = new ������( "������ 2");
		������ ������3 = new ������( "������ 3");
		
		��������������.g�ToBoard(������1);
		��������������.checkBoard(" ������� �� ��������! ");
		��������������.getToy(������1);
		
		��������������.g�ToBoard(������1);
		��������������.checkBoard(" ������� �� �����! ");
		��������������.getToy(������1);
		
		��������������.g�ToBoard(������2);
		��������������.checkBoard(" ������� �� ��������! ");
		��������������.getToy(������2);
		
		��������������.g�ToBoard(������2);
		��������������.checkBoard(" ������� �� �����! ");
		��������������.getToy(������2);
		
		��������������.g�ToBoard(������3);
		��������������.checkBoard(" ������� �� ��������! ");
		��������������.getToy(������3);
		
		��������������.g�ToBoard(������3);
		��������������.checkBoard(" ������� �� �����! ");
		��������������.getToy(������3);
		
	}
}
