package com.example.mobiliteinternational.service.mobiliteInternational;

import com.example.mobiliteinternational.entity.MobiliteInternational;

import java.util.List;

public interface IMobiliteInternationalService {
    MobiliteInternational addMobiliteInternational(MobiliteInternational mobiliteInternational);

    MobiliteInternational UpdateMobiliteInternational(MobiliteInternational mobiliteInternational);

    void deleteMobiliteInternational(int idMobiliteInternational);

    List<MobiliteInternational> findAllMobiliteInternational();

    MobiliteInternational findByIdMobiliteInternational(int idMobiliteInternational);


}
