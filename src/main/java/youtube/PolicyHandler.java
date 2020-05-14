package youtube;

import youtube.config.kafka.KafkaProcessor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeletedVideo_DeleteComment(@Payload DeletedVideo deletedVideo){
        // 동영상 삭제하면 댓글 삭제되도록


        if(deletedVideo.isMe()){
            System.out.println("##### CommentServices listener DeleteComment : " + deletedVideo.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeletedChannel_DeleteComment(@Payload DeletedChannel deletedChannel){

        if(deletedChannel.isMe()){
            System.out.println("##### CommentServices listener DeleteComment : " + deletedChannel.toJson());
        }
    }

}
