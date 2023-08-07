package com.example.myjavaee.controller;
import com.example.myjavaee.service.BookService;
import com.example.myjavaee.unity.Books;
import com.example.myjavaee.unity.MyPage;
import com.example.myjavaee.unity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@Controller
@RequestMapping("books")
public class BookController {
    @Resource
    private BookService bookService;
    @PostMapping("login")
    public String login(
            @RequestParam(value = "username") String name,
            @RequestParam(value = "password") String passwrod
    ){
        Users users = new Users();
        users.setUserName(name);
        users.setPasswd(passwrod);
        boolean result = bookService.login(users);
        if (result){
            return "redirect:index/1";
        }else {
            return "login-er";
        }
    }
    @GetMapping("index/{page}")
    public String index(Model model,
                        @PathVariable("page") Integer page){
        MyPage myPage = new MyPage();
        myPage.setPage(page);
        myPage.setSize(2);
        MyPage list=bookService.getAllBooks(myPage);
        model.addAttribute("list",list);
        return "index";
    }
    @GetMapping("deleteBookById/{id}/{page}")
    public String deleteBookById(
            @PathVariable("id") Integer id,
            @PathVariable("page") Integer page
    ){
        bookService.deleteBookById(id);
        return "redirect:/books/index/"+page;
    }
}
