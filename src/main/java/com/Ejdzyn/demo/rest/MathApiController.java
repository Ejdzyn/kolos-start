package com.Ejdzyn.demo.rest;

import com.Ejdzyn.demo.dto.MathDto;
import com.Ejdzyn.demo.service.MathService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MathApiController.class);

    @Autowired
    MathService mathService;

    @RequestMapping(value="/test", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> calculate(@RequestBody MathDto mathDto) {
        LOGGER.info("--- x: {}, y: {}", mathDto.getX(),mathDto.getY());

        if(mathService.checkSquare(mathDto.getX(), mathDto.getY())) {
            LOGGER.info(String.valueOf(mathDto.getX()));
            return new ResponseEntity<>(HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
