package com.example.mobiliteinternational.service.mobiliteInternational;

import com.example.mobiliteinternational.entity.MobiliteInternational;
import com.example.mobiliteinternational.repository.MobiliteInternationalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MobiliteInternational")
@AllArgsConstructor
public class MobiliteInternationalService implements IMobiliteInternationalService {

    private final MobiliteInternationalRepository mobiliteInternationalRepository;

    @Override
    public MobiliteInternational addMobiliteInternational(MobiliteInternational mobiliteInternational) {
        return null;
    }

    @Override
    public MobiliteInternational UpdateMobiliteInternational(MobiliteInternational mobiliteInternational) {
        return null;
    }

    @Override
    public void deleteMobiliteInternational(int idMobiliteInternational) {

    }

    @Override
    public List<MobiliteInternational> findAllMobiliteInternational() {
        return null;
    }

    @Override
    public MobiliteInternational findByIdMobiliteInternational(int idMobiliteInternational) {
        return null;
    }
}
