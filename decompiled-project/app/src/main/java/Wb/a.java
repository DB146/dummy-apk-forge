package Wb;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a extends Vb.a {
    @Override // Vb.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        l.d(current, "current(...)");
        return current;
    }
}
