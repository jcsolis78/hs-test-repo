package com.hs.test.service.hstestservice;

import com.hs.test.service.hstestservice.service.ITestHsSoftware;
import com.hs.test.service.hstestservice.service.impl.TestHsSoftware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class HsTestServiceApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(HsTestServiceApplication.class, args);

        TestHsSoftware hsSoftware = new TestHsSoftware();

        //Punto 1
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,0,1,0,0,0,1,1));
        System.out.println(hsSoftware.orderArrays(arrayList, 2));

        //Punto 2
        System.out.println(hsSoftware.maxNumber(5,12,8));


        //Punto 3
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(Arrays.asList(15,7,2,1,5,9,8,7,24,50));
        System.out.println(hsSoftware.orderArrays(numberList));

        //Punto 4
        System.out.println(hsSoftware.getStringText("Heinsohn","soh"));


    }

}
