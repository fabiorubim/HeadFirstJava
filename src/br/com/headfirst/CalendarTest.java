package br.com.headfirst;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();//Calendar é uma classe abstrata, getInstance FABRICA um GregorianCalendar, é o pattern FACTORY
		
		System.out.println("Data antiga - Definida no sistema");
		System.out.println("Dia do mês: "+calendar.get(Calendar.DAY_OF_MONTH)); //Calendar.DAY_OF_MONTH é uma constante referente ao dia do mes
		System.out.println("Dia da semana: "+calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("Hora: "+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutos: "+calendar.get(Calendar.MINUTE));
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("Data definida 'manualmete'");
		
		calendar.set(2016, Calendar.DECEMBER, 25, 23, 50);//O mês começo no 0, logo dezembro é 11
		
		System.out.println("Ano    : "+calendar.get(Calendar.YEAR));
		System.out.println("Mes    : "+calendar.get(Calendar.MONTH));
		System.out.println("Dia    : "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hora   : "+calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minutos: "+calendar.get(Calendar.MINUTE));
		
		System.out.println("-----------------------------------------------------------------------");
		
		calendar.add(Calendar.YEAR, 1); //Adiciona 1 anos.
		
		System.out.println("Mais 1 ano: "+calendar.get(Calendar.YEAR));
		
		calendar.add(Calendar.YEAR, -2);
		
		System.out.println("Menos 2 anos: "+calendar.get(Calendar.YEAR));
		
		System.out.println("--------------------------------COMPARANDO DATAS---------------------------------------");
		
		Calendar diaDasCriancas = Calendar.getInstance();
		diaDasCriancas.set(2016, Calendar.OCTOBER,12);
		Calendar diaDeNatal = Calendar.getInstance();
		diaDeNatal.set(2016,Calendar.DECEMBER,25);
		
		//O Natal vem antes do dia das crianças?
		System.out.println("O Natal vem antes do dia das crianças? "+diaDeNatal.before(diaDasCriancas));
		
		//O natal ve depois do dia das crianças?
		System.out.println("O natal vem depois do dia das crianças? "+diaDeNatal.after(diaDasCriancas));
		
		System.out.println("-----------------------------------------------------------------------");
		//Diferenca entre datas em dias, usando milissegundos.
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2016,Calendar.APRIL,13);
		Calendar c2 = Calendar.getInstance();
		c2.set(2016,Calendar.AUGUST,17);
		
		long m1 = c1.getTimeInMillis();
		long m2 = c2.getTimeInMillis();
		
		System.out.println("Diferença em dias: "+(m2-m1)/(24*60*60*1000));
		
		System.out.println("-----------------------------------------------------------------------");
		//Pegar um Date de um Calendar ou usar com Date para definir a data em um Calendar.
		//Com isso você pode operar as datas usando Calendar(mais novo) mesmo que as APIs usem objetos do tipo Date(mais antigo) 
		//como no caso do java.sql
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		//Definir a data de um Calendar com um Date
		cal.setTime(d);
		
		System.out.println("--------------------------------SimpleDateFormat---------------------------------------");
		
		String sData = "08/09/2016";
		Date data = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			data = sdf.parse(sData);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(sdf.format(data));
		
		
	}
}
