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
//    @Qualifier("getCinemaService")
//    public void setCinemaService( CinemaService cinemaService) {
//        this.cinemaService = cinemaService;
//    }


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



    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
