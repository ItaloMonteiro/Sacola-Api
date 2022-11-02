package me.dio.sacolaapi.service;

import me.dio.sacolaapi.model.Item;
import me.dio.sacolaapi.model.Sacola;

public interface SacolaService {
    Item incluirItemNaSacola();
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
