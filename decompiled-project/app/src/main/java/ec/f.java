package ec;

import cc.InterfaceC0942l;
import hc.AbstractC1273a;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final l f16872a = new l(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f16873b = AbstractC1273a.k(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c, reason: collision with root package name */
    public static final int f16874c = AbstractC1273a.k(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d, reason: collision with root package name */
    public static final R7.a f16875d;

    /* renamed from: e, reason: collision with root package name */
    public static final R7.a f16876e;

    /* renamed from: f, reason: collision with root package name */
    public static final R7.a f16877f;
    public static final R7.a g;

    /* renamed from: h, reason: collision with root package name */
    public static final R7.a f16878h;

    /* renamed from: i, reason: collision with root package name */
    public static final R7.a f16879i;
    public static final R7.a j;
    public static final R7.a k;

    /* renamed from: l, reason: collision with root package name */
    public static final R7.a f16880l;

    /* renamed from: m, reason: collision with root package name */
    public static final R7.a f16881m;

    /* renamed from: n, reason: collision with root package name */
    public static final R7.a f16882n;

    /* renamed from: o, reason: collision with root package name */
    public static final R7.a f16883o;

    /* renamed from: p, reason: collision with root package name */
    public static final R7.a f16884p;

    /* renamed from: q, reason: collision with root package name */
    public static final R7.a f16885q;

    /* renamed from: r, reason: collision with root package name */
    public static final R7.a f16886r;

    /* renamed from: s, reason: collision with root package name */
    public static final R7.a f16887s;

    static {
        int i7 = 28;
        f16875d = new R7.a("BUFFERED", i7);
        f16876e = new R7.a("SHOULD_BUFFER", i7);
        f16877f = new R7.a("S_RESUMING_BY_RCV", i7);
        g = new R7.a("RESUMING_BY_EB", i7);
        f16878h = new R7.a("POISONED", i7);
        f16879i = new R7.a("DONE_RCV", i7);
        j = new R7.a("INTERRUPTED_SEND", i7);
        k = new R7.a("INTERRUPTED_RCV", i7);
        f16880l = new R7.a("CHANNEL_CLOSED", i7);
        f16881m = new R7.a("SUSPEND", i7);
        f16882n = new R7.a("SUSPEND_NO_WAITER", i7);
        f16883o = new R7.a("FAILED", i7);
        f16884p = new R7.a("NO_RECEIVE_RESULT", i7);
        f16885q = new R7.a("CLOSE_HANDLER_CLOSED", i7);
        f16886r = new R7.a("CLOSE_HANDLER_INVOKED", i7);
        f16887s = new R7.a("NO_CLOSE_CAUSE", i7);
    }

    public static final boolean a(InterfaceC0942l interfaceC0942l, Object obj, hc.p pVar) {
        R7.a e2 = interfaceC0942l.e(obj, pVar);
        if (e2 == null) {
            return false;
        }
        interfaceC0942l.j(e2);
        return true;
    }
}
