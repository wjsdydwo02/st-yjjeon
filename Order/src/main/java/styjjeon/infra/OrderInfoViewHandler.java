package styjjeon.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import styjjeon.config.kafka.KafkaProcessor;
import styjjeon.domain.*;

@Service
public class OrderInfoViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private OrderInfoRepository orderInfoRepository;
    //>>> DDD / CQRS
}
