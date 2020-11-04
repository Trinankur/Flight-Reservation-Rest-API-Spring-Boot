package com.havemytrip.flightbooking.controller_v1;

import com.havemytrip.flightbooking.dto.mapper.ScheduleDTOMapper;
import com.havemytrip.flightbooking.dto.model.ScheduleDTO;
import com.havemytrip.flightbooking.model.Schedule;
import com.havemytrip.flightbooking.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SearchController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/flight")
    public List<ScheduleDTO> getFlightSchedule(@RequestParam("src") String src,
                                               @RequestParam("dest") String dest,
                                               @RequestParam("dot") String dot) {

        List<ScheduleDTO> scheduleDTOList = new ArrayList<>();

        List<Schedule> scheduleList = scheduleService.getFlightSchedule(src, dest, dot);

        for(Schedule theSchedule : scheduleList) {
            scheduleDTOList.add(ScheduleDTOMapper.mapToSchedule(theSchedule));
        }

        return scheduleDTOList;
    }

}
