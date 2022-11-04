package me.dio.sacolaapi.resource;

import lombok.RequiredArgsConstructor;
import me.dio.sacolaapi.model.Item;
import me.dio.sacolaapi.resource.dto.ItemDto;
import me.dio.sacolaapi.service.SacolaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ifood-devweek/sacolas")
@RequiredArgsConstructor
public class SacolaResource {
    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemNaSacola(ItemDto itemDto){
        return sacolaService.incluirItemNaSacola(itemDto);
    }
}
