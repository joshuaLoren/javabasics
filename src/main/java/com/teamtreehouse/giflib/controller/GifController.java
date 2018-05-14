/**
 *  This Controller is Called GifController because
 *  it controls the POJO class GIF that is in the model
 *  folder
 *
 */


package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap) {
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs",allGifs);
        return "home"; //home refers to home.html...
        //This is all that thymeleaf needs to find home.html
    }

    /*
        New, non-working code
     */
    @RequestMapping("/gif/{name}") //if someone requests this URI Spring will create an instance of a ModelMap
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifRepository.findByName(name); //make a gif object
        //modelMap.put("gif",gif); //adding ModelMap using put method
        System.out.println(gif.name);
        return gif.getName(); //gif-details is an html file...

    }

    /*
        Old, working code

    @RequestMapping("/gif/{name}") //if someone requests this URI Spring will create an instance of a ModelMap
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifRepository.findByName(name); //make a gif object
        modelMap.put("gif",gif); //adding ModelMap using put method
        return "gif-details"; //gif-details is an html file...
    }

    */

}
