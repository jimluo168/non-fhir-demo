package com.nonfhir.example.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @className: MyPatientController
 * @description: TODO 类描述
 * @author: Jim Luo
 * @date: 2022/6/9
 **/
@RestController
@RequestMapping("/MyPatient")
public class MyPatientController {

    @GetMapping("")
    public String search(String name,String gender,String identifier,String[] birthdate) throws IOException {
        InputStream in = getClass().getClassLoader().getResourceAsStream("ha-data/MyPatient_search.json");
        return IOUtils.toString(in, StandardCharsets.UTF_8);
    }
}
