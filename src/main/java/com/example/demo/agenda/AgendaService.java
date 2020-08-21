package com.example.demo.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AgendaService {
	
	@Autowired
	AgendaRepository agendaRepository;
	
	public Agenda insert(Agenda agenda) {
		return agendaRepository.save(agenda);
	}
	
	public Agenda actualizar(Agenda agenda) {
		Agenda agendaEncontrada = agendaRepository.findById(agenda.getId()).get();
		
		agendaEncontrada.setEmpleado(agenda.getEmpleado());
		agendaEncontrada.setDia(agenda.getDia());
		agendaEncontrada.setActividad1(agenda.getActividad1());
		agendaEncontrada.setActividad2(agenda.getActividad2());
		agendaEncontrada.setActividad3(agenda.getActividad3());
		agendaEncontrada.setActividad4(agenda.getActividad4());
		agendaEncontrada.setActividad5(agenda.getActividad5());
		agendaEncontrada.setActividad6(agenda.getActividad6());
		agendaEncontrada.setActividad7(agenda.getActividad7());
		agendaEncontrada.setActividad8(agenda.getActividad8());
		agendaEncontrada.setActividad9(agenda.getActividad9());
		agendaEncontrada.setActividad10(agenda.getActividad10());
		agendaEncontrada.setActividad11(agenda.getActividad11());
		agendaEncontrada.setActividad12(agenda.getActividad12());
		agendaEncontrada.setActividad13(agenda.getActividad13());
		agendaEncontrada.setActividad14(agenda.getActividad14());
		agendaEncontrada.setActividad15(agenda.getActividad15());
		agendaEncontrada.setActividad16(agenda.getActividad16());
		agendaEncontrada.setActividad17(agenda.getActividad17());
		agendaEncontrada.setActividad18(agenda.getActividad18());
		agendaEncontrada.setActividad19(agenda.getActividad19());
		agendaEncontrada.setActividad20(agenda.getActividad20());
		agendaEncontrada.setActividad21(agenda.getActividad21());
		agendaEncontrada.setActividad22(agenda.getActividad22());
		agendaEncontrada.setActividad23(agenda.getActividad23());
		agendaEncontrada.setActividad24(agenda.getActividad24());
		return agendaRepository.save(agendaEncontrada);
	}
	
	public void borrar(Long id) {
		agendaRepository.deleteById(id);
	}
	
	public Integer obtenerPrimerDiaDelMes(Integer year, Integer mes) {
		Integer a = (14 - mes) / 12;
		Integer y = year - a;
		Integer m = mes + 12 * a - 2;
		Integer dia = 1, d;
		d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
		return (d);
	}
	
	public boolean esBisiesto(Integer year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
	
	public Integer obtenerDiasDelMes(Integer year, Integer mes) {
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;
		} else if (mes == 2) {
			if (esBisiesto(year)) {
				return 29;
			} else {
				return 28;
			}
		} else {
			return 30;
		}
	}

}
