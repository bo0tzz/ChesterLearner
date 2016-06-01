package me.bo0tzz.chesterlearner;

import pro.zackpollard.telegrambot.api.event.Listener;
import pro.zackpollard.telegrambot.api.event.chat.message.TextMessageReceivedEvent;

/**
 * Created by bo0tzz on 1-6-2016.
 */
public class ChesterLearnerListener implements Listener {
    private final ChesterLearner chesterLearner;

    public ChesterLearnerListener(ChesterLearner chesterLearner) {
        this.chesterLearner = chesterLearner;
    }

    public void onTextMessageReceived(TextMessageReceivedEvent event) {
        ChesterHandler.process(event.getContent().getContent());
    }
}
