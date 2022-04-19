package com.mycompany.queue_problem;

/**
 *
 * @author Washington Yandun @WashingtonYandun
 */
public class Student {
    String name;
    String cedula;
    String bannerID;

    public Student(String name, String identificadtion, String bannerID) {
        this.name = name;
        this.cedula = identificadtion;
        this.bannerID = bannerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getBannerID() {
        return bannerID;
    }

    public void setBannerID(String bannerID) {
        this.bannerID = bannerID;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", identificadtion=" + cedula + ", bannerID=" + bannerID + '}';
    }
    
    
}
