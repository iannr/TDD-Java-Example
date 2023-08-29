package Relogio;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

class Relogio {
    private int horas;
    private int minutos;
    private int segundos;

    public Relogio() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    
    

    public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}



	public int getMinutos() {
		return minutos;
	}



	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}



	public int getSegundos() {
		return segundos;
	}



	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}



	public void definirHorario(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void reiniciarMeiaNoite() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public void iniciarCronometro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pressione Enter para iniciar o cronômetro...");
        scanner.nextLine();

        long horaInicio = System.currentTimeMillis();

        System.out.print("Pressione Enter novamente para parar o cronômetro...");
        scanner.nextLine();

        long horaFim = System.currentTimeMillis();
        long millisDecorridos = horaFim - horaInicio;

        int segundosDecorridos = (int) (millisDecorridos / 1000);
        int minutosDecorridos = segundosDecorridos / 60;
        segundosDecorridos %= 60;

        System.out.println("Tempo decorrido do cronômetro: " + minutosDecorridos + " minutos " + segundosDecorridos + " segundos");
    }

    public void imprimirHorario(boolean formato24Horas) {
        LocalTime horarioAtual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato24Horas ? "HH:mm:ss" : "hh:mm:ss a");
        String horarioFormatado = horarioAtual.format(formatter);
        System.out.println("Horário atual: " + horarioFormatado);
    }
}

