package com.results.students.controller;

import com.results.students.bean.Result;
import com.results.students.bean.Subjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/results")
public class ResultController {


    @GetMapping("/")
    public List<Result> getResults(){
        List results=List.of(new Result(1,true,List.of(new Subjects("maths",95),new Subjects("science",89))));
        return results;
    }
}

