package com.spring.templates.querydsl;

import com.spring.templates.domain.dtos.CategoryRecipes;
import com.spring.templates.repositories.custom.CategoryDtoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class QueryDslService {
    private final CategoryDtoRepository categoryDtoRepository;

    //    @PostConstruct
    public void test() {
        log.info("############### Running QueryDSL ################");
//        List<CategoryRecipes> allRecipesByCategory = categoryDtoRepository.getAllRecipesByCategory();
        CategoryRecipes recipes1 = categoryDtoRepository.getAllRecipesByCategoryRecordMapper().get(0);
        CategoryRecipes recipes2 = categoryDtoRepository.getAllRecipesByCategoryFetchTo().get(0);
        log.info("#############################################");
    }
}
