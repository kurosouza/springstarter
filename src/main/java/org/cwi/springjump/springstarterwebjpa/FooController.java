package org.cwi.springjump.springstarterwebjpa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {
    
    Long id = 1L;

    public FooController() { }

    public Object findById(Long id) {
        return new Object();
    }

}
