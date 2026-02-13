package gb;

import y7.u0;

/* loaded from: classes2.dex */
public abstract class d implements Ac.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17483a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public final void a(e eVar) {
        try {
            b(eVar);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            u0.L(th);
            com.bumptech.glide.d.t(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(e eVar);
}
