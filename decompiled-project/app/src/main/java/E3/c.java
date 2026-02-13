package E3;

import W3.o;
import java.util.ArrayDeque;
import x3.C2261c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f3523a;

    public c(int i7) {
        switch (i7) {
            case 1:
                char[] cArr = o.f10619a;
                this.f3523a = new ArrayDeque(0);
                return;
            default:
                this.f3523a = new ArrayDeque();
                return;
        }
    }

    public synchronized void a(C2261c c2261c) {
        c2261c.f26183b = null;
        c2261c.f26184c = null;
        this.f3523a.offer(c2261c);
    }
}
