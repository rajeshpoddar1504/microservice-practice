package com.students.profile.services;

import com.students.profile.beans.Result;
import com.students.profile.beans.Subjects;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResultFetcherFallback implements ResultFetcher{
    @Override
    public List<Result> getResult() {
        return List.of(new Result(-1,false,List.of(new Subjects("fall",404))));
    }
}
