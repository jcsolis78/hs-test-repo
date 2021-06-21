package com.hs.test.service.hstestservice.service;

import java.util.ArrayList;
import java.util.List;

public interface ITestHsSoftware {

    ArrayList<Integer> orderArrays(ArrayList<Integer> integers, Integer iteration);
    Integer maxNumber(Integer number1, Integer number2, Integer number3) throws Exception;
    List<Integer> orderArrays(ArrayList<Integer> integers);
    String getStringText(String nombreEmpresa, String buscar);

}
