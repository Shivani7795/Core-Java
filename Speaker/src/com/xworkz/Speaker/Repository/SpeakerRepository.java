package com.xworkz.Speaker.Repository;

import com.xworkz.Speaker.Dto.SpeakerDto;

public interface SpeakerRepository {
    String persist(SpeakerDto speakerDto);
}
