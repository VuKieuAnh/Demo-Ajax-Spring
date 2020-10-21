package com.codegym.service.province;

import com.codegym.model.Province;
import com.codegym.repository.IProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    private IProvinceRepository provinceService;

    @Override
    public Iterable<Province> findAll() {
        return provinceService.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceService.findOne(id);
    }

    @Override
    public void update(Province model) {
        provinceService.save(model);
    }

    @Override
    public void save(Province model) {
        provinceService.save(model);
    }

    @Override
    public void remove(Long id) {
        provinceService.delete(id);
    }
}
