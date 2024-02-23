package ru.Artem_Vorov.level3.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class L3l2_GenericBuilder<T> {
    private final Supplier<T> inst;

    private List<Consumer<T>> instModifiers = new ArrayList<>();

    public L3l2_GenericBuilder(Supplier<T> inst) {
        this.inst = inst;
    }

    public static <T> L3l2_GenericBuilder<T> of(Supplier<T> instatiator) {
        return new L3l2_GenericBuilder<>(instatiator);
    }

    public <U> L3l2_GenericBuilder<T> with(BiConsumer<T, U> consumer, U value) {
        Consumer<T> c = instance -> {
            if (Optional.ofNullable(value).isEmpty()) {
                return;
            }
            consumer.accept(instance, value);
        };
        instModifiers.add(c);
        return this;
    }

    public T build() {
        T value = inst.get();
        instModifiers.forEach(modifier -> modifier.accept(value));
        instModifiers.clear();
        return value;
    }
}
