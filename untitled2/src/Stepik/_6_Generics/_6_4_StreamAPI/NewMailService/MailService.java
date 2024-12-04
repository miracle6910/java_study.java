package Stepik._6_Generics._6_4_StreamAPI.NewMailService;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {
    private Map<String, List<T>> mailbox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key,Collections.emptyList());
        }

    };
    Map<String, List<T>> getMailBox() {
        return mailbox;
    }
    @Override
    public void accept(Sendable<T> sendable) {
        mailbox.putIfAbsent(sendable.getTo(), new ArrayList<>());
        mailbox.get(sendable.getTo()).add(sendable.getContent());
    }

}