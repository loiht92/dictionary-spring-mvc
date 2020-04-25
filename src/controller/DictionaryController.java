package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/home")
    public String getIndex(){
        return "index";
    }
    @GetMapping("/dictionary")
    public String translate(@RequestParam String englishWord, Model model){
        Map<String, String> list = new HashMap<>();
        list.put("Hello", "Xin chào");
        list.put("Cat", "Con mèo");
        list.put("Red", "Màu đỏ");
        list.put("How Are You", "Bạn có khoẻ không");

        String vietnamWord = list.get(englishWord);

//        if (vietnamWord != null){
//            model.addAttribute("englishWord", englishWord);
//            model.addAttribute("vietnamWord", vietnamWord);
//        }else {
//            vietnamWord = "Not Found";
//            model.addAttribute("englishWord", englishWord);
//            model.addAttribute("vietnamWord", vietnamWord);
//        }
//        return "translate";

        if (vietnamWord == null){
            vietnamWord = "Not Found";
        }
        model.addAttribute("englishWord", englishWord);
        model.addAttribute("vietnamWord", vietnamWord);
        return "translate";
    }

}
