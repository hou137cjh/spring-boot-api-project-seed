package com.hzq.express.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hzqi
 * @Description
 * @Date 14:24 2020/4/20
 */
@Controller
public class ThymeleafController {


    @RequestMapping("/index1")
    public String index1(Model model) {
        ArrayList<Article> list = new ArrayList<>();
        list.add(new Article("Async：简洁优雅的异步之道", "在异步处理方案中，目前最为简洁优雅的便是async函数（以下简称A函数）。", "www.baidu.com"));
        list.add(new Article("H5 前端性能测试实践", "H5 页面发版灵活，轻量，又具有跨平台的特性，在业务上有很多应用场景。", "www.baidu.com"));
        list.add(new Article("学习Python的建议", "Python是最容易入门的编程语言。", "www.baidu.com"));
        model.addAttribute("articleList", list);
        return "index1";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        return "index";
    }

    class Article {

        private String title;
        private String content;
        private String url;

        public Article(String title, String content, String url) {
            this.title = title;
            this.content = content;
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
