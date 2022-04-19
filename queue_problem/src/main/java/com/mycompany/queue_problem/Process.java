package com.mycompany.queue_problem;

/**
 *
 * @author Washington Yandun @WashingtonYandun
 */
public class Process {
    int quantum = 35;
    String identification;
    Student student;
    int type;

    public Process(int Quantum, String identification, Student student, int type) {
        this.quantum = Quantum;
        this.identification = identification;
        this.student = student;
        this.type = type;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int Quantum) {
        this.quantum = Quantum;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getCedula() {
        return this.student.cedula;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return  "[ Identification: " + identification +
                ", Quantum: " + quantum +
                ", Cedula: " + student.cedula +
                ", Type: " + type + " ]";
    }
}
