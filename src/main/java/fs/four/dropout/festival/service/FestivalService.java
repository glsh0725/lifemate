package fs.four.dropout.festival.service;

import fs.four.dropout.festival.vo.FestivalVO;

import java.util.List;

public interface FestivalService {
    List<FestivalVO> getAllFestivals();
    List<FestivalVO> getFestivalsByPage(int page, int pageSize);
}