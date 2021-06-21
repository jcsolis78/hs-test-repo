package com.hs.test.service.hstestservice.service.impl;

import com.hs.test.service.hstestservice.service.ITestHsSoftware;

import java.util.*;
import java.util.stream.Collectors;

public class TestHsSoftware implements ITestHsSoftware {

    private final int VALUE_REFERENCE = 1;
    private ArrayList<Integer> arrayResults = new ArrayList<>();

    @Override
    public ArrayList<Integer> orderArrays(ArrayList<Integer> numberList, Integer iteration) {
        ArrayList<Integer> integers = numberList;

        try {
            for (int itx = 0; itx < iteration; itx++) {
                for (int i = 0; i < integers.size(); i++) {
                    if (getPreviousValue(integers, i).equals(getNextValue(integers, i))) {
                        arrayResults.add(0);
                    } else {
                        arrayResults.add(1);
                    }
                }

                integers.clear();
                integers.addAll(arrayResults);
                arrayResults.clear();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return integers;
    }

    @Override
    public Integer maxNumber(Integer number1, Integer number2, Integer number3) throws Exception {
        try {
            return Math.max(Math.max(number1, number2), Math.max(number2, number3));
        }catch (Exception e){
            throw new Exception("Error: " + e.getLocalizedMessage());
        }
    }

    @Override
    public List<Integer> orderArrays(ArrayList<Integer> integers) {

        List<Integer> parList = new ArrayList<>();
        List<Integer> imparList = new ArrayList<>();
        List<Integer> resultNumbers = new ArrayList<>();

        try {
            integers.stream()
                    .forEach(number -> {
                        if (number % 2 == 0) {
                            parList.add(number);
                        } else {
                            imparList.add(number);
                        }
                    });


            resultNumbers.addAll(parList.stream().sorted().collect(Collectors.toList()));
            resultNumbers.addAll(imparList.stream().sorted().collect(Collectors.toList()));
        }catch (Exception e){
            e.printStackTrace();
        }

        return resultNumbers;
    }

    @Override
    public String getStringText(String nombreEmpresa, String buscar){
        int index = nombreEmpresa.indexOf(buscar);
        return index<0 ? "No Exitoso" : nombreEmpresa.substring(index, index + buscar.length()).equals(buscar) == true ? "Exitoso" : "No encontrado";
    }

    private Integer getPreviousValue(ArrayList<Integer> integers, int index){
        Integer value = 0;
        int indexReference = index - VALUE_REFERENCE;
        if(indexReference >= 0){
            value = integers.get(indexReference);
        }
        return value;
    }

    private Integer getNextValue(ArrayList<Integer> integers, int index){
        Integer value = 0;
        int indexReference = index + VALUE_REFERENCE;
        if(indexReference < integers.size()){
            value = integers.get(indexReference);
        }
        return value;
    }




}
