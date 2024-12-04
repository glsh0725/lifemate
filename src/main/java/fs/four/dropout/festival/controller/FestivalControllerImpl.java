package fs.four.dropout.festival.controller;

import fs.four.dropout.festival.service.FestivalService;
import fs.four.dropout.festival.vo.FestivalVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FestivalControllerImpl implements FestivalController {

    private final FestivalService festivalService;

    public FestivalControllerImpl(FestivalService festivalService) {
        this.festivalService = festivalService;
    }

    @Override
    @GetMapping("/festival")
    public String festivalPage(@RequestParam(defaultValue = "1") int page, Model model) {
        int pageSize = 9;
        List<FestivalVO> festivals = festivalService.getFestivalsByPage(page, pageSize);

        int totalFestivals = festivalService.getAllFestivals().size();
        int totalPages = (int) Math.ceil((double) totalFestivals / pageSize);

        model.addAttribute("festivals", festivals);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        return "festival/festival";
    }
}