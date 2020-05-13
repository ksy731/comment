package youtube_ksy;

import youtube_ksy.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeletedVideo_DeleteComment(@Payload DeletedVideo deletedVideo){

        if(deletedVideo.isMe()){
            System.out.println("##### listener DeleteComment : " + deletedVideo.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeletedChannel_DeleteComment(@Payload DeletedChannel deletedChannel){

        if(deletedChannel.isMe()){
            System.out.println("##### listener DeleteComment : " + deletedChannel.toJson());
        }
    }

}
