package com.challenge.controllers;

import com.challenge.models.RequestModel;
import com.challenge.models.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryanhill on 1/5/17.
 */

@RestController
public class ControllerAPI {

    @RequestMapping(value="/challenge", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ResponseModel>> postResponse(@RequestBody RequestModel requestModel){

        final String me = "ME";
        final String ms3 = "MS3";
        final String ms3me = "MS3 and ME";

        String num1 = requestModel.getNum1();
        String num2 = requestModel.getNum2();

        int var1 = Integer.parseInt(num1);
        int var2 = Integer.parseInt(num2);
        int size = var2 - var1;

        List<ResponseModel> responseModels = new ArrayList<>();

        for(int i=0; i<=size; i++){
            ResponseModel responseModel = new ResponseModel();
            responseModel.setIndex(var1);

            if(var1%3 != 0 && var1%7 != 0){
                responseModel.setValue("");
            }
            if(var1%3 == 0 && var1%7 != 0){
                responseModel.setValue(me);
            }
            if(var1%7 == 0 && var1%3 != 0){
                responseModel.setValue(ms3);
            }
            if(var1%3 ==0 && var1%7 == 0){
                responseModel.setValue(ms3me);
            }

            responseModels.add(responseModel);
            var1++;
        }
        return new ResponseEntity<List<ResponseModel>>(responseModels, HttpStatus.OK);
    }
}
