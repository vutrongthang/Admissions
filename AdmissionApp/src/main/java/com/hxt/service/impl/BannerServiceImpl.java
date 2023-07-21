/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.service.impl;

import com.hxt.pojo.Banners;
import com.hxt.repository.BannerRepository;
import com.hxt.service.BannerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vutrongthang
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    BannerRepository bannerRepository;

    @Override
    public List<Banners> getBannerses() {
        return this.bannerRepository.getBannerses();
    }

}
