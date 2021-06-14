package br.com.leone.matchers;

import br.com.leone.matchers.DataDiferencaDiasMatcher;
import br.com.leone.matchers.DiaSemanaMatcher;

import java.util.Calendar;

public class MatchersProprios {

	public static DiaSemanaMatcher caiEm(Integer diaSemana) {
		return new DiaSemanaMatcher(diaSemana);
	}
	
	public static DiaSemanaMatcher caiNumaSegunda(){
		return new DiaSemanaMatcher(Calendar.MONDAY);
	}
	
	public static DataDiferencaDiasMatcher ehHojeComDiferencaDias(Integer qtdDias) {
		return new DataDiferencaDiasMatcher(qtdDias);
	}

	public static DataDiferencaDiasMatcher ehHoje() {
		return new DataDiferencaDiasMatcher(0);
	}
}
