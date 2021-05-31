package com.frota.gestao.calendario;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class DiaDaSemana {
	
    public static String diaSemana(){
        return new DateFormatSymbols().getWeekdays()[Calendar.getInstance().get(Calendar.DAY_OF_WEEK)];
    }
}


