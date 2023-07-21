/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.service.impl;

import com.hxt.pojo.AdmissionInfo;
import com.hxt.repository.AdmissionRepository;
import com.hxt.service.AdmissionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vutrongthang
 */
@Service
public class AdmissionServiceImpl implements AdmissionService {

    @Autowired
    AdmissionRepository admissionRepository;

    @Override
    public List<AdmissionInfo> getAdmissionInfos() {
        return this.admissionRepository.getAdmissionInfos();
    }

}
