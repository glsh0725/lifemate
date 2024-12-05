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
        int pageGroupSize = 10;
        List<FestivalVO> festivals = festivalService.getFestivalsByPage(page, pageSize);

        int totalFestivals = festivalService.getAllFestivals().size();
        int totalPages = (int) Math.ceil((double) totalFestivals / pageSize);

        int currentPageGroup = (page - 1) / pageGroupSize;
        int startPage = currentPageGroup * pageGroupSize + 1;
        int endPage = Math.min(startPage + pageGroupSize - 1, totalPages);

        int prevGroup = (startPage > 1) ? startPage - 1 : 0;
        int nextGroup = (endPage < totalPages) ? endPage + 1 : 0;

        model.addAttribute("festivals", festivals);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        model.addAttribute("startPage", startPage);
        model.addAttribute("endPage", endPage);
        model.addAttribute("prevGroup", prevGroup);
        model.addAttribute("nextGroup", nextGroup);
        return "festival/festival";
    }
}