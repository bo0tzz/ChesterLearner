package me.bo0tzz.chesterlearner;

import pro.zackpollard.telegrambot.api.TelegramBot;

/**
 * Created by bo0tzz on 1-6-2016.
 */
public class ChesterLearner {
    private final TelegramBot bot;

    public ChesterLearner(String key) {
        this.bot = TelegramBot.login(key);
        if (bot == null) {
            System.exit(-1);
        }
        bot.getEventsManager().register(new ChesterLearnerListener(this));
        bot.startUpdates(true);
        while (true) {
            try {
                Thread.sleep(1000000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ChesterLearner(args[0]);
    }

    public TelegramBot getBot() {
        return bot;
    }

}
