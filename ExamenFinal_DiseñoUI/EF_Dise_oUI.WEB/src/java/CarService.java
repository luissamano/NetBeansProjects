/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leondev
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
 
@ManagedBean(name = "contactoService")
@ApplicationScoped
public class CarService {
     
    private final static String[] colors;
     
    private final static String[] brands;
     
    static {
        colors = new String[10];
        colors[0] = "Luis";
        colors[1] = "Martin";
        colors[2] = "Edy";
        colors[3] = "David";
        colors[4] = "Benardo";
        colors[5] = "Sergio";
        colors[6] = "Miguel";
        colors[7] = "Enrique";
        colors[8] = "Hector";
        colors[9] = "Olga";
         
        brands = new String[10];
        brands[0] = "000000000000";
        brands[1] = "111111111111";
        brands[2] = "222222222222";
        brands[3] = "333333333333";
        brands[4] = "444444444444";
        brands[5] = "555555555555";
        brands[6] = "666666666666";
        brands[7] = "777777777777";
        brands[8] = "888888888888";
        brands[9] = "999999999999";
    }
     
    public List<Conctacto> createCars(int size) {
        List<Conctacto> list = new ArrayList<>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Conctacto( getRandomColor(), getRandomBrand() ));
        }
         
        return list;
    }
     
    
    private String getRandomColor() {
        return colors[(int) (Math.random() * 10)];
    }
     
    private String getRandomBrand() {
        return brands[(int) (Math.random() * 10)];
    }
     
   
 
    public List<String> getColors() {
        return Arrays.asList(colors);
    }
     
    public List<String> getBrands() {
        return Arrays.asList(brands);
    }
}   