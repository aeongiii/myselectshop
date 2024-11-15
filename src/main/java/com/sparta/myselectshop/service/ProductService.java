package com.sparta.myselectshop.service;

import com.sparta.myselectshop.dto.ProductRequestDto;
import com.sparta.myselectshop.dto.ProductResponseDto;
import com.sparta.myselectshop.entity.Product;
import com.sparta.myselectshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    // 저장
    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        // requestDto 내용을 새로 만든 Product 객체에 채우면서 레포지토리에 저장함.
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }
}
