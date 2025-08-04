package com.students.profile.services;

import com.students.profile.beans.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "STUDENTS-RESULTS",path = "/results",fallback = ResultFetcherFallback.class)
public interface ResultFetcher {
    @GetMapping("/")
    public List<Result> getResult();
}
