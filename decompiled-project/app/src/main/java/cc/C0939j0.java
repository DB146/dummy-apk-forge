package cc;

import java.util.concurrent.CancellationException;

/* renamed from: cc.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0939j0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0937i0 f14546a;

    public C0939j0(String str, Throwable th, InterfaceC0937i0 interfaceC0937i0) {
        super(str);
        this.f14546a = interfaceC0937i0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0939j0) {
                C0939j0 c0939j0 = (C0939j0) obj;
                if (!kotlin.jvm.internal.l.a(c0939j0.getMessage(), getMessage()) || !kotlin.jvm.internal.l.a(c0939j0.f14546a, this.f14546a) || !kotlin.jvm.internal.l.a(c0939j0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.l.b(message);
        int hashCode = (this.f14546a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f14546a;
    }
}
