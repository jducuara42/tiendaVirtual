package com.tiendavirtual.tiendavirtual.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class TiendaVirtualController
{
    @GetMapping("/hola")
    public String saludar()
    {
        return "Hola mundo!!!! \uD83D\uDC19";
    }
}
