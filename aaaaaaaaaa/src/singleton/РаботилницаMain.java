package singleton;

import abstractfactory.AbstractFactory;
import abstractfactory.FactoryProducer;
import abstractfactory.Колело;
import abstractfactory.Кукла;
import abstractfactory.ПроизведенаИграчка;
import abstractfactory.ФабрикаЗаИграчки;
import command.Command;
import command.Играчка;
import command.ТрябватМиКолелета;
import command.ТрябватМиКукли;
import command.МагическиДуми;
import observer.Джудже;
import observer.МагическаДъска;


public class РаботилницаMain 
{
	public static void main(String[] args) 
	{
		ДядоКоледа connection = ДядоКоледа.getInstance();
		connection.postMessage(" Трябват ми кукли! ");
		connection.postMessage(" Трябват ми колелета! ");
		
		Играчка играчка = new Играчка();
		Command трябватМиКолелета = new ТрябватМиКолелета(играчка);
		Command трябватМиКукли = new ТрябватМиКукли(играчка);

		МагическиДуми магическиДуми = new МагическиДуми();

		магическиДуми.setCommand(трябватМиКолелета);
		магическиДуми.изричанеНаДумите();

		магическиДуми.setCommand(трябватМиКукли);
		магическиДуми.изричанеНаДумите();
		
		AbstractFactory фабрикаЗаИграчки = FactoryProducer.getFactory("ФабрикаЗаИграчки");
		ПроизведенаИграчка колело = ФабрикаЗаИграчки.toyType("КОЛЕЛО");
		колело.produce();
		ПроизведенаИграчка кукла = ФабрикаЗаИграчки.toyType("КУКЛА");
		кукла.produce();
		
		МагическаДъска магическаДъска = new МагическаДъска();
		Джудже джудже1 = new Джудже( "Джудже 1");
		Джудже джудже2 = new Джудже( "Джудже 2");
		Джудже джудже3 = new Джудже( "Джудже 3");
		
		магическаДъска.gоToBoard(джудже1);
		магическаДъска.checkBoard(" Трябват ми колелета! ");
		магическаДъска.getToy(джудже1);
		
		магическаДъска.gоToBoard(джудже1);
		магическаДъска.checkBoard(" Трябват ми кукли! ");
		магическаДъска.getToy(джудже1);
		
		магическаДъска.gоToBoard(джудже2);
		магическаДъска.checkBoard(" Трябват ми колелета! ");
		магическаДъска.getToy(джудже2);
		
		магическаДъска.gоToBoard(джудже2);
		магическаДъска.checkBoard(" Трябват ми кукли! ");
		магическаДъска.getToy(джудже2);
		
		магическаДъска.gоToBoard(джудже3);
		магическаДъска.checkBoard(" Трябват ми колелета! ");
		магическаДъска.getToy(джудже3);
		
		магическаДъска.gоToBoard(джудже3);
		магическаДъска.checkBoard(" Трябват ми кукли! ");
		магическаДъска.getToy(джудже3);
		
	}
}
