package com.reservation.controller;

import com.reservation.entity.CinemaEntity;
import com.reservation.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ClassController {

    @Autowired  //говорит спрингу, чтобы он автоматически нашёл сервис слой
   // @Qualifier("getCinemaService")
    private CinemaService cinemaService;

   // @Autowired(required = false)               //Конструкция require=false сообщает фреймворку о том, что наличие соответствующего bean'а не является обязательным при компиляции программы.
   // @Qualifier(value = "cinemaServiceImpl")       //С помощью аннотации @Qualifier можно отметить конкретного кандидата для автозаполнения если кандидатов несколько

   @GetMapping("/hello")
   public String hello(){
       return "hello";  //треннировочный
   }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/cinema")
    //public @ResponseBody String getAllCinema(Model model){ // 1:32:30 Разработка MVC приложения на Java за два часа | Компьютерная школа Hillel
    public String getAllCinema(Model model){
      //  model.addAttribute("cinema", new CinemaEntity());
        model.addAttribute("listCinema", cinemaService.getAll());   //ITVDN: Знакомство с серверной частью Enterprise систем Java 32:00
        return "cinemaList";
    }

    @GetMapping("/createCinema")
    public String createCinemaPage(){
        return "createCinema";
    }
            //добавить проверку существования сущности. на случай, если добавляемая сущность уже существует.
    @PostMapping("/createCinema")
    public String createCinema(@ModelAttribute("cinema") CinemaEntity cinemaEntity){
        cinemaService.create(cinemaEntity);
        return "redirect:/cinema";
    }

    @GetMapping("/deleteCinema/{id}")
    public String deleteCinema(@PathVariable("id") int id){
        cinemaService.delete(id);
        return "redirect:/cinema";
    }

    @GetMapping("/updateCinema/{id}")
    public String updateCinema(@PathVariable("id") int id, Model model){
        model.addAttribute("cinema", cinemaService.read(id));
        return "updateCinema";
    }

    @PostMapping("/updateCin")
    public String updateCinema(@ModelAttribute("cinema") CinemaEntity cinemaEntity){
        cinemaService.update(cinemaEntity);
        return "redirect:/cinema" ;
    }

    @GetMapping("/cinema/{id}")
    public String read(@PathVariable("id") int id, Model model){
        model.addAttribute("cinema", cinemaService.read(id));
        return "showCinemaInfo";
    }


}
