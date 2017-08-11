/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leondev
 */
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
 
@ManagedBean
@ViewScoped
public class DataGridView implements Serializable {
     
    private List<Conctacto> cars;
     
    private Conctacto selectedCar;
     
    @ManagedProperty("#{carService}")
    private CarService service = new CarService();
     
 
    public  DataGridView() {
        cars = service.createCars(10);
    }
 
    public List<Conctacto> getCars() {
        return cars;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }
 
    public Conctacto getSelectedCar() {
        return selectedCar;
    }
 
    public void setSelectedCar(Conctacto selectedCar) {
        this.selectedCar = selectedCar;
    }
}
