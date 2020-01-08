/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examplesping.springDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rahul
 */
@RestController
public class HomePage {
    @RequestMapping("/")
    public String HomePage() throws FileNotFoundException, IOException
    {

        return OP();
    }
    
    public static String OP() throws FileNotFoundException, IOException
    {
                File file = ResourceUtils.getFile("classpath:data.txt");

//Read File Content
                String content = new String(Files.readAllBytes(file.toPath()));
                System.out.println(content);
     return content;   
    }     
    
    @GetMapping("/page2")
    public String page2() throws FileNotFoundException, IOException
    {

        return page2Read();
    }
    
    public static String page2Read() throws FileNotFoundException, IOException
    {
                File file = ResourceUtils.getFile("classpath:data_1.txt");

//Read File Content
                String content = new String(Files.readAllBytes(file.toPath()));
                System.out.println(content);
     return content;   
    }     
}
