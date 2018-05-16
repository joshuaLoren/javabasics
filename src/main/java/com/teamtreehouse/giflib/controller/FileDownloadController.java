package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/downloads")
public class FileDownloadController
{
    @RequestMapping("/sourcecode/{fileName:.+}")
    public void downloadPDFResource( HttpServletRequest request,
                                     HttpServletResponse response,
                                     @PathVariable("fileName") String fileName)
    {
        /**
         *  Get stackfile
         */
        //Path stackfile = Paths.get("C:\\Users\\Joshua\\Desktop\\webprojects\\javabasics\\src\\main\\resources\\downloads\\sourcecode\\genericstack.java");
        Path stackfile = Paths.get("javabasics\\src\\main\\resources\\downloads\\sourcecode\\genericstack.java");
        System.out.println("And here " + stackfile);
        if (Files.exists(stackfile))
        {
            System.out.println("Inside if statement");
            response.setContentType("APPLICATION/OCTET-STREAM");
            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
            try
            {
                System.out.println("Inside Try statement");
                Files.copy(stackfile, response.getOutputStream());
                response.getOutputStream().flush();
            }
            catch (IOException ex) {
                System.out.println("Inside catch statement");
                ex.printStackTrace();
            }
        }

        /**
         *  Get list file
         */

        Path listfile = Paths.get("C:\\Users\\Joshua\\Desktop\\webprojects\\javabasics\\src\\main\\resources\\downloads\\sourcecode\\mylinkedlist.java");
        System.out.println("And here " + listfile);
        if (Files.exists(listfile))
        {
            System.out.println("Inside if statement");
            response.setContentType("APPLICATION/OCTET-STREAM");
            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
            try
            {
                System.out.println("Inside Try statement");
                Files.copy(listfile, response.getOutputStream());
                response.getOutputStream().flush();
            }
            catch (IOException ex) {
                System.out.println("Inside catch statement");
                ex.printStackTrace();
            }
        }

        /**
         * Get recursion file
         */
        Path recursionfile = Paths.get("C:\\Users\\Joshua\\Desktop\\webprojects\\javabasics\\src\\main\\resources\\downloads\\sourcecode\\recursionexample.java");
        System.out.println("And here " + recursionfile);
        if (Files.exists(recursionfile))
        {
            System.out.println("Inside if statement");
            response.setContentType("APPLICATION/OCTET-STREAM");
            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
            try
            {
                System.out.println("Inside Try statement");
                Files.copy(recursionfile, response.getOutputStream());
                response.getOutputStream().flush();
            }
            catch (IOException ex) {
                System.out.println("Inside catch statement");
                ex.printStackTrace();
            }
        }

        /**
         *  Get Tree File
         */
        Path treefile = Paths.get("C:\\Users\\Joshua\\Desktop\\webprojects\\javabasics\\src\\main\\resources\\downloads\\sourcecode\\binarytree.java");
        System.out.println("And here " + treefile);
        if (Files.exists(treefile))
        {
            System.out.println("Inside if statement");
            response.setContentType("APPLICATION/OCTET-STREAM");
            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
            try
            {
                System.out.println("Inside Try statement");
                Files.copy(treefile, response.getOutputStream());
                response.getOutputStream().flush();
            }
            catch (IOException ex) {
                System.out.println("Inside catch statement");
                ex.printStackTrace();
            }
        }

        /**
         *  Get queue file
         */
        Path queuefile = Paths.get("C:\\Users\\Joshua\\Desktop\\webprojects\\javabasics\\src\\main\\resources\\downloads\\sourcecode\\queuedemo.java");
        System.out.println("And here " + queuefile);
        if (Files.exists(queuefile))
        {
            System.out.println("Inside if statement");
            response.setContentType("APPLICATION/OCTET-STREAM");
            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
            try
            {
                System.out.println("Inside Try statement");
                Files.copy(queuefile, response.getOutputStream());
                response.getOutputStream().flush();
            }
            catch (IOException ex) {
                System.out.println("Inside catch statement");
                ex.printStackTrace();
            }
        }

        /**
         *  Get Collection File
         */
        Path collectionfile = Paths.get("C:\\Users\\Joshua\\Desktop\\webprojects\\javabasics\\src\\main\\resources\\downloads\\sourcecode\\project_1_JavaFXNewNew.java");
        System.out.println("And here " + collectionfile);
        if (Files.exists(collectionfile))
        {
            System.out.println("Inside if statement");
            response.setContentType("APPLICATION/OCTET-STREAM");
            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
            try
            {
                System.out.println("Inside Try statement");
                Files.copy(collectionfile, response.getOutputStream());
                response.getOutputStream().flush();
            }
            catch (IOException ex) {
                System.out.println("Inside catch statement");
                ex.printStackTrace();
            }
        }


    }
}