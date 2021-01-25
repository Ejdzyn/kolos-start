package com.Ejdzyn.demo.service;

import com.Ejdzyn.demo.repository.MathRepository;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    private final MathRepository mathRepository = new MathRepository();
    public boolean checkSquare(int x, int y) {
        return this.mathRepository.checkSquare(x,y);
    }


}
