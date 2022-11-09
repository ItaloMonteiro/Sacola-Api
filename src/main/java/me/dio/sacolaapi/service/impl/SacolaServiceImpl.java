package me.dio.sacolaapi.service.impl;

import lombok.RequiredArgsConstructor;
import me.dio.sacolaapi.model.Item;
import me.dio.sacolaapi.model.Sacola;
import me.dio.sacolaapi.repository.SacolaRepository;
import me.dio.sacolaapi.resource.dto.ItemDto;
import me.dio.sacolaapi.service.SacolaService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SacolaServiceImpl implements SacolaService {
    private final SacolaRepository sacolaRepository;

    @Override
    public Item incluirItemNaSacola(ItemDto itemDto) {
        return null;
    }

    @Override
    public Sacola verSacola(Long id) {
        return null;
    }

    @Override
    public Sacola fecharSacola(Long id, int formaPagamento) {
        return null;
    }
}
